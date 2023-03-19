package com.qaprosoft.carina.demo.onliner.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.db.models.onliner.Laptop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends AbstractPage {


    @FindBy(xpath = "//a[@href='https://catalog.onliner.by/notebook']")
    private ExtendedWebElement linkLaptop;

    @FindBy(xpath = "//span[@data-bind='html: product.extended_name || product.full_name' and contains(text(),'Ноутбук Apple Macbook Air 13\" M1 2020 MGN63')]")
    private ExtendedWebElement macbookLaptop;

    @FindBy(xpath = "//h1[@class='catalog-masthead__title js-nav-header' and contains(text(),'Apple Macbook')]")
    private ExtendedWebElement laptopName;

    @FindBy(xpath = "//span[@class='offers-description-filter-control__switcher-inner' and contains(text(),'8 ГБ')]")
    private ExtendedWebElement laptopMemory;

    @FindBy(xpath = "//a[@class='offers-description__link offers-description__link_nodecor js-description-price-link']")
    private ExtendedWebElement laptopPrice;

    public boolean checkIsPresentLinkLaptop() {
        return linkLaptop.isElementPresent();
    }

    public void clickOnLinkLaptop() {
        linkLaptop.click();
    }

    public boolean checkIsPresentLaptopHuawei() {
        return macbookLaptop.isElementPresent();
    }

    public void clickOnHuaweiLaptop() {
        macbookLaptop.click();
    }


    public Laptop setActualLaptop() {
        Laptop laptopActual = new Laptop();
        laptopActual.setNameOfLaptop(laptopName.getText());
        laptopActual.setMemory(laptopMemory.getText());
        laptopActual.setPrice(laptopPrice.getText());
        return laptopActual;
    }


    public ProductPage(WebDriver driver) {
        super(driver);
    }
}
