package com.qaprosoft.carina.demo.onliner.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    //
    @FindBy(xpath = "//header/div[2]/div[1]/nav[1]/ul[1]/li[1]/a[2]/span[1]")
    private ExtendedWebElement titleCatalog;

    @FindBy(xpath = "//input[@class='fast-search__input']")
    private ExtendedWebElement searchElement;

    @FindBy(xpath ="//a[@class='category__title' and contains(text(),'Ноутбуки')]")
    private ExtendedWebElement menuLaptop;

    public boolean checkIsPresentTittleCatalog() {
        return titleCatalog.isElementPresent();
    }

    public void clickOnTittleCatalog() {
        titleCatalog.click();
    }

    public boolean checkIsPresentSearchElement() {
        return searchElement.isElementPresent();
    }

    public void inputDataInSearch() {
        searchElement.type("Ноутбуки");
    }
    public void kk(){
        searchElement.hover();
    }

    public boolean checkIsPresentMenuLaptop(){
        return menuLaptop.isElementPresent();
    }


    public HomePage(WebDriver driver) {
        super(driver);
    }

}


