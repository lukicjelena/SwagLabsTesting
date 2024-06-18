package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginHelpMethod("standard_user","secret_sauce");
        checkout.clickOnAddCartBackpack();
        checkout.clickOnCart();


    }
    @Test
    public void checkoutTest(){
    checkout.clickOnCheckout();
    checkout.inputFirstName("Jelena");
    checkout.inputLastName("Lukic");
    checkout.inputPostalCode("154523");
    checkout.clickOnContinue();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-two.html");
        scrollToElement(checkout.getFinishButton());
        Assert.assertTrue(checkout.getFinishButton().isDisplayed());


    checkout.clickOnFinish();

    Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/checkout-complete.html");
    Assert.assertEquals(checkout.getCompleteOrder().getText(),"Thank you for your order!");
    Assert.assertTrue(checkout.getBackHomeButton().isDisplayed());

    checkout.clickOnBackHome();

    Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");

    }


}
