package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

public class MedlineAtHomePage {

    private WebDriver driver;
    private SeleniumUtils seleniumUtils;

    /**
     * Constructor to initialize the ProductPage with a WebDriver instance.
     *
     * @param driver the WebDriver instance used to drive the browser
     */
    public MedlineAtHomePage() {
        this.driver = Driver.getDriver(); // gets WebDriver instance from the singleton Driver class
        this.seleniumUtils = new SeleniumUtils(); // Creates an instance of SeleniumUtils to use for web actions
        PageFactory.initElements(driver, this); // Initializes the WebElements using PageFactory
    }

    @FindBy(css = " div:nth-child(1) >span > a")
    public WebElement productsDropdown;

    @FindBy(xpath = "(//a[@title ='Shop By Need'])[2]")
    public WebElement shopByNeedDropdown;

    @FindBy(css = "div:nth-child(3) > span > a")
    public WebElement brandsDropdown;

    public boolean clickProductsDropdown() {
        if (seleniumUtils.isDisplayed(driver, productsDropdown)) {
            seleniumUtils.click(driver, productsDropdown);
            return true;
        }
        return false;
    }

    public boolean clickShopByNeedDropdown() {
        if (seleniumUtils.isDisplayed(driver, shopByNeedDropdown)) {
            seleniumUtils.click(driver, shopByNeedDropdown);
            return true;
        }
        return false;
    }

    public boolean clickBrandsDropdown() {
        if (seleniumUtils.isDisplayed(driver, brandsDropdown)) {
            seleniumUtils.click(driver, brandsDropdown);
            return true;
        }
        return false;
    }


}
