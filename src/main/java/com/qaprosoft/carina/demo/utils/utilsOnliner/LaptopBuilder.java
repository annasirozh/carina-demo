package com.qaprosoft.carina.demo.utils.utilsOnliner;

import com.qaprosoft.carina.demo.db.models.onliner.Laptop;

public class LaptopBuilder {

    public static Laptop laptopBuilder() {
        Laptop laptop = new Laptop();
        laptop.setNameOfLaptop("Ноутбук Apple Macbook Air 13\" M1 2020 MGN63");
        laptop.setMemory("8 ГБ");
        laptop.setPrice("3174,09 р.");
        return laptop;
    }

   /* public static Laptop createLaptopExpected() {
        Laptop laptopExpected = laptopBuilder();
        laptopExpected.getNameOfLaptop("Ноутбук Apple Macbook Air 13\" M1 2020 MGN63");
        laptopExpected.getMemory("8 ГБ");
        laptopExpected.getPrice("3174,09 р.");
        return laptopExpected;
    }*/

}
