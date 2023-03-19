package com.qaprosoft.carina.demo.mobile.gui.pages.android.lamoda;


import java.util.List;
import java.util.stream.Collectors;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.lamoda.CatalogPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CatalogPageBase.class)
public class CatalogPage extends CatalogPageBase {

    @FindBy(xpath="//android.widget.TextView[@resource-id='com.lamoda.lite:id/label'] [@text='Новинки']")
    private ExtendedWebElement itemMenuNews;

    @FindBy(xpath ="//android.widget.TextView[@resource-id='com.lamoda.lite:id/title']")
    private List<ExtendedWebElement> itemMenuNewsList;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.lamoda.lite:id/label'] [@text='Одежда']")
    private ExtendedWebElement clothes;

    public boolean isPresentItemMenu(){
        return itemMenuNews.isElementPresent();
    }

    public void clickOnItemMenu(){
        itemMenuNews.click();
    }

    public List<String> getItemMenuNewsList(){
        return itemMenuNewsList.stream().map(menuItemElement -> menuItemElement.getText()).collect(Collectors.toList());
    }

    public boolean isPresentClothes(){
        return clothes.isElementPresent();
    }

    public ClothesPage clickOnClothes(){
        clothes.click();
        return new ClothesPage(driver);
    }
    public CatalogPage(WebDriver driver) {
        super(driver);
    }
}
