package com.qaprosoft.carina.demo.onliner.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='auth-bar__item auth-bar__item--text']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//a[@class='auth-button auth-button_subsidiary auth-button_huge auth-form__button auth-form__button_fb']")
    private ExtendedWebElement loginVisible;

    @FindBy(xpath = "//div[contains(@class, 'auth-input')]//input[@type='text']")
    private ExtendedWebElement inputUserName;

    @FindBy(xpath = "//input[@type='password']")
    private ExtendedWebElement inputPassword;

    @FindBy(xpath = "//div[contains(@class, 'auth-form')]//button[@type='submit']")
    private ExtendedWebElement submitButton;

    @FindBy(xpath = "//a[@href='https://profile.onliner.by']")
    private ExtendedWebElement profileElement;

    @FindBy(xpath="//iframe//div[@class='recaptcha-checkbox-checkmark']")
    private ExtendedWebElement recaptcha;

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean checkIsLoginFormPresent() {
        return loginVisible.isElementPresent();
    }

    public void inputData() {

        inputUserName.type("asirozh.laba@solvd.com");
        inputPassword.type("23071995Eva");
        submitButton.click();
    }

    public boolean checkIsProfileElementPresent() {
        return profileElement.isElementPresent();
    }

    public void clickRecaptcha(){
        recaptcha.click();
    }
}


