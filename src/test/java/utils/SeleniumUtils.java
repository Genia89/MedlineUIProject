package utils;

import interfaces.SeleniumUtilInterface;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;


public class SeleniumUtils implements SeleniumUtilInterface {

    private WebDriver driver;
    private static WebDriverWaitUtils waitUtils;
    private static final Logger log = LoggerFactory.getLogger(SeleniumUtils.class);

    /**
     * Scrolls to the visibility of the given element.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to scroll to
     */
    @Override
    public void scrollByVisibilityOfElement(WebDriver driver, WebElement element) {
        log.info("Scrolling to the visibility of element: {}", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Clicks on the given element.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to click
     */
    @Override
    public void click(WebDriver driver, WebElement element) {
        log.info("Clicking on element: {}", element);
        element.click();
    }

    /**
     * Checks if the given element is displayed.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to check
     * @return true if the element is displayed, false otherwise
     */
    @Override
    public boolean isDisplayed(WebDriver driver, WebElement element) {
        boolean isDisplayed = element.isDisplayed();
        log.info("Element is displayed: {}", isDisplayed);
        return isDisplayed;
    }

    /**
     * Types the given text into the given element.
     *
     * @param element the WebElement to type into
     * @param text    the text to type
     * @return true if the text is typed successfully
     */
    @Override
    public boolean type(WebElement element, String text) {
        log.info("Typing text: {} into element: {}", text, element);
        element.sendKeys(text);
        return true;
    }

    /**
     * Finds if the given element is present.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to find
     * @return true if the element is found, false otherwise
     */
    @Override
    public boolean findElement(WebDriver driver, WebElement element) {
        try {
            boolean isFound = element.isDisplayed();
            log.info("Element found: {}", isFound);
            return isFound;
        } catch (NoSuchElementException e) {
            log.error("Element not found: {}", element, e);
            return false;
        }
    }

    /**
     * Checks if the given element is selected.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to check
     * @return true if the element is selected, false otherwise
     */
    @Override
    public boolean isSelected(WebDriver driver, WebElement element) {
        boolean isSelected = element.isSelected();
        log.info("Element is selected: {}", isSelected);
        return isSelected;
    }

    /**
     * Checks if the given element is enabled.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to check
     * @return true if the element is enabled, false otherwise
     */
    @Override
    public boolean isEnabled(WebDriver driver, WebElement element) {
        boolean isEnabled = element.isEnabled();
        log.info("Element is enabled: {}", isEnabled);
        return isEnabled;
    }

    /**
     * Selects an option from a dropdown by sending keys.
     *
     * @param value   the value to send
     * @param element the WebElement (dropdown) to select from
     * @return true if the value is sent successfully
     */
    @Override
    public boolean selectBySendkeys(String value, WebElement element) {
        log.info("Selecting by sending keys: {} to element: {}", value, element);
        element.sendKeys(value);
        return true;
    }

    /**
     * Selects an option from a dropdown by index.
     *
     * @param element the WebElement (dropdown) to select from
     * @param index   the index of the option to select
     * @return true if the option is selected successfully
     */
    @Override
    public boolean selectByIndex(WebElement element, int index) {
        log.info("Selecting by index: {} on element: {}", index, element);
        Select select = new Select(element);
        select.selectByIndex(index);
        return true;
    }

    /**
     * Selects an option from a dropdown by value.
     *
     * @param element the WebElement (dropdown) to select from
     * @param value   the value of the option to select
     * @return true if the option is selected successfully
     */
    @Override
    public boolean selectByValue(WebElement element, String value) {
        log.info("Selecting by value: {} on element: {}", value, element);
        Select select = new Select(element);
        select.selectByValue(value);
        return true;
    }

    /**
     * Selects an option from a dropdown by visible text.
     *
     * @param visibleText the visible text of the option to select
     * @param element     the WebElement (dropdown) to select from
     * @return true if the option is selected successfully
     */
    @Override
    public boolean selectByVisibleText(String visibleText, WebElement element) {
        log.info("Selecting by visible text: {} on element: {}", visibleText, element);
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
        return true;
    }

    /**
     * Performs a mouse hover on the given element using JavaScript.
     *
     * @param element the WebElement to hover over
     * @return true if the hover is performed successfully
     */
    @Override
    public boolean mouseHoverByJavaScript(WebElement element) {
        log.info("Mouse hovering by JavaScript on element: {}", element);
        ((JavascriptExecutor) driver).executeScript("var evObj = document.createEvent('MouseEvents');" +
                "evObj.initEvent('mouseover', true, false);" +
                "arguments[0].dispatchEvent(evObj);", element);
        return true;
    }

    /**
     * Clicks on the given element using JavaScript.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to click
     * @return true if the click is performed successfully
     */
    @Override
    public boolean JSClick(WebDriver driver, WebElement element) {
        log.info("Clicking element by JavaScript: {}", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        return true;
    }

    /**
     * Performs a mouse over action on the given element.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to mouse over
     */
    @Override
    public void mouseOverElement(WebDriver driver, WebElement element) {
        log.info("Mouse over element: {}", element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /**
     * Moves to the given element.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to move to
     * @return true if the move is performed successfully
     */
    @Override
    public boolean moveToElement(WebDriver driver, WebElement element) {
        log.info("Moving to element: {}", element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        return true;
    }

    /**
     * Performs a mouse over action on the given element.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to mouse over
     * @return true if the mouse over is performed successfully
     */
    @Override
    public boolean mouseover(WebDriver driver, WebElement element) {
        log.info("Mouse over element: {}", element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        return true;
    }

    /**
     * Drags the source element to the given coordinates.
     *
     * @param driver the WebDriver instance
     * @param source the source WebElement to drag
     * @param x      the x-coordinate to drag to
     * @param y      the y-coordinate to drag to
     * @return true if the drag is performed successfully
     */
    @Override
    public boolean draggable(WebDriver driver, WebElement source, int x, int y) {
        log.info("Dragging element: {} to coordinates: ({}, {})", source, x, y);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(source, x, y).perform();
        return true;
    }

    /**
     * Drags the source element and drops it on the target element.
     *
     * @param driver the WebDriver instance
     * @param source the source WebElement to drag
     * @param target the target WebElement to drop on
     * @return true if the drag and drop is performed successfully
     */
    @Override
    public boolean dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        log.info("Dragging element: {} and dropping on element: {}", source, target);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
        return true;
    }

    /**
     * Slides the given element to the specified coordinates.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to slide
     * @param x       the x-coordinate to slide to
     * @param y       the y-coordinate to slide to
     * @return true if the slide is performed successfully
     */
    @Override
    public boolean slider(WebDriver driver, WebElement element, int x, int y) {
        log.info("Sliding element: {} to coordinates: ({}, {})", element, x, y);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(element, x, y).perform();
        return true;
    }

    /**
     * Performs a right-click on the given element.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to right-click on
     * @return true if the right-click is performed successfully
     */
    @Override
    public boolean rightClick(WebDriver driver, WebElement element) {
        log.info("Right-clicking on element: {}", element);
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
        return true;
    }

    /**
     * Switches to the frame by the given index.
     *
     * @param driver the WebDriver instance
     * @param index  the index of the frame to switch to
     * @return true if the switch is performed successfully
     */
    @Override
    public boolean switchToFrameByIndex(WebDriver driver, int index) {
        log.info("Switching to frame by index: {}", index);
        driver.switchTo().frame(index);
        return true;
    }

    /**
     * Switches to the frame by the given ID.
     *
     * @param driver  the WebDriver instance
     * @param idValue the ID of the frame to switch to
     * @return true if the switch is performed successfully
     */
    @Override
    public boolean switchToFrameById(WebDriver driver, String idValue) {
        log.info("Switching to frame by ID: {}", idValue);
        driver.switchTo().frame(idValue);
        return true;
    }

    /**
     * Switches to the frame by the given name.
     *
     * @param driver    the WebDriver instance
     * @param nameValue the name of the frame to switch to
     * @return true if the switch is performed successfully
     */
    @Override
    public boolean switchToFrameByName(WebDriver driver, String nameValue) {
        log.info("Switching to frame by name: {}", nameValue);
        driver.switchTo().frame(nameValue);
        return true;
    }

    /**
     * Switches to the default content of the page.
     *
     * @param driver the WebDriver instance
     * @return true if the switch is performed successfully
     */
    @Override
    public boolean switchToDefaultFrame(WebDriver driver) {
        log.info("Switching to default frame");
        driver.switchTo().defaultContent();
        return true;
    }

    /**
     * Switches the window by the given title.
     *
     * @param driver      the WebDriver instance
     * @param windowTitle the title of the window to switch to
     * @param count       the count of windows
     * @return true if the switch is performed successfully
     */
    @Override
    public boolean switchWindowByTitle(WebDriver driver, String windowTitle, int count) {
        log.info("Switching window by title: {}", windowTitle);
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(windowTitle)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Switches to the new window.
     *
     * @param driver the WebDriver instance
     * @return true if the switch is performed successfully
     */
    @Override
    public boolean switchToNewWindow(WebDriver driver) {
        log.info("Switching to new window");
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return true;
    }

    /**
     * Switches to the old window.
     *
     * @param driver the WebDriver instance
     * @return true if the switch is performed successfully
     */
    @Override
    public boolean switchToOldWindow(WebDriver driver) {
        log.info("Switching to old window");
        String originalWindow = driver.getWindowHandle();
        driver.switchTo().window(originalWindow);
        return true;
    }

    /**
     * Gets the column count of the given row.
     *
     * @param row the WebElement representing the row
     * @return the number of columns in the row
     */
    @Override
    public int getColumnCount(WebElement row) {
        int columnCount = row.findElements(By.tagName("td")).size();
        log.info("Number of columns in the row: {}", columnCount);
        return columnCount;
    }

    /**
     * Gets the row count of the given table.
     *
     * @param table the WebElement representing the table
     * @return the number of rows in the table
     */
    @Override
    public int getRowCount(WebElement table) {
        int rowCount = table.findElements(By.tagName("tr")).size();
        log.info("Number of rows in the table: {}", rowCount);
        return rowCount;
    }

    /**
     * Checks if an alert is present.
     *
     * @param driver the WebDriver instance
     * @return true if an alert is present, false otherwise
     */
    @Override
    public boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();
            log.info("Alert is present");
            return true;
        } catch (NoAlertPresentException e) {
            log.warn("No alert present", e);
            return false;
        }
    }

    /**
     * Handles the alert by accepting it.
     *
     * @param driver the WebDriver instance
     * @return true if the alert is handled successfully
     */
    @Override
    public boolean alert(WebDriver driver) {
        log.info("Handling alert");
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return true;
    }

    /**
     * Launches the given URL.
     *
     * @param driver the WebDriver instance
     * @param url    the URL to launch
     * @return true if the URL is launched successfully
     */
    @Override
    public boolean launchUrl(WebDriver driver, String url) {
        log.info("Launching URL: {}", url);
        driver.get(url);
        return true;
    }

    /**
     * Gets the current URL of the page.
     *
     * @param driver the WebDriver instance
     * @return the current URL of the page
     */
    @Override
    public String getCurrentURL(WebDriver driver) {
        String currentURL = driver.getCurrentUrl();
        log.info("Current URL: {}", currentURL);
        return currentURL;
    }

    /**
     * Gets the title of the current page.
     *
     * @param driver the WebDriver instance
     * @return the title of the current page
     */
    @Override
    public String getTitle(WebDriver driver) {
        String title = driver.getTitle();
        log.info("Page title: {}", title);
        return title;
    }

    /**
     * Retrieves the text of the given WebElement.*
     *
     * @param element the WebElement to retrieve the text from
     * @return the text of the WebElement
     */
    @Override
    public String getText(WebElement element) {
        try {
            String text = element.getText();
            log.info("Retrieved text from element: {}", text);
            return text;
        } catch (Exception e) {
            log.error("Failed to retrieve text from element", e);
            return null;
        }
    }

    /**
     * Clicks on the given element and logs the action.
     *
     * @param element     the WebElement to click
     * @param elementName the name of the element to log
     * @return true if the click is performed successfully
     */
    @Override
    public boolean clickWithLogging(WebElement element, String elementName) {
        log.info("Clicking on element: {}", elementName);
        element.click();
        return true;
    }

    /**
     * Applies a fluent wait on the given element.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to wait for
     * @param timeout the timeout duration in seconds
     */
    @Override
    public void fluentWait(WebDriver driver, WebElement element, int timeout) {
        log.info("Applying fluent wait on element: {} with timeout: {} seconds", element, timeout);
        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Applies an implicit wait.
     *
     * @param driver  the WebDriver instance
     * @param timeout the timeout duration in seconds
     */
    @Override
    public void implicitWait(WebDriver driver, int timeout) {
        log.info("Applying implicit wait with timeout: {} seconds", timeout);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
    }

    /**
     * Applies an explicit wait on the given element.
     *
     * @param driver  the WebDriver instance
     * @param element the WebElement to wait for
     * @param timeout the timeout duration in seconds
     */
    @Override
    public void explicitWait(WebDriver driver, WebElement element, int timeout) {
        log.info("Applying explicit wait on element: {} with timeout: {} seconds", element, timeout);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Sets the page load timeout.
     *
     * @param driver  the WebDriver instance
     * @param timeout the timeout duration in seconds
     */
    @Override
    public void pageLoadTimeout(WebDriver driver, int timeout) {
        log.info("Setting page load timeout to: {} seconds", timeout);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeout));
    }


    /**
     * Gets the current time as a string.
     *
     * @return the current time as a string
     */
    @Override
    public String getCurrentTime() {
        String currentTime = java.time.LocalDateTime.now().toString();
        log.info("Current time: {}", currentTime);
        return currentTime;
    }


}


