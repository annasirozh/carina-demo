package com.qaprosoft.carina.demo.saucedemo.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class InventorePage extends AbstractPage {

    @FindBy(xpath="//span[@class='title' and contains(text(),'Products')]")
    private ExtendedWebElement titleProducts;

    @FindBy(xpath = "//div[@class='inventory_item_name' and contains (text(),'Sauce Labs Backpack')]")
    private ExtendedWebElement productNameItem;

    @FindBy(xpath="//div[@class='inventory_item_desc' and contains(text(),'carry.allTheThings() with the sleek, " +
            "streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.')]")
    private ExtendedWebElement productItemDesc;

    @FindBy(xpath = "//button[contains(@class,'btn_primary ') and @data-test='add-to-cart-sauce-labs-backpack']")
    private ExtendedWebElement buttonAddCart;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private ExtendedWebElement shoppingCartLink;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private ExtendedWebElement buttonLogout;

    @FindBy(xpath="//div[@class='bm-burger-button']")
    private ExtendedWebElement menubutton;

    public boolean checkIsPresentTitleProducts(){
        return titleProducts.isElementPresent();
    }
    public boolean checkIsPresentProductItemName(){
        return productNameItem.isElementPresent();
    }
    public boolean checkIsPresentProductItemDesc(){
        return productItemDesc.isElementPresent();
    }

    public InventorePage(WebDriver driver) {
        super(driver);
    }
    public boolean CheckIsPresentButtonAddCart(){
        return buttonAddCart.isElementPresent();
    }
    public void clickOnButtonAddCart(){
        buttonAddCart.click();
    }
    public boolean CheckIsPresentShoppinCartLink(){
        return shoppingCartLink.isElementPresent();
    }
    public void clickShoppingLink(){
        shoppingCartLink.click();
    }

    public boolean checkIsPresentButtonLogout(){
        return buttonLogout.isElementPresent();
    }

    public void clickButtonLogOut(){
        buttonLogout.click();
    }
    public void clickMenuButton(){
        menubutton.click();
    }

}
