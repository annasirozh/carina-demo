package com.qaprosoft.carina.demo.saucedemo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.saucedemo.pages.CartPage;
import com.qaprosoft.carina.demo.saucedemo.pages.HomePage;
import com.qaprosoft.carina.demo.saucedemo.pages.InventorePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SaucedemoTest implements IAbstractTest {

    @Test
    public void testCheckLogin() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        homePage.inputDataForLogin();
        InventorePage inventorePage = new InventorePage(getDriver());
        Assert.assertTrue(inventorePage.checkIsPresentTitleProducts(), "Title Products is not present");
    }

    @Test
    public void testCheckCardOfProducts() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        homePage.inputDataForLogin();
        InventorePage inventorePage = new InventorePage(getDriver());
        Assert.assertTrue(inventorePage.checkIsPresentTitleProducts(), "Title Products is not present");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(inventorePage.checkIsPresentProductItemName(), "Product item is not found");
        softAssert.assertTrue(inventorePage.checkIsPresentProductItemDesc(), "Product item is not found");
    }

    @Test
    public void testCheckProductCart() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        homePage.inputDataForLogin();
        InventorePage inventorePage = new InventorePage(getDriver());
        Assert.assertTrue(inventorePage.checkIsPresentTitleProducts(), "Title Products is not present");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(inventorePage.checkIsPresentProductItemName(), "Product item is not found");
        Assert.assertTrue(inventorePage.CheckIsPresentButtonAddCart(), "Button for add to cart is not found");
        inventorePage.clickOnButtonAddCart();
        Assert.assertTrue(inventorePage.CheckIsPresentShoppinCartLink(), "Shopping cart link is not present");
        inventorePage.clickShoppingLink();
        CartPage cartPage = new CartPage(getDriver());
        Assert.assertTrue(cartPage.checkIsPresentCartQuantity(),"Cart quantity is not present");
    }

    @Test
    public void testlogout(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        homePage.inputDataForLogin();
        InventorePage inventorePage = new InventorePage(getDriver());
        Assert.assertTrue(inventorePage.checkIsPresentButtonLogout(),"Button logout is not found");
        inventorePage.clickButtonLogOut();
        Assert.assertTrue(homePage.checkIsPresentUsernameFields(),"Field username is not found");



    }


}
