package com.qaprosoft.carina.demo.mobile.gui.pages.android.lamoda;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.lamoda.CardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.lamoda.ClothesPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ClothesPageBase.class)
public class ClothesPage extends ClothesPageBase{

    @FindBy(xpath="//android.widget.TextView[@resource-id='com.lamoda.lite:id/title'] [@text='Боди']")
    private ExtendedWebElement clothesItem;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]")
    private ExtendedWebElement productItem;

    public boolean isPresentClothesItem(){
        return clothesItem.isElementPresent();
    }
    public String getTextActualItemMenuClothes(){
       return clothesItem.getText();
    }
    public void clickOnClothesItem(){
        clothesItem.click();
    }

    public boolean isPresentProductItem(){
        return productItem.isElementPresent();
    }
    public ProductPage clickOnProductItem(){
        productItem.click();
        return new ProductPage(driver);
    }

    public ClothesPage(WebDriver driver) {
        super(driver);
    }
}
