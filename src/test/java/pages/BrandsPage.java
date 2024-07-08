package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

public class BrandsPage {
    private WebDriver driver;
    private SeleniumUtils seleniumUtils;

    /**
     * Constructor to initialize the BrandsPage with a WebDriver instance.
     *
     * @param driver the WebDriver instance used to drive the browser
     */
    public BrandsPage() {
        this.driver = Driver.getDriver(); // gets WebDriver instance from the singleton Driver class
        this.seleniumUtils = new SeleniumUtils(); // Creates an instance of SeleniumUtils to use for web actions
        PageFactory.initElements(driver, this); // Initializes the WebElements using PageFactory
    }

    @FindBy(xpath = "//nav/div[3]/div/div/a[1]")
    public WebElement clickBrandsShopAll;

    @FindBy(css = "h1  span")
    public WebElement brandsTitle;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[2]/span/text())[1]")
    public WebElement activeICELink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[3]/span/text())[1]")
    public WebElement microbanLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[4]/span/text())[1]")
    public WebElement momentumLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[5]/span/text())[1]")
    public WebElement simplySoftLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[6]/span/text())[1]")
    public WebElement medlineOTCHearingAidsLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[7]/span/text())[1]")
    public WebElement curadLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[8]/span/text())[1]")
    public WebElement fitRightLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[9]/span/text())[1]")
    public WebElement fitRightFreshStartLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[10]/span/text())[1]")
    public WebElement remedySkincareLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[11]/span/text())[1]")
    public WebElement medlineDrypadUnderPadsLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[12]/span/text())[1]")
    public WebElement byACRELink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[13]/span/text())[1]")
    public WebElement aveScrubsLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[14]/span/text())[1]")
    public WebElement angelStatScrubsLink;


    @FindBy(xpath = "(//nav/div[3]/div/div/a[15]/span/text())[1]")
    public WebElement comfortEaseScrubsLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[16]/span/text())[1]")
    public WebElement perforMaxScrubsLink;

    @FindBy(xpath = "(//nav/div[3]/div/div/a[17]/span/text())[1]")
    public WebElement marthaStewartLink;

    /**
     * Clicks on the "Brands Shop All" link.
     */
    public void clickBrandsShopAll() {
        seleniumUtils.click(driver, clickBrandsShopAll);
    }

    /**
     * Retrieves the title of the Brands page.
     *
     * @return the title of the Brands page as a String
     */
    public String getBrandsTitle() {
        return seleniumUtils.getText(brandsTitle);
    }

    /**
     * Clicks on the "Active ICE" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyActiveICELink() {
        if (seleniumUtils.isDisplayed(driver, activeICELink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Microban" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyMicrobanLink() {
        if (seleniumUtils.isDisplayed(driver, microbanLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Momentum" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyMomentumLink() {
        if (seleniumUtils.isDisplayed(driver, momentumLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Simply Soft" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */

    public boolean verifySimplySoftLink() {
        if (seleniumUtils.isDisplayed(driver, simplySoftLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Medline OTC Hearing Aids" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */

    public boolean verifyMedlineOTCHearingAidsLink() {
        if (seleniumUtils.isDisplayed(driver, medlineOTCHearingAidsLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Curad" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyCuradLink() {
        if (seleniumUtils.isDisplayed(driver, curadLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "FitRight" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */

    public boolean verifyFitRightLink() {
        if (seleniumUtils.isDisplayed(driver, fitRightLink)) {
            return true;
        }
        return false;
    }


    /**
     * Clicks on the "FitRight Fresh Start" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyFitRightFreshStartLink() {
        if (seleniumUtils.isDisplayed(driver, fitRightFreshStartLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Remedy Skincare" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyRemedySkincareLink() {
        if (seleniumUtils.isDisplayed(driver, remedySkincareLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Medline Drypad Underpads " link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */

    public boolean verifyMedlineDrypadUnderPadsLink() {
        if (seleniumUtils.isDisplayed(driver, medlineDrypadUnderPadsLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "byACRE" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyByACRELink() {
        if (seleniumUtils.isDisplayed(driver, byACRELink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "AVE Scrubs" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyAveScrubsLink() {
        if (seleniumUtils.isDisplayed(driver, aveScrubsLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "AngelStat Scrubs" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyAngelStatScrubsLink() {
        if (seleniumUtils.isDisplayed(driver, angelStatScrubsLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Comfort Ease Scrubs" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyComfortEaseScrubsLink() {
        if (seleniumUtils.isDisplayed(driver, comfortEaseScrubsLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "PerforMAX Scrubs" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyPerforMaxScrubsLink() {
        if (seleniumUtils.isDisplayed(driver, perforMaxScrubsLink)) {
            return true;
        }
        return false;
    }

    /**
     * Clicks on the "Martha Stewart" link if it is present.
     *
     * @return true if the link was clicked, false otherwise
     */
    public boolean verifyMarthaStewartLink() {
        if (seleniumUtils.isDisplayed(driver, marthaStewartLink)) {
            return true;
        }
        return false;
    }

}
