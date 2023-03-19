package com.qaprosoft.carina.demo.onliner.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.R;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    //оформлять, как модалка(будет пример)
    @FindBy(xpath = "//header/div[2]/div[1]/nav[1]/ul[1]/li[1]/a[2]/span[1]")
    private ExtendedWebElement titleCatalog;

    @FindBy(xpath = "//input[@class='fast-search__input']")
    private ExtendedWebElement searchElement;

    @FindBy(xpath ="//a[@class='category__title' and contains(text(),'Ноутбуки')]")
    private ExtendedWebElement menuLaptop;

    @FindBy(xpath = "//span[@class='b-main-navigation__text' and contains(text(),'Автобарахолка')]")
    private ExtendedWebElement autofleaMarket;

    public boolean checkIsPresentTittleCatalog() {
        return titleCatalog.isElementPresent();
    }

    public CatalogOnlinerPage clickOnTittleCatalog() {
        titleCatalog.click();
        return new CatalogOnlinerPage(driver);
    }

    public boolean checkIsPresentSearchElement() {
        return searchElement.isElementPresent();
    }

    public void inputDataInSearch() {
        searchElement.type("Ноутбуки");
    }

    public boolean checkIsFrame(){
       return findExtendedWebElement(By.xpath("//iframe[@class='modal-iframe']")).isElementPresent();
    }
    public void switchToFrame(){
        driver.switchTo().frame(findExtendedWebElement(By.xpath("//iframe[@class='modal-iframe']")).getElement());}

    public boolean checkIsPresentMenuLaptop(){
        return menuLaptop.isElementPresent();
    }
    public boolean checkIsPresentAutoMaret(){
        return autofleaMarket.isElementPresent();
    }
    public AvOnlinerPage clickOnAutomarket(){
        autofleaMarket.click();
        return new AvOnlinerPage(driver);
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

}


