package ru.netogy;

import java.util.*;

// Принцип LSP: Класс PickupOrder может заменять Order без изменения поведения
class PickupOrder extends Order {
    private String pickupPoint;

    public PickupOrder(int orderId, List<Product> products, String pickupPoint) {
        super(orderId, products);
        this.pickupPoint = pickupPoint;
    }

    @Override
    public void process() {
        System.out.println("Order " + orderId + " is ready for pickup at " + pickupPoint);
    }
}

