package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public abstract class BasePageUI {

    private static final Logger log = LoggerFactory.getLogger(BasePageUI.class);

    @BeforeMethod
    public void setUp() {
        log.info("******Starting executing tests******");
        try {
            Driver.getDriver().get(ConfigurationReader.getProperty("BASE_URL"));
        } catch (Exception e) {
            log.info("An error occurred while opening the driver" + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() {
        try {
            Driver.closeDriver();
        } catch (Exception e) {
            log.info("An error occurred while closing driver" + e.getMessage());
        }
        log.info("******Browser is closing******");
    }

    /**
     * This method performs the basic test steps:
     * Navigates to the homepage.
     * Verifies the homepage title.
     * Clicks on the home menu.
     * Clicks on the Medline at Home menu.
     * Verifies the Women's Health and Wellbeing title.
     * It has a common set of actions that multiple test classes need to perform.
     */
    protected void baseTestSteps() {
        //Navigate to homepage and click home menu, and verify Women's health and well being title.
        HomePage homePage = new HomePage();
        Assert.assertEquals(homePage.getMedlineHomePageTitle(),
                "A medical supply company, manufacturer and distributor",
                "Expected title was not displayed.");
        homePage.clickHomePageMenu();
        homePage.clickMedlineAtHomeMenu();
        Assert.assertEquals(homePage.getWomensHealthAndWellBeingTitle(),
                "Women's Health and Wellbeing",
                "Expected title was not displayed.");
    }


}
