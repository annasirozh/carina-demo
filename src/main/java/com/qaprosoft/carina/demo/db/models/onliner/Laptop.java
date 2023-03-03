package com.qaprosoft.carina.demo.db.models.onliner;

import java.util.Objects;

public class Laptop {
    private String nameOfLaptop;
    private String memory;
    private String price;

    public String getNameOfLaptop() {
        return nameOfLaptop;
    }

    public void setNameOfLaptop(String nameOfLaptop) {
        this.nameOfLaptop = nameOfLaptop;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(nameOfLaptop, laptop.nameOfLaptop) && Objects.equals(memory, laptop.memory) && Objects.equals(price, laptop.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfLaptop, memory, price);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "nameOfLaptop='" + nameOfLaptop + '\'' +
                ", memory='" + memory + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}