package com.qaprosoft.carina.demo.onliner;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.db.models.onliner.Laptop;
import com.qaprosoft.carina.demo.onliner.pages.CatalogOnlinerPage;
import com.qaprosoft.carina.demo.onliner.pages.HomePage;
import com.qaprosoft.carina.demo.utils.utilsOnliner.LaptopBuilder;
import com.qaprosoft.carina.demo.utils.utilsOnliner.OnlinerUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlinerTest implements IAbstractTest {

    //Проверка присутствия на страницы каталога секций: "Onliner Prime", "Электроника", "Компьютеры и сети",
    // "Бытовая техника", "На каждый день", "Стройка и ремонт", "Дом и сад", "Авто и мото", "Красота и спорт",
    //"Детям и мамам"

    @Test
    public void testCheckLogin() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        Assert.assertTrue(homePage.checkIsPresentTittleCatalog(), "Title Catalog is not found");
        homePage.clickOnTittleCatalog();
        CatalogOnlinerPage catalogOnlinerPage = new CatalogOnlinerPage(getDriver());
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
        homePage.clickOnTittleCatalog();
        CatalogOnlinerPage catalogOnlinerPage = new CatalogOnlinerPage(getDriver());
        Assert.assertTrue(catalogOnlinerPage.checkIsPresentMenuItemComputer(), "Computer and Network is not found");
        catalogOnlinerPage.clickMenuItemComputerAndNetwork();
        Assert.assertTrue(catalogOnlinerPage.checkIsPresentMenuItemLaptop(), "Item Menu Laptop is not found");
        catalogOnlinerPage.clickMenuItemLaptop();
        Assert.assertTrue(catalogOnlinerPage.checkIsPresentLinkLaptop(), "Link laptop is not found");
        catalogOnlinerPage.clickOnLinkLaptop();
        Assert.assertTrue(catalogOnlinerPage.checkIsPresentLaptopHuawei(), "Laptop Huawei is not found");
        catalogOnlinerPage.clickOnHuaweiLaptop();
        Laptop laptopExpected = LaptopBuilder.createLaptopExpected();
        Assert.assertEquals(laptopExpected, catalogOnlinerPage.setActualLaptop(), "Laptop Huawei is not found");


    }

    // тест на проверку, что в поиске при выборе ноутбуков, отображается раздел с ноутбуками
    @Test
    public void testSearchLaptop() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        Assert.assertTrue(homePage.checkIsPresentSearchElement(), "Search is not found");
        homePage.inputDataInSearch();
        Assert.assertTrue(homePage.checkIsPresentMenuLaptop(), "Laptop is not found");


    }
    //проверить возможность добавления товара в корзине
    //проверить, что при выборе комплектующие отображается список меню
}

//1. создаем модель с гетерами и сетерами, переопределяем эквалс и хэшкод
//2. создаем продукт билдер. В нем создаем объект и чере set закидываю значения.
//3.  в тесте я создаю объект и через get получаю объект
// 4.
