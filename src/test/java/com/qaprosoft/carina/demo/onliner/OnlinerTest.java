package com.qaprosoft.carina.demo.onliner;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.db.models.onliner.Laptop;
import com.qaprosoft.carina.demo.onliner.pages.AvOnlinerPage;
import com.qaprosoft.carina.demo.onliner.pages.CatalogOnlinerPage;
import com.qaprosoft.carina.demo.onliner.pages.HomePage;
import com.qaprosoft.carina.demo.onliner.pages.ProductPage;
import com.qaprosoft.carina.demo.utils.utilsOnliner.LaptopBuilder;
import com.qaprosoft.carina.demo.utils.utilsOnliner.OnlinerUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlinerTest implements IAbstractTest {

    //Проверка присутствия на страницы каталога секций: "Onliner Prime", "Электроника", "Компьютеры и сети",
    // "Бытовая техника", "На каждый день", "Стройка и ремонт", "Дом и сад", "Авто и мото", "Красота и спорт",
    //"Детям и мамам"

    @Test
    public void testCheckMenuCatalog() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        Assert.assertTrue(homePage.checkIsPresentTittleCatalog(), "Title Catalog is not found");
        CatalogOnlinerPage catalogOnlinerPage = homePage.clickOnTittleCatalog();
        Assert.assertTrue(catalogOnlinerPage.checkIsPresentMenuItemElement(), "Menu Catalog is not found");
        Assert.assertEquals(catalogOnlinerPage.getTextListItemOfMenu(), OnlinerUtils.createListMenuItemCatalog(),
                "Section is not found");
    }

    //тест проверки нахождения определенной модели ноутбука Huawei MateBook D 15 AMD BoM-WDQ9 53013JJX
    @Test
    public void testCheckHuawei() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        Assert.assertTrue(homePage.checkIsPresentTittleCatalog(), "Title Catalog is not found");
        CatalogOnlinerPage catalogOnlinerPage = homePage.clickOnTittleCatalog();
        Assert.assertTrue(catalogOnlinerPage.checkIsPresentMenuItemComputer(), "Computer and Network is not found");
        catalogOnlinerPage.clickMenuItemComputerAndNetwork();
        Assert.assertTrue(catalogOnlinerPage.checkIsPresentMenuItemLaptop(), "Item Menu Laptop is not found");
        ProductPage productPage = catalogOnlinerPage.clickMenuItemLaptop();
        Assert.assertTrue(productPage.checkIsPresentLinkLaptop(), "Link laptop is not found");
        productPage.clickOnLinkLaptop();
        Assert.assertTrue(productPage.checkIsPresentLaptopHuawei(), "Laptop is not found");
        productPage.clickOnHuaweiLaptop();
      //  Laptop laptopExpected = LaptopBuilder.createLaptopExpected();
       // Assert.assertEquals(productPage.setActualLaptop(), laptopExpected, "Laptop is not found");


    }

    // тест на проверку, что в поиске при выборе ноутбуков, отображается раздел с ноутбуками
    @Test
    public void testSearchLaptop() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        Assert.assertTrue(homePage.checkIsPresentSearchElement(), "Search is not found");
        homePage.inputDataInSearch();
        Assert.assertTrue(homePage.checkIsFrame(), "Frame is not found");
        homePage.switchToFrame();
        Assert.assertTrue(homePage.checkIsPresentMenuLaptop(), "Laptop is not found");
    }

    //проверить возможность добавления товара в корзину
    @Test
    public void testCheckCart() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        Assert.assertTrue(homePage.checkIsPresentTittleCatalog(), "Title Catalog is not found");
        CatalogOnlinerPage catalogOnlinerPage =  homePage.clickOnTittleCatalog();
        Assert.assertTrue(catalogOnlinerPage.checkIsPresentMenuItemComputer(), "Computer and Network is not found");
        catalogOnlinerPage.clickMenuItemComputerAndNetwork();
        Assert.assertTrue(catalogOnlinerPage.checkIsPresentMenuItemLaptop(), "Item Menu Laptop is not found");
        ProductPage productPage = catalogOnlinerPage.clickMenuItemLaptop();
        Assert.assertTrue(productPage.checkIsPresentLinkLaptop(), "Link laptop is not found");
        productPage.clickOnLinkLaptop();
        Assert.assertTrue(productPage.checkIsPresentLaptopHuawei(), "Laptop is not found");
        productPage.clickOnHuaweiLaptop();
        Assert.assertTrue(catalogOnlinerPage.checkIsPresentButtonCart(), "Button for add to cart is not found");
        catalogOnlinerPage.clickOnButtonAddToCart();
        catalogOnlinerPage.clickOnGoToCart();
        Assert.assertTrue(catalogOnlinerPage.checkIsPresentCountProduct(), "Count Of Product is not found");
        Assert.assertEquals(catalogOnlinerPage.getTextInCountProduct(), OnlinerUtils.createExpectedCountProduct());
    }

    //проверить, что при выборе автобарахолки отображается верхнее меню из 3 пунктов
    @Test
    public void testCheckListAutoMarket() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        Assert.assertTrue(homePage.checkIsPresentAutoMaret(), "AutoMarket is not Visible");
        AvOnlinerPage avOnlinerPage =  homePage.clickOnAutomarket();
        Assert.assertTrue(avOnlinerPage.checkIsPresentMenuAutoMarketItem(), "Menu Auto Market is not found");
        Assert.assertEquals(avOnlinerPage.getTextListItemOfMenuAutoMarket(), OnlinerUtils.createListMenuAutoMarket());
    }

}

