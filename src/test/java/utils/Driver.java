package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class Driver {

    public static final Logger log = LoggerFactory.getLogger(Driver.class);

    private Driver() {
    }

    private static WebDriver driver;

    /**
     * Retrieves the WebDriver instance based on the configured browser type.
     *
     * @return WebDriver instance (ChromeDriver)
     */
    public static WebDriver getDriver() {

        if (driver == null) {
            String browserType = ConfigurationReader.getProperty("BROWSER");

            switch (browserType) {

                case "chrome":
                    ChromeOptions options = new ChromeOptions();

                    //options.addArguments("--incognito");

                    //driver = new ChromeDriver(options);
                    driver = new ChromeDriver(options);

                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--private-window");

                    driver = new FirefoxDriver(firefoxOptions);
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                default:
                    log.info("Selected browser is not available!");
            }
        }
        return driver;

    }
    /**
     * Closes the WebDriver instance if it is not null.
     */
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
