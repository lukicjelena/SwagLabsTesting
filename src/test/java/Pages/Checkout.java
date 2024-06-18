package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {

    WebDriver driver;
    WebElement checkoutButton;
    WebElement firstName;
    WebElement lastName;
    WebElement zipPostalCode;
    WebElement continueButton;
    WebElement finishButton;
    WebElement completeOrder;
    WebElement backHomeButton;
    WebElement backpack;
    WebElement cart;

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.id("checkout"));
    }
    public WebElement getFirstName() {
        return driver.findElement(By.id("first-name"));
    }
    public WebElement getLastName() {
        return driver.findElement(By.id("last-name"));
    }
    public WebElement getZipPostalCode() {
        return driver.findElement(By.id("postal-code"));
    }
    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }
    public WebElement getFinishButton() {
        return driver.findElement(By.id("finish"));
    }
    public WebElement getCompleteOrder() {
        return driver.findElement(By.className("complete-header"));
    }
    public WebElement getBackHomeButton() {
        return driver.findElement(By.id("back-to-products"));
    }
    public WebElement getBackpack() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
    public WebElement getCart() {
        return driver.findElement(By.className("shopping_cart_link"));
    }

    //----------------
    public void clickOnCheckout(){
        getCheckoutButton().click();
    }
    public void inputFirstName(String firstName){
        getFirstName().sendKeys(firstName);
    }
    public void inputLastName(String lastName){
        getLastName().sendKeys(lastName);
    }
    public void inputPostalCode(String postalCode){
        getZipPostalCode().sendKeys(postalCode);
    }
    public void clickOnContinue(){
        getContinueButton().click();
    }
    public void clickOnFinish(){
        getFinishButton().click();
    }
    public void clickOnBackHome(){
        getBackHomeButton().click();
    }
    public void clickOnAddCartBackpack(){
        getBackpack().click();

    }
    public void clickOnCart(){
        getCart().click();
    }
}
