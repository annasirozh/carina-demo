package com.qaprosoft.carina.demo.mobile.gui.pages.android.lamoda;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.lamoda.CardPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CardPageBase.class)
public class CardPage extends CardPageBase {

    @FindBy(id="com.lamoda.lite:id/textView_title")
    private ExtendedWebElement titleCard;

    public boolean isCheckTitle(){
        return titleCard.isElementPresent();
    }
    public String getTextTitleCard(){
        return titleCard.getText();
    }

    public CardPage(WebDriver driver) {
        super(driver);
    }
}
