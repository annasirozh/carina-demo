package com.qaprosoft.carina.demo.onliner.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AvOnlinerPage extends AbstractPage {

    @FindBy(xpath="//span[@class='project-navigation__text']//span[@class='project-navigation__sign']")
    private List<ExtendedWebElement> menuItemAutoFleaMarketList;

    public List<String> getTextListItemOfMenuAutoMarket() {
        return menuItemAutoFleaMarketList.stream().map(menuItemAutoFleaMarket->menuItemAutoFleaMarket.getText()).collect(Collectors.toList());
    }

    public boolean checkIsPresentMenuAutoMarketItem() {
        for (ExtendedWebElement menuItemElement : menuItemAutoFleaMarketList) {
            menuItemElement.isElementPresent();
        }
        return true;
    }
    public AvOnlinerPage(WebDriver driver) {
        super(driver);
    }
}
