package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

public class SearchPage {

    private WebDriver driver;
    private SeleniumUtils seleniumUtils;

    /**
     * Constructor to initialize the ProductPage with a WebDriver instance.
     *
     * @param driver the WebDriver instance used to drive the browser
     */
    public SearchPage() {
        this.driver = Driver.getDriver(); // gets WebDriver instance from the singleton Driver class
        this.seleniumUtils = new SeleniumUtils(); // Creates an instance of SeleniumUtils to use for web actions
        PageFactory.initElements(driver, this); // Initializes the WebElements using PageFactory
    }

    @FindBy(css = ".relative #search")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[1]/div[2]/h2/a)[1]")
    public WebElement clickOnFirstProduct;

    @FindBy(css = "#product-info-wrapper > div > h1")
    public WebElement verifyTitle;

    @FindBy(css = "#product-addtocart-button > span")
    public WebElement addToCart;

    @FindBy(css = "#qty[20105]")
    public WebElement quantity;

    @FindBy(css = "#menu-cart-icon > svg > path")
    public WebElement clickShoppingCart;

    @FindBy(css = "//td[1]/div/strong/a")
    public WebElement checkProductInCart;

    @FindBy(xpath = "(//*[@class='cart-price'])[1]")
    public WebElement unitPrice;

    @FindBy(css = "#selectcart13535752qty")
    public WebElement quantityInCart;

    @FindBy(xpath = "(//*[@class='cart-price'])[2]")
    public WebElement subtotal;

    @FindBy(css = ".cart.main.actions  a")
    public WebElement continueShoppingBtn;

    public void enterText(String text) {
        seleniumUtils.type(searchBox, text + Keys.ENTER);
    }

    public void clickOnSearchResult() {
        seleniumUtils.click(driver, clickOnFirstProduct);
    }

    public boolean getSearchResultTitle() {
        return seleniumUtils.isDisplayed(driver, verifyTitle);
    }

    public void clickAddToCart() {
        seleniumUtils.click(driver, addToCart);
    }

    public String getQuantity() {
        return seleniumUtils.getText(quantity);
    }

    public void clickShoppingCart() {
        seleniumUtils.click(driver, clickShoppingCart);
    }

    public boolean verifyProductsInCart() {
        return seleniumUtils.isDisplayed(driver, checkProductInCart);
    }

    public boolean isUnitPriceDisplayed() {
        return seleniumUtils.isDisplayed(driver, unitPrice);
    }

    public String getQuantityInCart() {
        return seleniumUtils.getText(quantityInCart);
    }

    public boolean isSubtotalDisplayed() {
        return seleniumUtils.isDisplayed(driver, subtotal);
    }

    public boolean verifyContinueShoppingBtn() {
        return seleniumUtils.isDisplayed(driver, continueShoppingBtn);

    }


}
