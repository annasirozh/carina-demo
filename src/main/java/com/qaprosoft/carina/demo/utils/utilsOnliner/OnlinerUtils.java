package com.qaprosoft.carina.demo.utils.utilsOnliner;

import java.util.Arrays;
import java.util.List;

public class OnlinerUtils {
    public static String createExpectedCountProduct() {
        String exceptedCountProducts = "1 товар на сумму:";//лучше парсить и вытягивать количество
        return exceptedCountProducts;
    }

    public static List<String> createListMenuItemCatalog() {
        List<String> menuItemCatalogList = Arrays.asList("Onlíner Prime", "Электроника", "Компьютеры и сети", "Бытовая техника",
                "На каждый день", "Стройка и ремонт", "Дом и сад", "Авто и мото", "Красота и спорт", "Детям и мамам");
        return menuItemCatalogList;
    }

    public static List<String> createListMenuAutoMarket() {
        List<String> expectedMenuAutoMarketList = Arrays.asList("Авто", "Мото", "Отзывы об авто");
        return expectedMenuAutoMarketList;
    }
}
