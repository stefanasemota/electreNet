package ch.albertlegrand.gui.model;

import ch.albertlegrand.business.catalogue.DilicomBC;
import ch.albertlegrand.business.utility.validators.ALGValidator;
import ch.albertlegrand.data.model.AlgSystem;
import ch.albertlegrand.service.businesslogic.AlgSystemService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class ExtractionBean {
    private static final Logger LOGGER = Logger.getLogger(ExtractionBean.class);
    @Autowired
    private AlgSystemService algSystemService;
    private String extractionActivityText = "";
    private boolean extractionButtonActive = true;
    private boolean insertionButtionActive = false;
    @Autowired
    private DilicomBC dilicomBC;
    private String text;

    public String dilicomExtract() {
        //get system object
        AlgSystem algSystem = algSystemService.getById(4);
        this.extractionButtonActive = algSystem.isFirstExtraction();
        LOGGER.log(Level.DEBUG, "Connecting to Albert le Grand FTP... " + ALGValidator.returnMilisecondsAsTime(System.currentTimeMillis()));

        //Guard
        if (!algSystem.isFirstExtraction()) {
            this.extractionActivityText = extractionActivityText + "Parsing file...\n";
            LOGGER.log(Level.DEBUG, "Executing Extraction " + ALGValidator.returnMilisecondsAsTime(System.currentTimeMillis()));
            try {
                this.extractionActivityText = extractionActivityText + dilicomBC.executeExtraction(algSystem) + "\n";
                //change flag
                algSystemService.changeExtractionFlag(true, algSystem.getAlgsystemid());
            } catch (Exception ex) {
                this.extractionActivityText = ex.getMessage();
            }
            this.extractionActivityText = extractionActivityText + "Extraction terminated ...\n";
        }else {
           extractionActivityText="Extraction has already being executed";
        }

        return null;
    }

    public boolean isExtractionButtonActive() {
        return extractionButtonActive;
    }

    public boolean isInsertionButtionActive() {
        return insertionButtionActive;
    }

    public String getExtractionActivityText() {
        return extractionActivityText;
    }
}