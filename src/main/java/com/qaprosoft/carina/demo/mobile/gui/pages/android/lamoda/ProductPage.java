package com.qaprosoft.carina.demo.mobile.gui.pages.android.lamoda;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.lamoda.ProductPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductPageBase.class)
public class ProductPage extends ProductPageBase {

    @FindBy(id="com.lamoda.lite:id/priceTextView")
    private ExtendedWebElement price;

    public boolean isPresentPrice(){
        return price.isElementPresent();
    }

    public ProductPage(WebDriver driver) {
        super(driver);
    }
}
