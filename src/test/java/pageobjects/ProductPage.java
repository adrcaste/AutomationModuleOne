package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    private By dropCurrency = By.xpath("//body/nav[@id='top']/div[1]/div[1]/form[1]/div[1]/button[1]/i[1]");
    private By eurCurrencyButton = By.xpath("//button[@name='EUR']");
    private By poundCurrencyButton = By.xpath("//*[@class= 'dropdown-menu']//button[@name='GBP']");
    private By dollarCurrencyButton = By.xpath("//button[@name='USD']");
    private By dollarPriceCurrency = By.xpath("//h2[contains(text(),'$')]");
    private By euroPriceCurrency = By.xpath("//ul/li/h2[contains(text(),'518.16€')]");
    private By poundPriceCurrency = By.xpath("//ul/li/h2[contains(text(),'£454.10')]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage(WebDriver driver, String url) {
        super(driver, url + "index.php?route=product/product&product_id=43");
    }

    public WebElement setDropCurrency() {
        return driver.findElement(this.dropCurrency);
    }

    public WebElement setEurCurrencyButton() {
        return driver.findElement(this.eurCurrencyButton);
    }

    public WebElement setPoundCurrencyButton() {
        return driver.findElement(this.poundCurrencyButton);
    }

    public WebElement setDollarCurrencyButton() {
        return driver.findElement(this.dollarCurrencyButton);
    }

    public WebElement getDollarPriceCurrency() {
        return driver.findElement(this.dollarPriceCurrency);
    }

    public WebElement getEuroPriceCurrency() {
        return driver.findElement(this.euroPriceCurrency);
    }

    public WebElement getPoundPriceCurrency() {
        return driver.findElement(this.poundPriceCurrency);
    }

    public void selectButtonCurrencyEur() {
        this.setDropCurrency().click();
        this.setEurCurrencyButton().click();
        this.getEuroPriceCurrency().findElement(euroPriceCurrency);


    }

    public void selectButtonCurrencyPound() {
        this.setDropCurrency().click();
        this.setPoundCurrencyButton().click();
        this.getPoundPriceCurrency().findElement(poundPriceCurrency);


    }
    public void selectButtonCurrencyDollar() {
        this.setDropCurrency().click();
        this.setDollarCurrencyButton().click();
        this.getDollarPriceCurrency().findElement(dollarPriceCurrency);

    }
}
