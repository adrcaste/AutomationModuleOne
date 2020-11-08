package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.RegistrationPage;
import pageobjects.SuccessPage;
import utilities.ScreenShot;
import utilities.Waits;

import java.io.IOException;

public class NewUserRegister extends BaseTest{
    NewUserRegister(){super("chrome");}
    @Test(groups = {"sanity"})

    public void doRegistration() throws IOException {
        RegistrationPage registration = new RegistrationPage(driver, getBaseURL());
        SuccessPage successText = new SuccessPage(driver);
        Waits wait = new Waits(driver);
        registration.goToPage();
        registration.goToPage();
        registration.doRegistration("Adriana",
                "Castelblanco",
                " ",
                "7780967","Test1234",
                "Test1234");
        wait.untilElementAppear(successText.setLogOutButton());
        Assert.assertEquals(successText.setSuccessText().isDisplayed(),true);
        Assert.assertEquals(successText.setContinueButton().isDisplayed(),true);
        Assert.assertEquals(successText.setLogOutButton().isDisplayed(),true);
        ScreenShot takeScreenshot = new ScreenShot(driver);
        takeScreenshot.takeScreeShot();

    }
}
