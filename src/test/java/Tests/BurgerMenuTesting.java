package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BurgerMenuTesting extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginHelpMethod("standard_user","secret_sauce");
        burgerMenu.clickOnBurgerMenu();
    }
    @Test
    public void testOfItemsInBurgerMenu(){
        Assert.assertTrue(burgerMenu.getAllItemsLink().isDisplayed());
        Assert.assertTrue(burgerMenu.getAboutLink().isDisplayed());
        Assert.assertTrue(burgerMenu.getLogoutLink().isDisplayed());
        Assert.assertTrue(burgerMenu.getResetAppStateLink().isDisplayed());
    }
    @Test
    public void aboutLinkTest(){
        burgerMenu.clickOnAboutLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://saucelabs.com/");
    }
    @Test
    public void logoutLinkTest(){
        burgerMenu.clickOnLogoutLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");
        Assert.assertTrue(swagLabsLoginPage.getLoginButton().isDisplayed());
    }


}
