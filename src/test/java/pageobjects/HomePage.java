package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Waits;


public class HomePage extends BasePage {

    private By searchBox = By.xpath("//div[@id='search']/input[@type='text']");
    private By searchButton = By.xpath("//*[@class='input-group-btn']/button[@type='button']");
    private By navBar = By.xpath("//*[@class='collapse navbar-collapse navbar-ex1-collapse']");

    public HomePage(WebDriver driver){super(driver);}
    public HomePage(WebDriver driver,String url){super(driver,url);}

    public WebElement setSearchBox(){return driver.findElement(this.searchBox);}
    public WebElement setSearchButton(){return driver.findElement(this.searchButton);}
    public WebElement setNavBar(){return driver.findElement(this.navBar);}

    public void doSearchItem(String searchBox){
        Waits wait = new Waits(driver);
        wait.untilElementAppear(setNavBar());
        this.setSearchBox().sendKeys(searchBox);
        this.setSearchButton().click();
    }
}

