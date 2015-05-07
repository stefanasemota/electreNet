package ch.albertlegrand.business.utility.validators;

import ch.albertlegrand.business.utility.ALGSearchTerm;
import org.apache.commons.lang.StringUtils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Provides basic utility methods for a validator
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 30.08.11
 * Time: 13:26
 * To change this template use File | Settings | File Templates.
 */
public class ALGValidator implements Validator {
    public enum ISBNnum {

        SIZE(13);
        private final int value;

        ISBNnum(int number) {
            this.value = number;
        }
    }

    public static String returnMilisecondsAsTime(long length) {
        //
        // Create a DateFormatter object for displaying date information.
        //
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SSS");

        //
        // Get date and time information in milliseconds
        //
        long now = System.currentTimeMillis();

        //
        // Create a calendar object that will convert the date and time value
        // in milliseconds to date. We use the setTimeInMillis() method of the
        // Calendar object.
        //
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(now);
        return formatter.format(calendar.getTime());
    }

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

    }

    /**
     * Checks if a string contains only numbers. EAN sequence should only contain numbers
     *
     * @param string integer string sequence
     * @return boolean
     */
    public static boolean containsOnlyNumbers(String string) {
        if (string == null || string.length() == 0)
            return false;

        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i)))
                return false;
        }
        return true;
    }

    /**
     * This method cleans the search object / item by adding swapping #32 with the % value
     *
     * @param searchItem item to search for
     * @return a modified search item
     */
    public static String cleanSearchItem(ALGSearchTerm searchItem) {
        String serchterm = searchItem.getSearchTerm();
        String result = "";
        if (org.springframework.util.StringUtils.hasLength(serchterm)) {
            result = serchterm.replaceAll(" ", "%");
        }
        return result;
    }

    /**
     * Checks if a string is null or empty
     *
     * @param stringVar the string
     * @return boolean
     */
    public static boolean IsNullOrEmpty(String stringVar) {
        return (stringVar != null) && StringUtils.isEmpty(stringVar);
    }

    /**
     * Converts the string date to a correct formatted date
     *
     * @param stringDate a date
     * @return a converted date
     */
    public static synchronized Date convertDate(String stringDate) {
        Date date = createDefaultDate();
        //if blank create a default date of 1970
        if (StringUtils.isBlank(stringDate) || StringUtils.isEmpty(stringDate)) {
            return date;
        }
        String newValue = induceDilimeterInString(stringDate);
        return Date.valueOf(newValue);
    }

    /**
     * Converts a html content to string
     *
     * @return String
     */
    public static String convertHtmlToString(String content) {
        String string = null;
        if (StringUtils.isNotEmpty(content))
            return "Not description";

        BufferedReader bufferedReader = new BufferedReader(new StringReader(content));
        StringBuffer stringBuffer = new StringBuffer("<p></p>");
        try {
            string = bufferedReader.readLine();
            while (string != null) {
                if (string.equalsIgnoreCase("</u>")) {
                    string = "<u>";
                }
                stringBuffer.append(string);

                if (string.equalsIgnoreCase("<u>")) {
                    string = "<u>";
                }
                string = bufferedReader.readLine();

            }
        } catch (IOException io) {

        }
        return string;

    }

    /**
     * Trims the white spaces of a string
     *
     * @param s string
     * @return trimmed string
     */
    public static synchronized String trimWhiteSpaces(String s) {
        String result = "0";
        String string = "";
        if (!IsNullOrEmpty(s)) {
            string = StringUtils.trim(s);
        }
        if (string.length() > 0)
            return string;
        else return result;
    }

    /**
     * creates a default date to 1970
     *
     * @return a date in SQL form
     */
    private static Date createDefaultDate() {
        Calendar cal = Calendar.getInstance();
        // set Date portion to January 1, 1970
        cal.set(Calendar.YEAR, 1970);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DATE, 1);

        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return new Date(cal.getTime().getTime());

    }

    /**
     * Creates a date object of the current instance
     *
     * @return date
     */
    public static Date getTodaysDate() {
        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter =
                new SimpleDateFormat("yyyy/MMM/dd");
        return Date.valueOf(formatter.format(currentDate));
    }

    /**
     * adds a delimiter to the date string
     *
     * @param st date string yyyyMMdd format
     * @return string yyyy-MM-dd
     */
    private static String induceDilimeterInString(String st) {
        return st.substring(0, 4) + "-" + st.substring(4, 6) + "-" + st.substring(6, 8);
    }

    /**
     * Check if isbn has a valid length
     *
     * @param number isbn as string
     * @return value
     */
    public static boolean checkISBN10(String number) {
        if (number.length() != 10) {
            return false;
        }
        int total = 0;
        for (int i = 0; i < 9; i++) {
            char c = number.charAt(i);
            int digit = Character.digit(c, 10);
            total += (10 - i) * digit;
        }
        int checksum = Character.digit(number.charAt(9), 10);
        int modulo = total % 11;
        return modulo == 11 - checksum;
    }

    public static boolean checkEan(String eanCode) {
        // Check if only digits
        String ValidChars = "0123456789";
        char digit;
        for (int i = 0; i < eanCode.length(); i++) {
            digit = eanCode.charAt(i);
            if (ValidChars.indexOf(digit) == -1) {
                return false;
            }
        }

        // Add five 0 if the code has only 8 digits
        if (eanCode.length() == 8) {
            eanCode = "00000" + eanCode;
        }
        // Check for 13 digits otherwise
        else if (eanCode.length() != 13) {
            return false;
        }

        // Get the check number
        Integer originalCheck = Integer.valueOf(eanCode.substring(eanCode.length() - 1));
        eanCode = eanCode.substring(0, eanCode.length() - 1);

        // Add even numbers together
        Integer even = Integer.valueOf(eanCode.charAt(1)) +
                Integer.valueOf(eanCode.charAt(3)) +
                Integer.valueOf(eanCode.charAt(5)) +
                Integer.valueOf(eanCode.charAt(7)) +
                Integer.valueOf(eanCode.charAt(9)) +
                Integer.valueOf(eanCode.charAt(11));
        // Multiply this result by 3
        even *= 3;

        // Add odd numbers together
        Integer odd = Integer.valueOf(eanCode.charAt(0)) +
                Integer.valueOf(eanCode.charAt(2)) +
                Integer.valueOf(eanCode.charAt(4)) +
                Integer.valueOf(eanCode.charAt(6)) +
                Integer.valueOf(eanCode.charAt(8)) +
                Integer.valueOf(eanCode.charAt(10));

        // Add two totals together
        Integer total = even + odd;

        // Calculate the checksum
        // Divide total by 10 and store the remainder
        Integer checksum = total % 10;
        // If result is not 0 then take away 10
        if (checksum != 0) {
            checksum = 10 - checksum;
        }

        // Return the result
        if (checksum != originalCheck) {
            return false;
        }
        return true;
    }

    public static boolean checkISBN13(String isbnNo) {
        int checkSum = 0;  // initialize
        int digit = 0;  // holds each digit copied from string

        String isbnNumber = isbnNo.replaceAll("-", "");  // remove all hyphens

        // do we have 13 characters?
        if (isbnNumber.length() != ISBNnum.SIZE.value) {
            return false;
        }

        //now compute the checkSum
        for (int i = 0; i < ISBNnum.SIZE.value; i++) {
            if (Character.isDigit(isbnNumber.charAt(i))) {
                digit = Character.digit(isbnNumber.charAt(i), 10);

                if (i % 2 == 1) {
                    digit *= 3;
                }

                checkSum += digit;
            } else {
                return false;
            }
        }

        // should be modulo 10
        if (checkSum % 10 == 0) {
            return true;
        }

        return false;
    }
}
