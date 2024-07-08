package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

public class ShopByNeedsPage {

    private WebDriver driver;
    private SeleniumUtils seleniumUtils;
    /**

     Constructor to initialize the ProductPage with a WebDriver instance.
     @param driver the WebDriver instance used to drive the browser
     */
    public ShopByNeedsPage() {
        this.driver = Driver.getDriver(); // gets WebDriver instance from the singleton Driver class
        this.seleniumUtils = new SeleniumUtils(); // Creates an instance of SeleniumUtils to use for web actions
        PageFactory.initElements(driver, this); // Initializes the WebElements using PageFactory
    }

    @FindBy (xpath = "//nav/div[2]/div/div/a[1]")
    public WebElement clickShopByNeedsShopAll;

    @FindBy (css = "h1  span")
    public WebElement shopByNeedTitle;


    @FindBy (xpath = "(//nav/div[2]/div/div/a[2]/span/text())[1]")
    public WebElement maintainMobilityLink;

    @FindBy (xpath = "(//nav/div[2]/div/div/a[3]/span/text())[1]")
    public WebElement continenceCareLink;

    @FindBy (xpath = "(//nav/div[2]/div/div/a[4]/span/text())[1]")
    public WebElement momAndBabyCareLink;

    @FindBy (xpath = "(//nav/div[2]/div/div/a[5]/span/text())[1]")
    public WebElement woundCareLink;

    @FindBy (xpath = "(//nav/div[2]/div/div/a[6]/span/text())[1]")
    public WebElement hearingLossLink;

    @FindBy (xpath = "(//nav/div[2]/div/div/a[7]/span/text())[1]")
    public WebElement diabetesEducationLink;

    @FindBy (xpath = "(//nav/div[2]/div/div/a[8]/span/text())[1]")
    public WebElement stopSmokingLink;

    @FindBy (xpath = "(//nav/div[2]/div/div/a[9]/span/text())[1]")
    public WebElement physicalTherapyAndRehabLink;

    @FindBy (xpath = "(//nav/div[2]/div/div/a[10]/span/text())[1]")
    public WebElement sinusAllergiesHeadacheLink;

    @FindBy (xpath = "(//nav/div[2]/div/div/a[11]/span/text())[1]")
    public WebElement backPainLink;

    @FindBy (xpath = "(//nav/div[2]/div/div/a[12]/span/text())[1]")
    public WebElement skinHealthLink;

    @FindBy (xpath = "(//nav/div[2]/div/div/a[13]/span/text())[1]")
    public WebElement arthritisLink;


    public void clickShopByNeedsShopAll(){
        seleniumUtils.click(driver, clickShopByNeedsShopAll);
    }

    /**
     * Clicks on the "Maintain Mobility" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyMaintainMobilityLink(){
        if (seleniumUtils.isDisplayed(driver, maintainMobilityLink)){
            return true;
        }
        return false;
    }

    public String getShopByNeedsTitle(){
        return seleniumUtils.getText(shopByNeedTitle);
    }

    /**
     * Clicks on the "Continence Care" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyContinenceCareLink(){
        if (seleniumUtils.isDisplayed(driver, continenceCareLink)){
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Mom and Baby Care" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyMomAndBabyCareLink(){
        if (seleniumUtils.isDisplayed(driver, momAndBabyCareLink)){
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Wound Care" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyWoundCareLink(){
        if (seleniumUtils.isDisplayed(driver, woundCareLink)){
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Hearing Loss" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyHearingLossLink(){
        if (seleniumUtils.isDisplayed(driver, hearingLossLink)){
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Diabetes Education" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyDiabetesEducationLink(){
        if (seleniumUtils.isDisplayed(driver, diabetesEducationLink)){
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Stop Smoking" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyStopSmokingLink(){
        if (seleniumUtils.isDisplayed(driver, stopSmokingLink)){
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Physical Therapy and Rheb" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyPhysicalTherapyAndRehabLink(){
        if (seleniumUtils.isDisplayed(driver, physicalTherapyAndRehabLink)){
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Sinus Allergies Headache" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifySinusAllergiesHeadacheLink(){
        if (seleniumUtils.isDisplayed(driver, sinusAllergiesHeadacheLink)){
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Back Pain" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyBackPainLink(){
        if (seleniumUtils.isDisplayed(driver, backPainLink)){
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Skin Health" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifySkinHealthLink(){
        if (seleniumUtils.isDisplayed(driver, skinHealthLink)){
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Arthritis" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyArthritisLink(){
        if (seleniumUtils.isDisplayed(driver, arthritisLink)){
            return true;
        }
        return false;
    }

}
