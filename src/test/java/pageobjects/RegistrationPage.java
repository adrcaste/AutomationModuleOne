package pageobjects;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {
    private By firstName =By.id("input-firstname");
    private By lastName = By.id("input-lastname");
    private By email = By.id( "input-email");
    private By telephone = By.id("input-telephone");
    private By password =By.id("input-password");
    private By confirmPassword = By.id("input-confirm") ;
    private By radioButtonYes = By.xpath("//*[@class='radio-inline']/input[@value=\"1\"]");
    private By agreePolice = By.xpath("//*[@class='pull-right']/input[@name=\"agree\"]");
    private By submitButton = By.xpath("//*[@class='pull-right']/input[@type=\"submit\"]");

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    public RegistrationPage(WebDriver driver, String url){
        super(driver, url + "index.php?route=account/register");



    }
    public static String randomEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public WebElement setFirstName (){
        return driver.findElement(this.firstName);
    }
    public WebElement setLastName(){
        return driver.findElement(this.lastName);
    }
    public WebElement setEmail(){
        return driver.findElement(this.email);
    }
    public WebElement setTelephone(){
        return driver.findElement(this.telephone);
    }
    public WebElement setPassword(){
        return driver.findElement(this.password);
    }
    public WebElement setConfirmPassword(){
        return driver.findElement(this.confirmPassword);
    }
    public WebElement setRadioButtonYes(){
        return driver.findElement(this.radioButtonYes);
    }
    public WebElement setAgreePolice(){
        return driver.findElement(this.agreePolice);
    }
    public WebElement setSubmitButton(){
        return driver.findElement(this.submitButton);
    }
    public void doRegistration(String firstname,
                               String lastname,
                               String email ,
                               String telephone,
                               String password,
                               String confirmPassword){

        this.setFirstName().sendKeys(firstname);
        this.setLastName().sendKeys(lastname);
        this.setEmail().sendKeys(randomEmail());
        this.setTelephone().sendKeys(telephone);
        this.setPassword().sendKeys(password);
        this.setConfirmPassword().sendKeys(confirmPassword);
        this.setRadioButtonYes().click();
        this.setAgreePolice().click();
        this.setSubmitButton().click();

    }
}
