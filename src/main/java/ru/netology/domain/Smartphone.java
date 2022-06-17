package ru.netology.domain;

public class Smartphone extends Product {
    private final String brand;
    private final String name;

    public Smartphone(int id, String name, int price, String brand) {
        super(id, name, price);
        this.brand = brand;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }


}