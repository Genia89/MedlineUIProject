package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.BasePageUI;
import utils.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class MedlineUITests extends BasePageUI {

    MedlineAtHomePage medlineAtHomePage = new MedlineAtHomePage();

    @Test
    public void verifyProductsLinks() {
        baseTestSteps();

        //Step 1:  Navigate to the initial page, and verify the page title
        ProductsPage productsPage = new ProductsPage();
        Assert.assertEquals(productsPage.getProductTitle(),
                "Medline", "Displayed title did not match.");

        //Step 2: Click on the dropdown and then "Shop All"
        productsPage.clickProductsShopAll();

        //Step 3: Verify the title of the new page
        Assert.assertEquals(productsPage.getProductTitle(),
                "Products", "Displayed title did not match");
        medlineAtHomePage.clickProductsDropdown();

        //Step 4: Click and verify all product links are clickable and present.
        Assert.assertTrue(productsPage.verifyAdvancedWoundCareLink(),
                "Advanced Wound Care link is not present");

        Assert.assertTrue(productsPage.verifyDiabetesCareLink(),
                "Diabetes Care link is not present");

        Assert.assertTrue(productsPage.verifyFirstAidLink(),
                "First Aid Link is not present");

        Assert.assertTrue(productsPage.verifyHearingAidsAndAmplifiersLink(),
                "Hearing Aids Amplifiers link is not present");

        Assert.assertTrue(productsPage.verifyHomeDiagnosticsLink(),
                "Home Diagnostics link is not present");

        Assert.assertTrue(productsPage.verifyHomeHealthCareLink(),
                "Home Health Care link is not present");

        Assert.assertTrue(productsPage.verifyIncontinenceLink(),
                "Incontinence link is not present");

        Assert.assertTrue(productsPage.verifyMedicationsOverTheCounterLink(),
                "Medications Over The Counter link is not present");

        Assert.assertTrue(productsPage.verifyMobilityLink(),
                "Mobility link is not present.");

        Assert.assertTrue(productsPage.verifyMomAndBabyCareLink(),
                "Mom and Baby Care link is not present.");

        Assert.assertTrue(productsPage.verifyNutritionLink(),
                "Nutrition link is not present.");

        Assert.assertTrue(productsPage.verifyOstomyAndUrologySupplyLink(),
                "Ostomy and Urology Supply link is not present.");

        Assert.assertTrue(productsPage.verifyPersonalCareLink(),
                "Personal Care link is not present.");

        Assert.assertTrue(productsPage.verifyPhysicalCareLink(),
                "Physical Care link is not present");

        Assert.assertTrue(productsPage.verifyProtectionWearLink(),
                "Protection Wear link is not present.");

        Assert.assertTrue(productsPage.verifyRespiratoryLink(),
                "Respiratory link is not present.");

        Assert.assertTrue(productsPage.verifyScrubsLink(),
                "Scrubs link is not present.");

        Assert.assertTrue(productsPage.verifySurgicalSuppliesLink(),
                "Surgical Supplies link is not present.");

        Assert.assertTrue(productsPage.verifyVitaminsAndSupplementsLink(),
                "Vitamins and Supplements link is not present.");


    }

    @Test
    public void verifyShopByNeedsPageLinks() {
        baseTestSteps();
        //Step 1: Click 'Shop By Needs' click on the dropdown and then "Shop All",
        // and verify the title of the new page.
        ShopByNeedsPage shopByNeedsPage = new ShopByNeedsPage();
        shopByNeedsPage.clickShopByNeedsShopAll();
        Assert.assertEquals(shopByNeedsPage.getShopByNeedsTitle(),
                "Shop By Need", "Expected title was not displayed.");
        medlineAtHomePage.clickShopByNeedDropdown();

        //Step 2: Verify all expected links are displayed.
        Assert.assertTrue(shopByNeedsPage.verifyMaintainMobilityLink(),
                "Maintain mobility link is not present.");

        Assert.assertTrue(shopByNeedsPage.verifyContinenceCareLink(),
                "Continence Care link is not present.");

        Assert.assertTrue(shopByNeedsPage.verifyMomAndBabyCareLink(),
                "Mom and Baby Care link is not present.");

        Assert.assertTrue(shopByNeedsPage.verifyWoundCareLink(),
                "Wound care link is not present.");

        Assert.assertTrue(shopByNeedsPage.verifyHearingLossLink(),
                "Hearing loss link is not present.");

        Assert.assertTrue(shopByNeedsPage.verifyDiabetesEducationLink(),
                "Diabetes Education link is not present.");

        Assert.assertTrue(shopByNeedsPage.verifyStopSmokingLink(),
                "Stop smoking link is not present.");

        Assert.assertTrue(shopByNeedsPage.verifyPhysicalTherapyAndRehabLink(),
                "Physical therapy and rehab link is not present.");

        Assert.assertTrue(shopByNeedsPage.verifySinusAllergiesHeadacheLink(),
                "Sinus Allergies and Headache link is not present.");

        Assert.assertTrue(shopByNeedsPage.verifyBackPainLink(),
                "Back Pain link is not present.");

        Assert.assertTrue(shopByNeedsPage.verifySkinHealthLink(),
                "Skin Care link is not present.");

        Assert.assertTrue(shopByNeedsPage.verifyArthritisLink(),
                "Arthritis link is not present.");

    }

    @Test
    public void verifyBrandsPageLinks() {
        baseTestSteps();
        //Step 1: Click 'Brands' click on the dropdown and then "Shop All",
        // and verify the title of the new page.

        BrandsPage brandsPage = new BrandsPage();
        brandsPage.clickBrandsShopAll();
        Assert.assertEquals(brandsPage.getBrandsTitle(),
                "Brands", "Expected title was not displayed.");
        medlineAtHomePage.clickBrandsDropdown();

        //Step 2: Verify all expected links are displayed.
        Assert.assertTrue(brandsPage.verifyActiveICELink(),
                "Active ICE link is not present.");

        Assert.assertTrue(brandsPage.verifyMicrobanLink(),
                "Microban link is not present.");

        Assert.assertTrue(brandsPage.verifyMomentumLink(),
                "Momentum link is not present.");

        Assert.assertTrue(brandsPage.verifySimplySoftLink(),
                "Simply soft link is not present.");

        Assert.assertTrue(brandsPage.verifyMedlineOTCHearingAidsLink(),
                "Medline OTC Hearing Aids link is not present.");

        Assert.assertTrue(brandsPage.verifyCuradLink(),
                "Curad link is not present.");

        Assert.assertTrue(brandsPage.verifyFitRightLink(),
                "Fit Right link is not present.");

        Assert.assertTrue(brandsPage.verifyFitRightFreshStartLink(),
                "Fit right fresh start link is not present.");

        Assert.assertTrue(brandsPage.verifyRemedySkincareLink(),
                "Remedy skin care link is not present.");

        Assert.assertTrue(brandsPage.verifyMedlineDrypadUnderPadsLink(),
                "Medline Drypad under Pads link is not present.");

        Assert.assertTrue(brandsPage.verifyByACRELink(),
                "By ACRE link is not present.");

        Assert.assertTrue(brandsPage.verifyAveScrubsLink(),
                "Ave scrubs link is not present.");

        Assert.assertTrue(brandsPage.verifyAngelStatScrubsLink(),
                "Angel stat scrubs link is not present.");

        Assert.assertTrue(brandsPage.verifyComfortEaseScrubsLink(),
                "Comfort ease scrubs link is not present.");

        Assert.assertTrue(brandsPage.verifyPerforMaxScrubsLink(),
                "Perfor max scrubs link is not present.");

        Assert.assertTrue(brandsPage.verifyMarthaStewartLink(),
                "Martha Stewart link is not present.");
    }

    @Test
    public void verifySearchBox() {
        baseTestSteps();

        //Step 1: Navigate to the search box and search for products.
        SearchPage searchPage = new SearchPage();

        List<String> searchProducts = new ArrayList<>();
        searchProducts.add("Vitamins");
        searchProducts.add("Wipes");
        searchProducts.add("Women's scrubs");
        searchProducts.add("Baby's diaper");
        searchProducts.add("Men's scrub pants");

        String getRandomSearchProductFromList = RandomGenerator.getRandomListElement(searchProducts);
        searchPage.enterText(getRandomSearchProductFromList);

        //Step 2: Click on the first search result, verify that the right product is opened
        Assert.assertTrue(searchPage.getSearchResultTitle(),
                "Title was not displayed.");
        searchPage.clickOnSearchResult();

        //Step 3: Verify the right quantity is selected and click 'Add to cart'
      Assert.assertEquals(searchPage.getQuantity(), "1",
              "Expected quantity was not displayed.");
      searchPage.clickAddToCart();

        //Step 4: Click 'Shopping Cart' and verify right product is added,
        // unit price, quantity and subtotal are added and 'Continue button' is displayed
        searchPage.clickShoppingCart();
        Assert.assertTrue(searchPage.isUnitPriceDisplayed(), "Unit price was not displayed." );
        Assert.assertEquals(searchPage.getQuantity(), "1",
                "Expected quantity was not displayed.");
        Assert.assertTrue(searchPage.isSubtotalDisplayed(), "Expected subtotal was not displayed.");
        Assert.assertTrue(searchPage.verifyContinueShoppingBtn(), "Expected button was not displayed.");

    }
}
