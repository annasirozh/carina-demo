package com.qaprosoft.carina.demo.onliner.pages;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.db.models.onliner.Laptop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CatalogOnlinerPage extends AbstractPage {

    @FindBy(xpath = "//span[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(),'Компьютеры')]")
    private ExtendedWebElement itemMenuComputerAndNetwork;

    @FindBy(xpath = "//span[@class='catalog-navigation-classifier__item-title-wrapper']")
    private List<ExtendedWebElement> menuItemElementlist;

    @FindBy(xpath = "//div[@class='catalog-navigation-list__aside-title' and contains(text(),'Ноутбуки, компьютеры, мониторы')]")
    private ExtendedWebElement itemMenuLaptop;

    @FindBy(xpath = "//a[@href='https://catalog.onliner.by/notebook']")
    private ExtendedWebElement linkLaptop;

    @FindBy(xpath = "//span[@data-bind='html: product.extended_name || product.full_name' and contains(text(),'Huawei ')]")
    private ExtendedWebElement huawei53Laptop;

    @FindBy(xpath = "//h1[@class='catalog-masthead__title js-nav-header' and contains(text(),'Huawei')]")
    private ExtendedWebElement laptopName;

    @FindBy(xpath = "//span[@class='offers-description-filter-control__switcher-inner' and contains(text(),'8 ГБ')]")
    private ExtendedWebElement laptopMemory;

    @FindBy(xpath = "//a[@class='offers-description__link offers-description__link_nodecor js-description-price-link']")
    private ExtendedWebElement laptopPrice;



    public List<String> getTextListItemOfMenu() {
        List<String> getMenuItemList = new ArrayList<>();

        for (ExtendedWebElement menuItemElement : menuItemElementlist) {
            getMenuItemList.add(menuItemElement.getText());
        }
        return getMenuItemList;
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

    public void clickMenuItemLaptop() {
        itemMenuLaptop.click();
    }

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
        laptopActual.getNameOfLaptop();
        laptopActual.getMemory();
        laptopActual.getPrice();
        return laptopActual;

    }




    public CatalogOnlinerPage(WebDriver driver) {
        super(driver);
    }
}
