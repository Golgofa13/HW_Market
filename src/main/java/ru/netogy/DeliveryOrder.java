package ru.netogy;

import java.util.List;

class DeliveryOrder extends Order {
    private String address;

    public DeliveryOrder(int orderId, List<Product> products, String address) {
        super(orderId, products);
        this.address = address;
    }

    @Override
    public void process() {
        System.out.println("Order " + orderId + " is being delivered to " + address);
    }
}
