package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BurgerMenu {
    WebDriver driver;
    WebElement burgerMenu;
    WebElement allItemsLink;
    WebElement aboutLink;
    WebElement logoutLink;
    WebElement resetAppStateLink;



    public BurgerMenu(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBurgerMenu() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }

    public WebElement getAllItemsLink() {
        return driver.findElement(By.id("inventory_sidebar_link"));
    }
    public WebElement getAboutLink() {
        return driver.findElement(By.id("about_sidebar_link"));
    }
    public WebElement getLogoutLink() {
        return driver.findElement(By.id("logout_sidebar_link"));
    }
    public WebElement getResetAppStateLink() {
        return driver.findElement(By.id("reset_sidebar_link"));
    }
    //---------------------------------
    public void clickOnBurgerMenu(){
        getBurgerMenu().click();
    }
    public void clickOnAboutLink(){
        getAboutLink().click();
    }
    public void clickOnLogoutLink(){
        getLogoutLink().click();
    }


}
