package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FooterButtonsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginHelpMethod("standard_user","secret_sauce");
    }
    @Test (priority = 10)
    public void twitterButtonTest() throws InterruptedException {
    footerButtons.clickOnTwitterButton();

        Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        Thread.sleep(5000);

       Assert.assertEquals(driver.getCurrentUrl(),"https://x.com/saucelabs");
    }
    @Test (priority = 20)
    public void facebookButtonTest(){
        footerButtons.clickOnFacebookButton();

        Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/saucelabs");
    }
    @Test (priority = 30)
    public void linkedInButtonTest(){
        footerButtons.clickOninkedInButton();
        Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.linkedin.com/company/sauce-labs/");
    }

    @AfterMethod
    public void pp(){

    }
}
