package com.qaprosoft.carina.demo.mobile.gui.pages.android.lamoda;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.lamoda.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(id = "com.lamoda.lite:id/closeButton")
    private ExtendedWebElement closeButton;

    @FindBy(id = "com.lamoda.lite:id/layoutLogoToolbar")
    private ExtendedWebElement title;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Каталог']")
    private ExtendedWebElement titleCatalog;

    @FindBy(id = "com.lamoda.lite:id/searchTextView")
    private ExtendedWebElement searchButton;

    @FindBy()
    private ExtendedWebElement searchFormForInputData;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Корзина\"]/android.widget.ImageView")
    private ExtendedWebElement card;

    public void clickOnCloseButton() {
        closeButton.click();
    }


    public CatalogPage clickOnCatalog() {
        titleCatalog.click();
        return new CatalogPage(driver);
    }

    public boolean isPresentCatalog() {
        return titleCatalog.isElementPresent();
    }

    public boolean isPresentSearchButton() {
        return searchButton.isElementPresent();
    }

    public SearchPage clickOnSearchButton() {
        searchButton.click();
        return new SearchPage(driver);
    }

    public void inputDataInSearch() {
        searchButton.type("Nike");
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    public boolean isPresentCard() {
        return card.isElementPresent();
    }

    public CardPage clickOnCard() {
        card.click();
        return new CardPage(driver);
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
