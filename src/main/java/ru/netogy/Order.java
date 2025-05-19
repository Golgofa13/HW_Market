package ru.netogy;

import java.util.List;

public abstract class Order {
    protected int orderId;
    protected List<Product> products;

    public Order(int orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public abstract void process();
}
