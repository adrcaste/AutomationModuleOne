package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessPage extends BasePage{
    private By successText =By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    private By continueButton = By.xpath("//*[@class='pull-right']/a[contains(text(),'Continue')]");
    private By logOutButton = By.xpath("//*[@class='list-group']/a[@href='https://demo.opencart.com/index.php?route=account/logout']");


    public SuccessPage(WebDriver driver){super(driver);}
    public WebElement setSuccessText(){
        return driver.findElement(this.successText);
    }
    public WebElement setContinueButton(){
        return driver.findElement(this.continueButton);
    }
    public WebElement setLogOutButton(){
        return driver.findElement(this.logOutButton);
    }

}
