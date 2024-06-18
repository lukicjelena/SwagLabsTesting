package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterButtons {
    WebDriver driver;
    WebElement twitterButton;
    WebElement facebookButton;
    WebElement linkedInButton;


    public FooterButtons(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTwitterButton() {
        return driver.findElement(By.linkText("Twitter"));
    }
    public WebElement getFacebookButton() {
        return driver.findElement(By.linkText("Facebook"));
    }
    public WebElement getLinkedInButton() {
        return driver.findElement(By.linkText("LinkedIn"));
    }
    //-------------------------
    public void clickOnTwitterButton(){
        getTwitterButton().click();
    }
    public void clickOnFacebookButton(){
        getFacebookButton().click();
    }
    public void clickOninkedInButton(){
        getLinkedInButton().click();
    }

}
