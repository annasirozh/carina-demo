package com.qaprosoft.carina.demo.mobile.gui.pages.android.lamoda;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.lamoda.SearchPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SearchPageBase.class)
public class SearchPage extends SearchPageBase {

    @FindBy(id = "com.lamoda.lite:id/searchEditTextCurrent")
    private ExtendedWebElement searchFormForInputData;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.lamoda.lite:id/name'] [@text='nike кроссовки']")
    private ExtendedWebElement resultString;

    public boolean isPresentSearchForm() {
        return searchFormForInputData.isElementPresent();
    }

    public void inputDataInSearch() {
        searchFormForInputData.type("Nike");
    }

    public boolean isPresentResultString() {
        return resultString.isElementPresent();
    }

    public String getResultText() {
        return resultString.getText();
    }

    public SearchPage(WebDriver driver) {
        super(driver);
    }
}
