package com.qaprosoft.carina.demo.saucedemo.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.function.Supplier;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@type='submit']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath="//input[@placeholder='Username']")
    private ExtendedWebElement userNameField;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private ExtendedWebElement passwordField;

    public void inputDataForLogin() {
        userNameField.type("standard_user");
        passwordField.type("secret_sauce");
        loginButton.click();
    }

   public boolean checkIsPresentUsernameFields(){
        return userNameField.isElementPresent();
   }
}
