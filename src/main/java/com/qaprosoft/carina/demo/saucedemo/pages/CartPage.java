package com.qaprosoft.carina.demo.saucedemo.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage {

    @FindBy(xpath="//div[@class='cart_quantity']")
    private ExtendedWebElement cartQuantity;

    public boolean checkIsPresentCartQuantity(){
        return cartQuantity.isElementPresent();
    }

    public CartPage(WebDriver driver) {
        super(driver);
    }
}
