package com.qaprosoft.carina.demo.onliner.pages;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class CatalogOnlinerPage extends AbstractPage {

    @FindBy(xpath = "//span[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(),'Компьютеры')]")
    private ExtendedWebElement itemMenuComputerAndNetwork;

    @FindBy(xpath = "//span[@class='catalog-navigation-classifier__item-title-wrapper']")
    private List<ExtendedWebElement> menuItemElementlist;

    @FindBy(xpath = "//div[@class='catalog-navigation-list__aside-title' and contains(text(),'Ноутбуки, компьютеры, мониторы')]")
    private ExtendedWebElement itemMenuLaptop;


    @FindBy(xpath = "//a[@data-shop-id='3886' and @class='button-style button-style_base-alter button-style_primary product-aside__button product-aside__button_narrow product-aside__button_cart button-style_expletive']")
    private ExtendedWebElement addToCart;

    @FindBy(xpath = "//div[contains(@class,'cart-form__offers-part_ammount')]//div[contains(@class,'cart-form__description')]")
    private ExtendedWebElement countOfProductsInCart;

    @FindBy(xpath = "//a[contains(@class,'button-style_base-alter') and contains(text(), 'Перейти в корзину')]")
    private ExtendedWebElement goToCart;

    public List<String> getTextListItemOfMenu() {
        return menuItemElementlist.stream().map(menuItemElement -> menuItemElement.getText()).collect(Collectors.toList());
    }

    public boolean checkIsPresentMenuItemElement() {
        for (ExtendedWebElement menuItemElement : menuItemElementlist) {
            menuItemElement.isElementPresent();
        }
        return true;
    }

    public boolean checkIsPresentMenuItemComputer() {
        return itemMenuComputerAndNetwork.isElementPresent();
    }

    public void clickMenuItemComputerAndNetwork() {
        itemMenuComputerAndNetwork.click();
    }

    public boolean checkIsPresentMenuItemLaptop() {
        return itemMenuLaptop.isElementPresent();
    }

    public ProductPage clickMenuItemLaptop() {
        itemMenuLaptop.click();
        return new ProductPage(driver);
    }
/*
    public boolean checkIsPresentLinkLaptop() {
        return linkLaptop.isElementPresent();
    }

    public void clickOnLinkLaptop() {
        linkLaptop.click();
    }

    public boolean checkIsPresentLaptopHuawei() {
        return huawei53Laptop.isElementPresent();
    }

    public void clickOnHuaweiLaptop() {
        huawei53Laptop.click();
    }


    public Laptop setActualLaptop() {
        Laptop laptopActual = new Laptop();
        laptopActual.setNameOfLaptop(laptopName.getText());
        laptopActual.setMemory(laptopMemory.getText());
        laptopActual.setPrice(laptopPrice.getText());
        return laptopActual;
    }

    public Laptop getActualLaptop(){
        Laptop laptopActual= setActualLaptop();
        laptopActual.getNameOfLaptop();
        laptopActual.getMemory();
        laptopActual.getPrice();
        return laptopActual;//сделать get
    }*/

    public boolean checkIsPresentButtonCart() {
        return addToCart.isElementPresent();
    }

    public void clickOnButtonAddToCart() {
        addToCart.click();
    }

    public boolean checkIsPresentCountProduct() {
        return countOfProductsInCart.isElementPresent();
    }

    public String getTextInCountProduct() {
        return countOfProductsInCart.getText();
    }

    public void clickOnGoToCart() {
        goToCart.click();
    }


    public CatalogOnlinerPage(WebDriver driver) {
        super(driver);
    }
}
