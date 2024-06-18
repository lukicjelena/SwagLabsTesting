package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwagLabsLoginPage {
WebDriver driver;
WebElement usernameField;
WebElement passwordField;
WebElement loginButton;
WebElement errormMssage;


    public SwagLabsLoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getUsernameField() {
        return driver.findElement(By.id("user-name"));
    }
    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }
    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }
    public WebElement getErrorMessage() {
        return driver.findElement(By.cssSelector(".error-message-container.error"));
    }

    //-------------------------------

    public void inputUsername(String username){
        getUsernameField().sendKeys(username);
    }
    public void inputPassword(String password){
        getPasswordField().sendKeys(password);
    }
    public void clickOnLoginButton(){
        getLoginButton().click();
    }



}
