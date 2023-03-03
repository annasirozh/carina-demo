package com.qaprosoft.carina.demo.utils.utilsOnliner;

import com.qaprosoft.carina.demo.db.models.onliner.Laptop;
import com.zebrunner.carina.utils.R;

public class LaptopBuilder {

    public static Laptop laptopBuilder() {
        Laptop laptop = new Laptop();
        /*laptop.setNameOfLaptop(R.TESTDATA.get("test_name_of_laptop"));
        laptop.setMemory(R.TESTDATA.get("test_memory"));
        laptop.setPrice(R.TESTDATA.get("test_price"));*/
        laptop.setNameOfLaptop("Ноутбук Huawei MateBook D 15 AMD BoM-WDQ9 53013JJX");
        laptop.setMemory("8 ГБ");
        laptop.setPrice("1899,00 р.");
        return laptop;
    }

    public static Laptop createLaptopExpected() {
        Laptop laptopExpected = laptopBuilder();
        laptopExpected.getNameOfLaptop();
        laptopExpected.getMemory();
        laptopExpected.getPrice();
        return laptopExpected;
    }

}
