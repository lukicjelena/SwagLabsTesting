package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SwagLabsCartPage {

    WebDriver driver;
    WebElement cart;
    WebElement backpack;
    WebElement inventoryItem;
    WebElement removeFromInvenotry;
    WebElement continueShopping;
    WebElement addToCartButton;
    List<WebElement> listOfProducts; //=
    List<WebElement> listOfAddToCartButton;

    public SwagLabsCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCart() {
        return driver.findElement(By.className("shopping_cart_link"));
    }
    public WebElement getBackpack() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
    public WebElement getInventoryItem() {
        return driver.findElement(By.className("cart_item"));
    }
    public WebElement getRemoveFromInvenotry() {
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }
    public WebElement getContinueShopping() {
        return driver.findElement(By.id("continue-shopping"));
    }
    public List<WebElement> getListOfAddToCartButton() {
        return driver.findElements(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory"));
    }

    public List<WebElement> getListOfProducts() {
        return driver.findElements(By.className("inventory_item"));
    }
    //-------------------------
    public void clickOnCart(){
        getCart().click();
    }
    public void clickOnAddCartBackpack(){
        getBackpack().click();

    }
    public void clickOnRemoveButton(){
        getRemoveFromInvenotry().click();
    }
    public void clickOnContinueShopping(){
        getContinueShopping().click();
    }
    public void addToCart(String nameOfProduct){
    for(int i = 0; i < getListOfProducts().size();i++){
        if(getListOfProducts().get(i).getText().equalsIgnoreCase(nameOfProduct)){
            getListOfAddToCartButton().get(i).click();
            break;
        }
    }
    }
    public void clickOnAddtoChartButton(int b){
        for(int i = 0; i < getListOfAddToCartButton().size(); i++){
            getListOfProducts().get(b).click();
        }

    }



}
