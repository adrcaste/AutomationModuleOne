package tests;

import dataProviders.ProductDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ProductPage;
import pojo.ProductData;
import utilities.ScreenShot;
import utilities.Waits;

import java.io.IOException;


public class VerifyProductDetail extends BaseTest{
    VerifyProductDetail(){super("chrome");}

    @Test(groups = {"sanity"}, dataProvider = "getProductDataFromJson", dataProviderClass = ProductDataProvider.class)
    public void doVerifyEuroPrice(ProductData _ProductData) throws IOException {

        ProductPage productPrice = new ProductPage(driver,getBaseURL());
        Waits wait = new Waits(driver);
        productPrice.goToPage();
        productPrice.selectButtonCurrencyEur();
        wait.untilElementAppear(productPrice.getEuroPriceCurrency());
        Assert.assertEquals(productPrice.getEuroPriceCurrency().getText(),_ProductData.getPriceEuro());
        ScreenShot takeScreenshot = new ScreenShot(driver);
        takeScreenshot.takeScreeShot();

    }
    @Test(groups = {"sanity"}, dataProvider = "getProductDataFromJson", dataProviderClass = ProductDataProvider.class)
    public void doVerifyDollarPrice(ProductData _ProductData) throws IOException {

        ProductPage productPrice = new ProductPage(driver,getBaseURL());
        Waits wait = new Waits(driver);
        productPrice.goToPage();
        productPrice.selectButtonCurrencyDollar();
        wait.untilElementAppear(productPrice.getDollarPriceCurrency());
        Assert.assertEquals(productPrice.getDollarPriceCurrency().getText(),_ProductData.getPriceDol());
        ScreenShot takeScreenshot = new ScreenShot(driver);
        takeScreenshot.takeScreeShot();

    }
    @Test(groups = {"sanity"}, dataProvider = "getProductDataFromJson", dataProviderClass = ProductDataProvider.class)
    public void doVerifyPoundPrice(ProductData _ProductData) throws IOException {

        ProductPage productPrice = new ProductPage(driver,getBaseURL());
        Waits wait = new Waits(driver);
        productPrice.goToPage();
        productPrice.selectButtonCurrencyPound();
        wait.untilElementAppear(productPrice.getPoundPriceCurrency());
        Assert.assertEquals(productPrice.getPoundPriceCurrency().getText(),_ProductData.getPricePound());
        ScreenShot takeScreenshot = new ScreenShot(driver);
        takeScreenshot.takeScreeShot();

    }

}
