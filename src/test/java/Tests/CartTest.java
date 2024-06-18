package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class CartTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginHelpMethod("standard_user","secret_sauce");

    }
    @Test (priority = 10)
    public void addToCartTest(){
        swagLabsCartPage.clickOnAddtoChartButton(1);
        //swagLabsCartPage.addToCart("Sauce Labs Backpack");



       /* Assert.assertEquals(swagLabsCartPage.getCart().getText(),"");
        swagLabsCartPage.clickOnAddCartBackpack();
        swagLabsCartPage.clickOnCart();
        Assert.assertEquals(swagLabsCartPage.getCart().getText(),"1");
        Assert.assertTrue(swagLabsCartPage.getInventoryItem().isDisplayed());
        */

    }

    @Test (priority = 20)
    public void removeFromCartTest(){
        Assert.assertEquals(swagLabsCartPage.getCart().getText(),"");
        swagLabsCartPage.clickOnAddCartBackpack();
        swagLabsCartPage.clickOnCart();
        Assert.assertEquals(swagLabsCartPage.getCart().getText(),"1");
        Assert.assertTrue(swagLabsCartPage.getInventoryItem().isDisplayed());
        swagLabsCartPage.clickOnRemoveButton();
        Assert.assertEquals(swagLabsCartPage.getCart().getText(),"");
    }
    @Test (priority = 30)
    public void continueShoppingButton(){
        swagLabsCartPage.clickOnAddCartBackpack();
        swagLabsCartPage.clickOnCart();
        swagLabsCartPage.clickOnContinueShopping();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
    }
}
