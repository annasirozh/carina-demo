package com.qaprosoft.carina.demo.utils.mobileLamoda;

import java.util.Arrays;
import java.util.List;

public class LamodaList {



    public static List<String> createListMenuItemCatalogNews() {
        List<String> menuExpectedItemCatalogNewsList = Arrays.asList("Все товары","Одежда","Обувь","Аксессуары","Premium",
                "Спорт", "Красота");
        return menuExpectedItemCatalogNewsList;
    }

    public static String expectedStringCard(){
        String expectedString = "Товаров пока нет";
        return expectedString;
    }

    public static String expectedResultResearch(){
        String expectedString = "nike кроссовки";
        return expectedString;
    }
    public static String expectedItemMenuClothes(){
        String expectedString = "Боди";
        return expectedString;
    }
}
