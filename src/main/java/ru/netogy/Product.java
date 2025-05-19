package ru.netogy;

public class Product {
    private int id;
    private String name;
    private double price;
    private String manufacturer;

    public Product(int id, String name, double price, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return name + " (" + manufacturer + ") - $" + price;
    }
}
