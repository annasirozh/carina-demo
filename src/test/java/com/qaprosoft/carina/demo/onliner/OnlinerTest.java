package com.qaprosoft.carina.demo.onliner;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.onliner.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlinerTest implements IAbstractTest {

    @Test
    public void testOpenPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");

    }

    @Test
    public void testCheckLogin() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        homePage.clickLoginButton();
        Assert.assertTrue(homePage.checkIsLoginFormPresent(), "Page Login is not visible");
        homePage.inputData();
        homePage.clickRecaptcha();
        Assert.assertTrue((homePage.checkIsProfileElementPresent()), "Profile is not present");

    }
}
