package ru.netogy;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        if (quantity < Constants.MIN_ORDER_QUANTITY || quantity > Constants.MAX_ORDER_QUANTITY) {
            throw new IllegalArgumentException("Quantity must be between " + Constants.MIN_ORDER_QUANTITY + " and " + Constants.MAX_ORDER_QUANTITY);
        }
        for (int i = 0; i < quantity; i++) {
            products.add(product);
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotalPrice() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public List<Product> getProducts() {
        return products;
    }
}
