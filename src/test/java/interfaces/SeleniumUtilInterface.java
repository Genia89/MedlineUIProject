package interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Interface representing various user actions for WebDriver.
 */
public interface SeleniumUtilInterface {


    // Element Interaction Methods

    /**
     * Scroll to the element if it is visible.
     */
    void scrollByVisibilityOfElement(WebDriver driver, WebElement element);

    /**
     * Click on the specified element.
     */
    void click(WebDriver driver, WebElement element);

    /**
     * Check if the element is displayed.
     */
    boolean isDisplayed(WebDriver driver, WebElement element);

    /**
     * Type the specified text into the element.
     */
    boolean type(WebElement element, String text);

    /**
     * Find if the element is present.
     */
    boolean findElement(WebDriver driver, WebElement element);

    /**
     * Check if the element is selected.
     */
    boolean isSelected(WebDriver driver, WebElement element);

    /**
     * Check if the element is enabled.
     */
    boolean isEnabled(WebDriver driver, WebElement element);

    // Selection Methods

    /**
     * Select an option by sending keys.
     */
    boolean selectBySendkeys(String value, WebElement element);

    /**
     * Select an option by index.
     */
    boolean selectByIndex(WebElement element, int index);

    /**
     * Select an option by value.
     */
    boolean selectByValue(WebElement element, String value);

    /**
     * Select an option by visible text.
     */
    boolean selectByVisibleText(String visibleText, WebElement element);

    // Mouse Actions Methods

    /**
     * Hover over an element using JavaScript.
     */
    boolean mouseHoverByJavaScript(WebElement element);

    /**
     * Click using JavaScript.
     */
    boolean JSClick(WebDriver driver, WebElement element);

    /**
     * Hover over an element.
     */
    void mouseOverElement(WebDriver driver, WebElement element);

    /**
     * Move to an element.
     */
    boolean moveToElement(WebDriver driver, WebElement element);

    /**
     * Perform mouse over action.
     */
    boolean mouseover(WebDriver driver, WebElement element);

    // Drag and Drop Methods

    /**
     * Drag an element to the specified coordinates.
     */
    boolean draggable(WebDriver driver, WebElement source, int x, int y);

    /**
     * Drag and drop an element to the target element.
     */
    boolean dragAndDrop(WebDriver driver, WebElement source, WebElement target);

    /**
     * Move the slider to specified coordinates.
     */
    boolean slider(WebDriver driver, WebElement element, int x, int y);

    // Context Click Methods

    /**
     * Right-click on an element.
     */
    boolean rightClick(WebDriver driver, WebElement element);

    // Frame Switching Methods

    /**
     * Switch to frame by index.
     */
    boolean switchToFrameByIndex(WebDriver driver, int index);

    /**
     * Switch to frame by ID.
     */
    boolean switchToFrameById(WebDriver driver, String idValue);

    /**
     * Switch to frame by name.
     */
    boolean switchToFrameByName(WebDriver driver, String nameValue);

    /**
     * Switch to the default frame.
     */
    boolean switchToDefaultFrame(WebDriver driver);

    // Window Handling Methods

    /**
     * Switch to window by title.
     */
    boolean switchWindowByTitle(WebDriver driver, String windowTitle, int count);

    /**
     * Switch to a new window.
     */
    boolean switchToNewWindow(WebDriver driver);

    /**
     * Switch to the previous window.
     */
    boolean switchToOldWindow(WebDriver driver);

    // Table Methods

    /**
     * Get the column count of a row.
     */
    int getColumnCount(WebElement row);

    /**
     * Get the row count of a table.
     */
    int getRowCount(WebElement table);

    // Alert Methods

    /**
     * Check if alert is present.
     */
    boolean isAlertPresent(WebDriver driver);

    /**
     * Handle an alert.
     */
    boolean alert(WebDriver driver);

    // URL and Title Methods

    /**
     * Launch a URL.
     */
    boolean launchUrl(WebDriver driver, String url);

    /**
     * Get the current URL.
     */
    String getCurrentURL(WebDriver driver);

    /**
     * Get the title of the current page.
     */
    String getTitle(WebDriver driver);

    // Click Methods with Logging

    /**
     * Click on an element with logging.
     */
    boolean clickWithLogging(WebElement element, String elementName);

    // Wait Methods


    void fluentWait(WebDriver driver, WebElement element, int timeout);

    /**
     * Apply implicit wait.
     */
    void implicitWait(WebDriver driver, int timeout);

    /**
     * Apply explicit wait on an element.
     */
    void explicitWait(WebDriver driver, WebElement element, int timeout);

    /**
     * Set page load timeout.
     */
    void pageLoadTimeout(WebDriver driver, int timeout);

    String getCurrentTime();

    /**
     * Retrieves the text of the given WebElement.*
     *
     * @param element the WebElement to retrieve the text from
     * @return the text of the WebElement
     */
    String getText(WebElement element);


}


