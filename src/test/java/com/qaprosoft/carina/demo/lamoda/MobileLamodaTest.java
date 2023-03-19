package com.qaprosoft.carina.demo.lamoda;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.lamoda.*;
import com.qaprosoft.carina.demo.utils.mobileLamoda.LamodaList;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileLamodaTest implements IAbstractTest, IMobileUtils {

    //Тест 1. На проверку того, что в разделе новинки выпадает список
    @Test
    public void testMenuNews() throws InterruptedException {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnCloseButton();
        Assert.assertTrue(homePage.isPageOpened(), "Home page isn't opened");
        Assert.assertTrue(homePage.isPresentCatalog(), "Button catalog is not found");
        CatalogPage catalogPage = homePage.clickOnCatalog();
        Assert.assertTrue(catalogPage.isPresentItemMenu(), "Item menu News is not found");
        catalogPage.clickOnItemMenu();
        Assert.assertEquals(catalogPage.getItemMenuNewsList(), LamodaList.createListMenuItemCatalogNews(), "Menu News is not found");
    }

    //Тест 2. Проверка, что при вводе в поиск "Nike" нам выпадает необходимый результат
    @Test
    public void testSearch() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnCloseButton();
        Assert.assertTrue(homePage.isPageOpened(), "Home page isn't opened");
        Assert.assertTrue(homePage.isPresentSearchButton(), "Search button is not found");
        SearchPage searchPage = homePage.clickOnSearchButton();
        Assert.assertTrue(searchPage.isPresentSearchForm(), "Form for input data search is not found");
        searchPage.inputDataInSearch();
        Assert.assertTrue(searchPage.isPresentResultString(), "Result is not found");
        Assert.assertEquals(searchPage.getResultText(), LamodaList.expectedResultResearch());

    }

    // Тест 3.Проверка, что корзина пустая, сравнивая на наличие строки "Товаров пока нет"
    @Test
    public void testCheckCard() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnCloseButton();
        Assert.assertTrue(homePage.isPageOpened(), "Home page isn't opened");
        Assert.assertTrue(homePage.isPresentCard(), "Card is not found");
        CardPage cardPage = homePage.clickOnCard();
        Assert.assertTrue(cardPage.isCheckTitle(), "Title card is not found");
        Assert.assertEquals(cardPage.getTextTitleCard(), LamodaList.expectedStringCard(), "String is different");

    }

    //Тест 4. Проверка что, в разделе Каталог - Одежда, есть меню боди
    @Test
    public void checkProduct() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnCloseButton();
        Assert.assertTrue(homePage.isPageOpened(), "Home page isn't opened");
        Assert.assertTrue(homePage.isPresentCatalog(), "Button catalog is not found");
        CatalogPage catalogPage = homePage.clickOnCatalog();
        Assert.assertTrue(catalogPage.isPresentClothes(), "Clothes is not found");
        ClothesPage clothesPage = catalogPage.clickOnClothes();
        Assert.assertTrue(clothesPage.isPresentClothesItem(), "Item clothes is not found");
        Assert.assertEquals(clothesPage.getTextActualItemMenuClothes(), LamodaList.expectedItemMenuClothes(), "Item Menu ''Боди' is not found");
    }

    //Тест 5. Проверка, что у товаров есть цена
    @Test
    public void checkPrice() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnCloseButton();
        Assert.assertTrue(homePage.isPageOpened(), "Home page isn't opened");
        Assert.assertTrue(homePage.isPresentCatalog(), "Button catalog is not found");
        CatalogPage catalogPage = homePage.clickOnCatalog();
        Assert.assertTrue(catalogPage.isPresentClothes(), "Clothes is not found");
        ClothesPage clothesPage = catalogPage.clickOnClothes();
        Assert.assertTrue(clothesPage.isPresentClothesItem(), "Item clothes is not found");
        clothesPage.clickOnClothesItem();
        Assert.assertTrue(clothesPage.isPresentProductItem(),"Product item is not found");
        ProductPage productPage = clothesPage.clickOnProductItem();
        Assert.assertTrue(productPage.isPresentPrice(),"Price of product is not found");

    }


}
