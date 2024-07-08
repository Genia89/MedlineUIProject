package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;


public class ProductsPage {

    private WebDriver driver;
    private SeleniumUtils seleniumUtils;

    /**
     * Constructor to initialize the ProductPage with a WebDriver instance.
     *
     * @param driver the WebDriver instance used to drive the browser
     */
    public ProductsPage() {
        this.driver = Driver.getDriver(); // gets WebDriver instance from the singleton Driver class
        this.seleniumUtils = new SeleniumUtils(); // Creates an instance of SeleniumUtils to use for web actions
        PageFactory.initElements(driver, this); // Initializes the WebElements using PageFactory
    }

    @FindBy(xpath = "//div[2]/div/nav/div[1]/div/div[1]/a[1]")
    public WebElement clickProductsShopAll;

    @FindBy(css = ".base")
    public WebElement productTitle;

    @FindBy(xpath = "(//a[2]/span/text())[1]")
    public WebElement advancedWoundCareLink;

    @FindBy(xpath = "//div/nav/div[1]/div/div[2]/button/span")
    public WebElement advancedWoundCareLinkBackBtn;

    @FindBy(xpath = "(//a[3]/span/text())[1]")
    public WebElement diabetesCareLink;

    @FindBy(xpath = "//div/nav/div[1]/div/div[3]/button/span")
    public WebElement diabetesCareLinkBackBtn;

    @FindBy(xpath = "(//a[4]/span/text())[1]")
    public WebElement firstAidLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[4]/button/span")
    public WebElement firstAidLinkBackBtn;

    @FindBy(xpath = "(//a[5]/span/text())[1]")
    public WebElement hearingAidsAndAmplifiersLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[5]/button/span")
    public WebElement hearingAidsAndAmplifiersLinkBackBtn;

    @FindBy(xpath = "(//a[6]/span/text())[1]")
    public WebElement homeDiagnosticsLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[6]/button/span")
    public WebElement homeDiagnosticsLinkBackBtn;

    @FindBy(xpath = "(//a[7]/span/text())[1]")
    public WebElement homeHealthCareLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[7]/button/span")
    public WebElement homeHealthCareLinkBackBtn;

    @FindBy(xpath = "(//a[8]/span/text())[1]")
    public WebElement incontinenceLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[8]/button/span")
    public WebElement incontinenceLinkBackBtn;

    @FindBy(xpath = "(//a[9]/span/text())[1]")
    public WebElement medicationsOverTheCounterLink;

    @FindBy(xpath = "//div/nav/div[1]/div/div[9]/button/span")
    public WebElement medicationsOverTheCounterLinkBackBtn;
    @FindBy(xpath = "(//a[10]/span/text())[1]")
    public WebElement mobilityLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[10]/button/span")
    public WebElement mobilityLinkBackBtn;

    @FindBy(xpath = "(//a[11]/span/text())[1]")
    public WebElement momAndBabyCareLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[11]/button/span")
    public WebElement momAndBabyCareLinkBackBtn;

    @FindBy(xpath = "(//a[12]/span/text())[1]")
    public WebElement nutritionLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[12]/button/span")
    public WebElement nutritionLinkBackBtn;

    @FindBy(xpath = "(//a[13]/span/text())[1]")
    public WebElement ostomyAndUrologySupplyLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[13]/button/span")
    public WebElement ostomyAndUrologySupplyLinkBackBtn;

    @FindBy(xpath = "(//a[14]/span/text())[1]")
    public WebElement personalCareLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[14]/button/span")
    public WebElement personalCareLinkBackBtn;

    @FindBy(xpath = "(//a[15]/span/text())[1]")
    public WebElement physicalCareLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[15]/button/span")
    public WebElement physicalCareLinkBackBtn;

    @FindBy(xpath = "(//a[16]/span/text())[1]")
    public WebElement protectionWearLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[16]/button/span")
    public WebElement protectionWearLinkBackBtn;

    @FindBy(xpath = "(//a[17]/span/text())[1]")
    public WebElement respiratoryLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[17]/button/span")
    public WebElement respiratoryLinkBackBtn;

    @FindBy(xpath = "(//a[18]/span/text())[1]")
    public WebElement scrubsLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[18]/button/span")
    public WebElement scrubsLinkBackBtn;

    @FindBy(xpath = "(//a[19]/span/text())[1]")
    public WebElement surgicalSuppliesLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[19]/button/span")
    public WebElement surgicalSuppliesLinkBackBtn;

    @FindBy(xpath = "(//a[20]/span/text())[1]")
    public WebElement vitaminsAndSupplementsLink;
    @FindBy(xpath = "//div/nav/div[1]/div/div[20]/button/span")
    public WebElement vitaminsAndSupplementsLinkBackBtn;



    public String getProductTitle() {
        return seleniumUtils.getText(productTitle);

    }

    public void clickProductsShopAll() {
        seleniumUtils.click(driver, clickProductsShopAll);
    }

    /**
     * Clicks on the "Advanced Wound Care" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyAdvancedWoundCareLink() {
        if (seleniumUtils.isDisplayed(driver, advancedWoundCareLink)) {
            seleniumUtils.click(driver, advancedWoundCareLink);
            seleniumUtils.click(driver, advancedWoundCareLinkBackBtn);
            return true;
        }
        return false;
    }



    /**
     * Clicks on the "Diabetes Care" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */

    public boolean verifyDiabetesCareLink() {
        if (seleniumUtils.isDisplayed(driver, diabetesCareLink)) {
            seleniumUtils.click(driver, diabetesCareLink);
            seleniumUtils.click(driver, diabetesCareLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "First Aid" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyFirstAidLink() {
        if (seleniumUtils.isDisplayed(driver, firstAidLink)) {
            seleniumUtils.click(driver, firstAidLink);
            seleniumUtils.click(driver, firstAidLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Hearing Aids and Amplifiers" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyHearingAidsAndAmplifiersLink() {
        if (seleniumUtils.isDisplayed(driver, hearingAidsAndAmplifiersLink)) {
            seleniumUtils.click(driver, hearingAidsAndAmplifiersLink);
            seleniumUtils.click(driver, hearingAidsAndAmplifiersLinkBackBtn );
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Home Diagnostics" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyHomeDiagnosticsLink() {
        if (seleniumUtils.isDisplayed(driver, homeDiagnosticsLink)) {
            seleniumUtils.click(driver, homeDiagnosticsLink);
            seleniumUtils.click(driver, homeDiagnosticsLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Home Health Care" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyHomeHealthCareLink() {
        if (seleniumUtils.isDisplayed(driver, homeHealthCareLink)) {
            seleniumUtils.click(driver, homeHealthCareLink);
            seleniumUtils.click(driver, homeHealthCareLinkBackBtn);
            return true;
        }
        return false;
    }


    /**
     * Clicks on the "Incontinence" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyIncontinenceLink() {
        if (seleniumUtils.isDisplayed(driver, incontinenceLink)) {
            seleniumUtils.click(driver, incontinenceLink);
            seleniumUtils.click(driver, incontinenceLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Medications Over the Counter" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyMedicationsOverTheCounterLink() {
        if (seleniumUtils.isDisplayed(driver, medicationsOverTheCounterLink)) {
            seleniumUtils.click(driver, medicationsOverTheCounterLink);
            seleniumUtils.click(driver,medicationsOverTheCounterLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Mobility" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyMobilityLink() {
        if (seleniumUtils.isDisplayed(driver, mobilityLink)) {
            seleniumUtils.click(driver, mobilityLink);
            seleniumUtils.click(driver,mobilityLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Mom and Baby Care" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyMomAndBabyCareLink() {
        if (seleniumUtils.isDisplayed(driver, momAndBabyCareLink)) {
            seleniumUtils.click(driver, momAndBabyCareLink);
            seleniumUtils.click(driver,momAndBabyCareLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Nutrition" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyNutritionLink() {
        if (seleniumUtils.isDisplayed(driver, nutritionLink)) {
            seleniumUtils.click(driver, nutritionLink);
            seleniumUtils.click(driver, nutritionLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Ostomy and Urology Supply" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyOstomyAndUrologySupplyLink() {
        if (seleniumUtils.isDisplayed(driver, ostomyAndUrologySupplyLink)) {
            seleniumUtils.click(driver, ostomyAndUrologySupplyLink);
            seleniumUtils.click(driver,ostomyAndUrologySupplyLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Personal Care" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyPersonalCareLink() {
        if (seleniumUtils.isDisplayed(driver, personalCareLink)) {
            seleniumUtils.click(driver, personalCareLink);
            seleniumUtils.click(driver, personalCareLinkBackBtn);
            return true;
        }
        return false;
    }


    /**
     * Clicks on the "Physical Care" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyPhysicalCareLink() {
        if (seleniumUtils.isDisplayed(driver, physicalCareLink)) {
            seleniumUtils.click(driver, physicalCareLink);
            seleniumUtils.click(driver, physicalCareLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Protection Wear" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyProtectionWearLink() {
        if (seleniumUtils.isDisplayed(driver, protectionWearLink)) {
            seleniumUtils.click(driver, protectionWearLink);
            seleniumUtils.click(driver, protectionWearLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Respiratory" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyRespiratoryLink() {
        if (seleniumUtils.isDisplayed(driver, respiratoryLink)) {
            seleniumUtils.click(driver, respiratoryLink);
            seleniumUtils.click(driver, respiratoryLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Scrubs" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyScrubsLink() {
        if (seleniumUtils.isDisplayed(driver, scrubsLink)) {
            seleniumUtils.click(driver, scrubsLink);
            seleniumUtils.click(driver, scrubsLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Surgical Supplies" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifySurgicalSuppliesLink() {
        if (seleniumUtils.isDisplayed(driver, surgicalSuppliesLink)) {
            seleniumUtils.click(driver, surgicalSuppliesLink);
            seleniumUtils.click(driver, surgicalSuppliesLinkBackBtn);
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Vitamins and Supplements" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyVitaminsAndSupplementsLink() {
        if (seleniumUtils.isDisplayed(driver, vitaminsAndSupplementsLink)) {
            seleniumUtils.click(driver, vitaminsAndSupplementsLink);
            seleniumUtils.click(driver, vitaminsAndSupplementsLinkBackBtn);
            return true;
        }
        return false;
    }


}
