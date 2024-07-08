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

    /**
     * Enters the specified text into the search box and presses Enter.
     *
     * @param text the text to be entered into the search box
     */
    public void enterText(String text) {
        seleniumUtils.type(searchBox, text + Keys.ENTER);
    }

    /**
     * Clicks on the first product in the search results.
     */
    public void clickOnSearchResult() {
        seleniumUtils.click(driver, clickOnFirstProduct);
    }

    /**
     * Checks if the search result title is displayed.
     *
     * @return true if the search result title is displayed, false otherwise
     */
    public boolean getSearchResultTitle() {
        return seleniumUtils.isDisplayed(driver, verifyTitle);
    }

    /**
     * Clicks on the "Add to Cart" button.
     */
    public void clickAddToCart() {
        seleniumUtils.click(driver, addToCart);
    }

    /**
     * Retrieves the quantity of the product.
     *
     * @return the quantity of the product as a String
     */
    public String getQuantity() {
        return seleniumUtils.getText(quantity);
    }

    /**
     * Clicks on the shopping cart.
     */
    public void clickShoppingCart() {
        seleniumUtils.click(driver, clickShoppingCart);
    }

    /**
     * Verifies if the product is present in the cart.
     *
     * @return true if the product is present in the cart, false otherwise
     */
    public boolean verifyProductsInCart() {
        return seleniumUtils.isDisplayed(driver, checkProductInCart);
    }

    /**
     * Checks if the unit price is displayed.
     *
     * @return true if the unit price is displayed, false otherwise
     */
    public boolean isUnitPriceDisplayed() {
        return seleniumUtils.isDisplayed(driver, unitPrice);
    }

    /**
     * Retrieves the quantity of the product in the cart.
     *
     * @return the quantity of the product in the cart as a String
     */
    public String getQuantityInCart() {
        return seleniumUtils.getText(quantityInCart);
    }

    /**
     * Checks if the subtotal is displayed.
     *
     * @return true if the subtotal is displayed, false otherwise
     */
    public boolean isSubtotalDisplayed() {
        return seleniumUtils.isDisplayed(driver, subtotal);
    }

    /**
     * Verifies if the "Continue Shopping" button is displayed.
     *
     * @return true if the "Continue Shopping" button is displayed, false otherwise
     */
    public boolean verifyContinueShoppingBtn() {
        return seleniumUtils.isDisplayed(driver, continueShoppingBtn);
    }


}
