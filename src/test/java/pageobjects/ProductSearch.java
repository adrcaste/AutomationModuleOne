package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductSearch extends BasePage{
    public ProductSearch(WebDriver driver) {
        super(driver);
    }
    private By itemTitle = By.xpath("//*[contains(@class,'product-layout')]");
    private By addToCartButton = By.xpath("//div[contains(@class,'product-layout')]//button[contains(span,'Add to Cart')]");
    private By successModal =  By.xpath("//div[contains(@class, 'alert alert-success alert-dismissible')]");
    private By cartTotalButton = By.id("cart-total");
    private By cartButton = By.xpath("//*[@class=\"text-right\"]/a[@href='https://demo.opencart.com/index.php?route=checkout/cart']");
    private By checkOutButton = By.xpath("//*/a[@href='https://demo.opencart.com/index.php?route=checkout/checkout']");
    private By alertMessage = By.xpath("//body/div[@id='checkout-cart']/div[@class='alert alert-danger alert-dismissible']");



    public List<WebElement> getProductTitle() {
        return driver.findElements(this.itemTitle);
    }

    public  WebElement getAddToCartButton() {
        return driver.findElement(this.addToCartButton);
    }

    public WebElement getSuccessModal() {
        return driver.findElement(this.successModal);
    }
    public  WebElement getCartTotalButton(){return driver.findElement(this.cartTotalButton);}
    public  WebElement getCartButton(){return driver.findElement(this.cartButton);}
    public  WebElement getCheckOutButton(){return driver.findElement(this.checkOutButton);}
    public  WebElement getAlertMessage(){return driver.findElement(this.alertMessage);}

   // @Step("Add Product to Cart")
   public void addProductToCart() {
        this.getAddToCartButton().click();
    }
    public void verifyProductToCart() {
        this.getCartTotalButton().click();
        this.getCartButton().click();
        this.getCheckOutButton().click();
        this.getAlertMessage().findElement(alertMessage);

    }



}
