package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

public class HomePage {
    private WebDriver driver;
    private SeleniumUtils seleniumUtils;

    /**
     * Constructor to initialize the ProductPage with a WebDriver instance.
     *
     * @param driver the WebDriver instance used to drive the browser
     */
    public HomePage() {
        this.driver = Driver.getDriver(); // gets WebDriver instance from the singleton Driver class
        this.seleniumUtils = new SeleniumUtils(); // Creates an instance of SeleniumUtils to use for web actions
        PageFactory.initElements(driver, this); // Initializes the WebElements using PageFactory
    }

    @FindBy(xpath = "//div[1]/h1/text()")
    public WebElement medlineHomePageTitle;

    @FindBy(css = "jsx-4088137131 desktopWrapper")
    public WebElement homePageMenu;

    @FindBy(xpath = "//div[3]/div[2]/div/a/h2")
    public WebElement clickMedlineAtHomeMenu;

    @FindBy(css = "p  span.title3")
    public WebElement womensHealthAndWellBeingTitle;

    /**
     * Retrieves the title text of the Medline Home Page.
     *
     * @return the title of the Medline Home Page as a String
     */
    public String getMedlineHomePageTitle() {
        return seleniumUtils.getText(medlineHomePageTitle);
    }

    /**
     * Clicks on the Home Page menu.
     */
    public void clickHomePageMenu() {
        seleniumUtils.click(driver, homePageMenu);
    }

    /**
     * Clicks on the "Medline at Home" menu.
     */
    public void clickMedlineAtHomeMenu() {
        seleniumUtils.click(driver, clickMedlineAtHomeMenu);
    }

    /**
     * Retrieves the title text of the Women's Health and Well-being section.
     *
     * @return the title of the Women's Health and Well-being section as a String
     */
    public String getWomensHealthAndWellBeingTitle() {
        return seleniumUtils.getText(womensHealthAndWellBeingTitle);
    }


}
