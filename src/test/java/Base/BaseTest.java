package Base;

import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    public WebDriver driver;
    public SwagLabsLoginPage swagLabsLoginPage;
    public SwagLabsInventoryPage swagLabsInventoryPage;
    public BurgerMenu burgerMenu;
    public SwagLabsCartPage swagLabsCartPage;
    public Checkout checkout;
    public FooterButtons footerButtons;

    @BeforeClass
    public void setUp(){
    driver = new ChromeDriver();
    swagLabsLoginPage = new SwagLabsLoginPage(driver);
    swagLabsInventoryPage = new SwagLabsInventoryPage(driver);
    burgerMenu = new BurgerMenu(driver);
    swagLabsCartPage = new SwagLabsCartPage(driver);
    checkout = new Checkout(driver);
    footerButtons = new FooterButtons(driver);


    }
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("", element);
    }
    public void loginHelpMethod(String username, String password){
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
    /*@AfterClass
    public void tearDown(){
        driver.quit();
    }
*/


}
