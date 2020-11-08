package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.ProductSearch;
import utilities.ScreenShot;
import utilities.Waits;

import java.io.IOException;

public class AddItemCart extends BaseTest {


    public AddItemCart() {
            super("chrome");
        }

        @Test(groups = {"sanity"})

        public void addItemToCartAsAnonymous() throws InterruptedException, IOException {
            HomePage home = new HomePage(driver, getBaseURL());
            ProductSearch searchResults = new ProductSearch(driver);
            Waits wait = new Waits(driver);
            home.goToPage();
            home.doSearchItem("MacBook");
            Assert.assertEquals(searchResults.getProductTitle().size() > 0,true);
            if(!(searchResults.getProductTitle().size() > 0)) {
                Assert.fail("Empty list");
            }
            searchResults.addProductToCart();
            wait.waitForJSandJQueryToLoad();
            Assert.assertEquals(searchResults.getSuccessModal().isDisplayed(), true);
            searchResults.verifyProductToCart();
            searchResults.verifyProductToCart();
            wait.untilElementAppear(searchResults.getAlertMessage());
            ScreenShot takeScreenshot = new ScreenShot(driver);
            takeScreenshot.takeScreeShot();

        }
}
