package ch.albertlegrand.business.catalogue.impl;

import ch.albertlegrand.business.bc.ScrapBookBC;
import ch.albertlegrand.business.catalogue.DilicomBC;
import ch.albertlegrand.business.utility.DilicomFile;
import ch.albertlegrand.business.utility.DilicomGridPosition;
import ch.albertlegrand.business.utility.StringIterator;
import ch.albertlegrand.business.utility.exceptions.BusinessException;
import ch.albertlegrand.business.utility.impl.DilcomParsedFileComp;
import ch.albertlegrand.business.utility.io.BufferedRandomAccessFile;
import ch.albertlegrand.business.utility.validators.ALGValidator;
import ch.albertlegrand.data.model.AlgOnlineService;
import ch.albertlegrand.data.model.AlgSystem;
import ch.albertlegrand.data.model.FutureUpdate;
import ch.albertlegrand.data.model.ScrapBook;
import ch.albertlegrand.service.businesslogic.AlgOnlineServices;
import ch.albertlegrand.service.businesslogic.BookService;
import ch.albertlegrand.service.businesslogic.FutureUpdateService;
import ch.albertlegrand.service.businesslogic.ScrapBookService;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static ch.albertlegrand.business.utility.validators.ALGValidator.getTodaysDate;

/**
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
public class DilicomBCImpl implements DilicomBC {
    private static final Logger LOGGER = Logger.getLogger(DilicomBC.class);
    private static final String TEST_EXTRACTION_FILE_NAME = "extractionTest";

    public static char MOVEMENT_CODE_EXTRACTION = 'E';
    public static char MOVEMENT_CODE_CREATION = 'C';
    public static char MOVEMENT_CODE_MISE_A_JOUR = 'M';
    public static char MOVEMENT_CODE_DELETION = 'S';

    //Services
    @Autowired
    private ScrapBookService scrapBookService;

    @Autowired
    private BookService bookService;

    @Autowired
    private AlgOnlineServices algOnlineService;

    @Autowired
    private ScrapBookBC scrapBookBC;

    @Autowired
    private FutureUpdateService futureUpdateService;

    private final int BUFFER_SIZE = 5024;

    @Autowired()
    private DilicomFile dilicomFile;


    /**
     * Name of dilicom file to be parsed
     */
    private String dilicomFileName = "";

    /**
     * A list of parsed books to be inserted in a table
     */
    private List<DilcomParsedFileComp> parsedBooksList = new ArrayList<DilcomParsedFileComp>();
    private List<ScrapBook> scrapBookList = new ArrayList<ScrapBook>();
    private String extractionPath;

    @Override
    public void executeDilicomJobs(AlgSystem algSystem) throws IOException {
        AlgOnlineService service = (AlgOnlineService) algOnlineService.getById(2);
        try {
            //get filename
            dilicomFileName = dilicomFile.getLastDownloadedFile(service, algSystem);
            //read file
            long startTime = System.currentTimeMillis();
            LOGGER.log(Level.DEBUG, "Start " + ALGValidator.returnMilisecondsAsTime(startTime));
            readLexeme();
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Error " + e.getMessage());
        }
        LOGGER.log(Level.DEBUG, "Ended Dilicom Extraction, time is " + System.currentTimeMillis());
        //clean up
        // first copy file to ftp server
        AlgOnlineService algService = (AlgOnlineService) algOnlineService.getById((long) 1);
        dilicomFile.copyFileToAlgFtpServer(algService, dilicomFileName);
        //delete local file
        dilicomFile.deleteDilicomFile(dilicomFileName);
    }

    /**
     * Executes an extraction and inserts all data in the scrap book table
     *
     * @param algSystem system variable
     */
    public String executeExtraction(AlgSystem algSystem) {
        String feedbackText = "";
        List<String> fileNames = new ArrayList<String>(1);
        AlgOnlineService service = (AlgOnlineService) algOnlineService.getById(6);
        String filePath;

        filePath = getExtractionPath();
        fileNames.add(filePath + "extr20.txt");
        // fileNames.add(filePath+"extr3FLUX.txt");
        //fileNames.add(filePath+"extrDILICOM1.txt");

        try {
            //get extraction filename
            // dilicomFile.downloadExtractionFiles(service, algSystem, extractionFileNames);
            for (String extractionFile : fileNames) {
                this.dilicomFileName = extractionFile;
                long startTime = System.currentTimeMillis();
                feedbackText = "Started " + ALGValidator.returnMilisecondsAsTime(startTime) + " \n ";
                LOGGER.log(Level.DEBUG, feedbackText);
                feedbackText = feedbackText + readLexeme();
                //logout
                String endTime = ALGValidator.returnMilisecondsAsTime(startTime);
                feedbackText = feedbackText + " Successful! Ended at: " + endTime;
                LOGGER.log(Level.DEBUG, feedbackText);
            }
        } catch (Exception e) {
            feedbackText = e.getMessage();
            LOGGER.log(Level.ERROR, "Error " + e.getMessage());
        }
        //clean up
        // dilicomFile.deleteDilicomFile(dilicomFileName);
        return feedbackText;
    }

    @Override
    public String insertIntoDatabaseAfterSuccessfulExtraction(AlgSystem algSystem) {
        scrapBookBC.addBulkInsertsAfterExtraction();
        return "";
    }

    /**
     * Reads a file as an input stream
     *
     * @throws IOException       file reader
     * @throws BusinessException
     */
    private String readLexeme() throws IOException, BusinessException {
        DilcomParsedFileComp dilcomParsedFileComp = null;
        FileInputStream fileInputStream = null;
        boolean hasNextLine = true;
        String feedbackText = "";
        int lineCount = 0;
        try {
            // Open the file that is the first command line parameter
            fileInputStream = new FileInputStream(dilicomFileName);
            // Get the object of DataInputStream
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
            BufferedRandomAccessFile bufferedRandomAccessFile = new BufferedRandomAccessFile(dilicomFileName, "r", BUFFER_SIZE);
            String strLine;
            ScrapBook parsedBook = null;
            Collection<ScrapBook> bulkCommit = new ArrayList<ScrapBook>();

            //Read File Line By Line
            while (hasNextLine) {
                strLine = bufferedRandomAccessFile.getNextLine();
                if (strLine != null) {
                    //get movement code
                    char movementCode = strLine.charAt(0);
                    //skip first line that has a bad character
                    if (lineCount >= 1 && !StringUtils.isEmpty(strLine)) {
                        if (movementCode == MOVEMENT_CODE_EXTRACTION) {
                            parsedBook = parsedBlock(strLine, 483);
                        } else if (movementCode == MOVEMENT_CODE_CREATION || movementCode == MOVEMENT_CODE_MISE_A_JOUR) {
                            parsedBook = parsedBlock(strLine, 400);
                        } else if (movementCode == MOVEMENT_CODE_DELETION) {
                            parsedBook = parsedBlock(strLine, 26);
                        }

                        //add book to collection via hibernate
                        bulkCommit.add(parsedBook);
                        //commit from time to time
                        if (lineCount % 150 == 0) {
                            //LOGGER.log(Level.DEBUG, "Bulk Commit at " + lineCount);
                            scrapBookService.addCollectionScrapBook(bulkCommit);
                            bulkCommit.clear();
                        }
                    }
                    ++lineCount;
                } else
                    hasNextLine = false;
            }
            //check if bulk list is empty
            if (!bulkCommit.isEmpty()) {
                scrapBookService.addCollectionScrapBook(bulkCommit);
            }
            //Close the input stream
            fileInputStream.close();
            feedbackText = "Total # of lines parsed:" + lineCount;
            LOGGER.log(Level.DEBUG, feedbackText);
        } catch (Exception businessException) {
            //Catch exception and close file input stream
            assert fileInputStream != null;
            fileInputStream.close();
            feedbackText = "Error: RLexeme - " + businessException.getMessage() + " at line count " + lineCount;
            LOGGER.log(Level.ERROR, feedbackText);
            throw new BusinessException(businessException.getMessage());
        }
        return feedbackText;
    }

    /**
     * Checks for all the existing books to be updated. The futureUpdate is being scanned for dates
     *
     * @return a list of updates to be executed
     */
    private List<FutureUpdate> checkForFutureUpdates() {
        Date currentDate = getTodaysDate();
        List<FutureUpdate> futureUpdateList = futureUpdateService.findUpdatesForDate(currentDate);
        return futureUpdateList;
    }

    /**
     * Parses a single line and adds it to the book table
     *
     * @param strLine     line to parse
     * @param endPosition total index position
     * @return a parsed scrap book
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws BusinessException
     */
    private ScrapBook parsedBlock(String strLine, int endPosition) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, BusinessException {
        boolean finishedParsingLine = false;
        ScrapBook scrapBook = null;
        try {
            if (!ALGValidator.IsNullOrEmpty(strLine)) {
                while (!finishedParsingLine) {
                    scrapBook = new ScrapBook();
                    switch (endPosition) {
                        //Extraction!
                        case 483:
                            //read all 5 blocks
                            parseBlockOne(strLine.substring(0, DilicomGridPosition.BLOCK_1_RANGE_27), scrapBook);
                            parseBlockTwo(strLine.substring(DilicomGridPosition.BLOCK_1_RANGE_27, DilicomGridPosition.BLOCK_2_RANGE_94), scrapBook);
                            parseBlockThree(strLine.substring(DilicomGridPosition.BLOCK_2_RANGE_94, 400), scrapBook);
                            parseBlockFour(strLine.substring(401, DilicomGridPosition.BLOCK_4_RANGE_417), scrapBook);
                            parseBlockFive(strLine.substring(DilicomGridPosition.BLOCK_4_RANGE_417, DilicomGridPosition.BLOCK_5_RANGE_484), scrapBook);
                            //what should i read next
                            finishedParsingLine = true;
                            break;

                        case 400:
                            //read first 3 blocks, its an creation or modification
                            parseBlockOne(strLine.substring(0, DilicomGridPosition.BLOCK_1_RANGE_27), scrapBook);
                            parseBlockTwo(strLine.substring(DilicomGridPosition.BLOCK_1_RANGE_27, DilicomGridPosition.BLOCK_2_RANGE_94), scrapBook);
                            parseBlockThree(strLine.substring(DilicomGridPosition.BLOCK_2_RANGE_94, 400), scrapBook);
                            finishedParsingLine = true;
                            break;

                        case 26:
                            //read only first block
                            parseBlockOne(strLine.substring(0, DilicomGridPosition.BLOCK_1_RANGE_27), scrapBook);
                            break;
                    }
                }
            }
        } catch (Exception businessException) {
            LOGGER.log(Level.ERROR, "Error: parsedBlock " + businessException.getMessage());
        }
        return scrapBook;
    }

    /**
     * Parses block one
     *
     * @param content   line content to be parsed
     * @param scrapBook modifies the existing object by setting it values
     */
    private void parseBlockOne(String content, ScrapBook scrapBook) throws BusinessException {
        String item = "";
        int i = 0;
        boolean stopCase = false;

        try {
            for (final char c : new StringIterator(content)) {
                item = item + c;
                switch (i) {
                    case DilicomGridPosition.BLOCK_1_RANGE_27_POS_1:
                        scrapBook.setP01DiliCmovementCode(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_1_RANGE_27_POS_2:
                        scrapBook.setP02DiliCean(item);
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_1_RANGE_27_POS_3:
                        scrapBook.setP03DiliCgencode(Long.parseLong(item));
                        item = "";
                        stopCase = true;
                        break;
                }
                ++i;
            }
        } catch (Exception e) {
            throw new BusinessException("Block 1 " + e.getMessage() + "on Index " + i);
        }
    }

    /**
     * Parses block two
     *
     * @param content   line to parse
     * @param scrapBook modifies object
     */

    private void parseBlockTwo(String content, ScrapBook scrapBook) throws BusinessException {
        String item = "";
        //continue from where the previous block left of!
        int i = 27;// DilicomGridPosition.BLOCK_1_RANGE_27;
        try {
            for (final char c : new StringIterator(content)) {
                item = item + c;
                switch (i) {
                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_4:
                        scrapBook.setP04DiliCdateOfTariffApplicable(ALGValidator.convertDate(item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_5:
                        scrapBook.setP05DiliCavailabilityCode(Integer.parseInt(item));
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_6:
                        scrapBook.setP06DiliCpriceType(Integer.parseInt(item));
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_7:
                        scrapBook.setP07DiliCpriceAndVat(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_8:
                        scrapBook.setP08DiliCdiscountClassification(item);
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_9:
                        scrapBook.setP09DiliCvat1(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_10:
                        scrapBook.setP10DiliCamountTaxExempt1(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_11:
                        scrapBook.setP11DiliCvat2(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_12:
                        scrapBook.setP12DiliCamountTaxExempt2(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_13:
                        scrapBook.setP13DiliCvat3(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_14:
                        scrapBook.setP14DiliCamountTaxExempt3(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_15:
                        scrapBook.setP15DiliCreturnCode(Integer.parseInt(ALGValidator.trimWhiteSpaces(item)));
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_2_RANGE_94_POS_16:
                        scrapBook.setP16DiliCpriceCode(item);
                        item = "";
                        break;
                }
                ++i;
            }
        } catch (Exception e) {
            throw new BusinessException("Block 2 " + e.getMessage() + "on Index " + i);
        }
    }

    /**
     * Parses the block three of a dilicom file
     *
     * @param content   to parse
     * @param scrapBook scrapbook object
     * @throws BusinessException
     */
    private void parseBlockThree(String content, ScrapBook scrapBook) throws BusinessException {
        String item = "";
        //continue from where the previous block left of!
        int i = DilicomGridPosition.BLOCK_2_RANGE_94;
        boolean stopCase = false;
        try {
            for (final char c : new StringIterator(content)) {
                item = item + c;
                switch (i) {
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_17:
                        scrapBook.setP17DiliCdatePublished(ALGValidator.convertDate(item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_18:
                        scrapBook.setP18DiliCtypeProduct(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_19:
                        scrapBook.setP19DiliCdateEndOfCommercialization(ALGValidator.convertDate(item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_20:
                        scrapBook.setP20DiliCwordingStandard(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_21:
                        scrapBook.setP21DiliCwordingCounter(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_22:
                        scrapBook.setP22DiliCstoreDisplay(item);
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_23:
                        scrapBook.setP23DiliCthickness(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_24:
                        scrapBook.setP24DiliCwidth(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_25:
                        scrapBook.setP25DiliCheight(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_26:
                        scrapBook.setP26DiliCweight(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_27:
                        scrapBook.setP27DiliCwordingExtended(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_28:
                        scrapBook.setP28DiliCpublisher(item);
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_29:
                        scrapBook.setP29DiliCcollectionName(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_30:
                        scrapBook.setP30DiliCauthor(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_31:
                        scrapBook.setP31DiliCbinding(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_32:
                        // System.out.println("First ITEM: *" + ALGValidator.trimWhiteSpaces(item)  + "*");
                        scrapBook.setP32DiliCIsbn(ALGValidator.trimWhiteSpaces(item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_33:
                        // System.out.println("ITEM: *" + ALGValidator.trimWhiteSpaces(item) + "*");
                        scrapBook.setP33DiliCbookDistributorReference(ALGValidator.trimWhiteSpaces(item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_34:
                        scrapBook.setP34DiliCserialCollection(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_35:
                        scrapBook.setP35DiliCtheme(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_36:
                        scrapBook.setP36DiliCIsbnPublisher(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_37:
                        scrapBook.setP37DiliClinkingCodes(new Integer(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_38:
                        scrapBook.setP38DiliCeanRelatedProducts(item);
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_39:
                        scrapBook.setP39DiliCcommandableUnit(new Integer(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_40:
                        scrapBook.setP40DiliCjointSalesPackage(new Integer(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_41:
                        scrapBook.setP41DiliCsymbolization(new Integer(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_42:
                        scrapBook.setP42DiliCuniqueOrMultitpleDistribution(new Integer(StringUtils.isBlank(item) ? "0" : item));
                        item = "";
                        break;
                    case DilicomGridPosition.BLOCK_3_RANGE_401_POS_43:
                        scrapBook.setP43DiliCnumberOfReference(new Integer(StringUtils.isBlank(item) ? "0" : ALGValidator.trimWhiteSpaces(item)));
                        item = "";
                        stopCase = true;
                }
                ++i;
            }
        } catch (Exception e) {
            throw new BusinessException("Block 3 " + e.getMessage() + "on Index " + i);
        }
    }

    /**
     * Parses block four of a dilicom file, the parsed contents are saved to the variable scrapbook
     *
     * @param content   line to parse
     * @param scrapBook scrapbook object
     */
    private void parseBlockFour
    (String
             content, ScrapBook
            scrapBook) throws BusinessException {
        String item = "";
        //continue from where the previous block left of!
        int i = 401;
        try {
            for (final char c : new StringIterator(content)) {
                item = item + c;
                switch (i) {
                    case DilicomGridPosition.BLOCK_4_RANGE_417_POS_44:
                        scrapBook.setP44DiliCdateOfCreation(ALGValidator.convertDate(item));
                        //  System.out.println("FIRST ITEM: " + item + " WITH POS " + i);
                        item = "";
                        break;

                    case DilicomGridPosition.BLOCK_4_RANGE_417_POS_45:
                        scrapBook.setP45DiliCdateOfLastModification(ALGValidator.convertDate(item));
                        item = "";
                        break;
                }
                ++i;
            }
        } catch (Exception e) {
            throw new BusinessException("Block 4 " + e.getMessage() + "on Index " + i);
        }
    }

    /**
     * Parses the block five of a dilicom file
     *
     * @param content   line content to parse
     * @param scrapBook scrapbook object
     * @throws BusinessException
     */
    private void parseBlockFive(String content, ScrapBook scrapBook) throws BusinessException {
        String item = "";
        //continue from where the previous block left of!
        int i = DilicomGridPosition.BLOCK_4_RANGE_417;
        try {
            if (!StringUtils.isBlank(content)) {
                for (final char c : new StringIterator(content)) {
                    item = item + c;
                    switch (i) {
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_46:
                            scrapBook.setP46DiliCfuDateOfTariffApplicable(ALGValidator.convertDate(item));
                            item = "";
                            break;

                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_47:
                            scrapBook.setP47DiliCfuAvailabilityCode(new Integer(StringUtils.isBlank(item) ? "0" : item));
                            item = "";
                            break;
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_48:
                            scrapBook.setP48DiliCfuPriceType(new Integer(StringUtils.isBlank(item) ? "0" : item));
                            item = "";
                            break;
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_49:
                            scrapBook.setP49DiliCfuPriceAndVat(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                            item = "";
                            break;
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_50:
                            scrapBook.setP50DiliCfuDiscountClassification(item);
                            item = "";
                            break;
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_51:
                            scrapBook.setP51DiliCfuVat1(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                            item = "";
                            break;
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_52:
                            scrapBook.setP52DiliCfuAmountTaxExempt1(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                            item = "";
                            break;
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_53:
                            scrapBook.setP53DiliCfuVat2(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                            item = "";
                            break;
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_54:
                            scrapBook.setP54DiliCfuAmountTaxExempt2(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                            item = "";
                            break;
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_55:
                            scrapBook.setP55DiliCfuVat3(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                            item = "";
                            break;
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_56:
                            scrapBook.setP56DiliCfuAmountTaxExempt3(Double.valueOf(StringUtils.isBlank(item) ? "0" : item));
                            item = "";
                            break;
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_57:
                            scrapBook.setP57DiliCfuReturnCode(new Integer(StringUtils.isBlank(item) ? "0" : item));
                            item = "";
                            break;
                        case DilicomGridPosition.BLOCK_5_RANGE_484_POS_58:
                            scrapBook.setP58DiliCfuPriceCode(item);
                            item = "";
                            break;
                    }
                    ++i;
                }
            }
        } catch (Exception e) {
            throw new BusinessException("Block 5 " + e.getMessage() + "on Index " + i);
        }
    }

    public void setExtractionPath(String extractionPath) {
        this.extractionPath = extractionPath;
    }

    public String getExtractionPath() {
        return extractionPath;
    }
}