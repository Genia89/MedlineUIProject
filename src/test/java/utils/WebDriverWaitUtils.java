package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

/**
 * This class provides custom wait functionalities for Selenium WebDriver.
 * Class is designed to enhance the functionality and usability of Selenium WebDriver waits
 * It allows for the implementation of custom wait conditions using lambda expressions,
 * providing flexibility to handle complex synchronization scenarios.
 * Promotes reusability and maintainability, reducing code duplication across test scripts.
 */

public class WebDriverWaitUtils {

    private final WebDriver driver;
    private final Duration timeout;

    /**
     * Constructor for CustomWait class.
     *
     * @param driver  The WebDriver instance to be used for waiting conditions.
     * @param timeout The maximum time to wait.
     */

    public WebDriverWaitUtils(WebDriver driver, Duration timeout) {
        this.driver = driver;
        this.timeout = timeout;
    }

    /**
     * Waits for a given condition to be true.
     *
     * @param condition The condition to wait for.
     */
    public void waitForCondition(ExpectedCondition<?> condition) {
        new WebDriverWait(driver, timeout).until(condition);
    }

    /**
     * Waits for an element to be visible on the page.
     *
     * @param locator The locator of the element to wait for.
     */
    public void waitForElementVisible(By locator) {
        waitForCondition(driver -> driver.findElement(locator).isDisplayed());
    }

    /**
     * Waits for an element to be clickable.
     *
     * @param locator The locator of the element to wait for.
     */
    public void waitForElementClickable(By locator) {
        waitForCondition(driver -> {
            WebElement element = driver.findElement(locator);
            return element.isEnabled() && element.isDisplayed();
        });
    }

    /**
     * Waits for a specific text to be present in the given element.
     *
     * @param locator The locator of the element.
     * @param text    The text to wait for.
     */
    public void waitForTextToBePresentInElement(By locator, String text) {
        waitForCondition(driver -> driver.findElement(locator).getText().contains(text));
    }

    /**
     * Waits for a custom condition to be true using a lambda expression.
     * This method provides flexibility to define custom wait conditions.
     *
     * @param condition A function representing the custom condition.
     */
    public void waitWithCustomCondition(Function<WebDriver, Boolean> condition) {
        new WebDriverWait(driver, timeout).until(condition);
    }

}
