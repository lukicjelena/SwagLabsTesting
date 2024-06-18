package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }

    @Test(priority = 10)
    public void validLogin() {
        swagLabsLoginPage.inputUsername("standard_user");
        swagLabsLoginPage.inputPassword("secret_sauce");
        swagLabsLoginPage.clickOnLoginButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

        boolean logInButtonIsDisplayed = false;
        try {
            swagLabsLoginPage.getLoginButton().isDisplayed();
        } catch (Exception exception) {
            System.out.println(exception);
        }
        Assert.assertFalse(logInButtonIsDisplayed);
    }

    @Test(priority = 20)
    public void invalidLoginWithincorrectUsername() {
        swagLabsLoginPage.inputUsername("user");
        swagLabsLoginPage.inputPassword("secret_sauce");
        swagLabsLoginPage.clickOnLoginButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");

        Assert.assertTrue(swagLabsLoginPage.getErrorMessage().isDisplayed());
        Assert.assertTrue(swagLabsLoginPage.getLoginButton().isDisplayed());

    }

    @Test(priority = 30)
    public void invalidLoginWithincorrectPassword() {
        swagLabsLoginPage.inputUsername("standard_user");
        swagLabsLoginPage.inputPassword("secret");
        swagLabsLoginPage.clickOnLoginButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");

        Assert.assertTrue(swagLabsLoginPage.getErrorMessage().isDisplayed());
        Assert.assertTrue(swagLabsLoginPage.getLoginButton().isDisplayed());

    }
}