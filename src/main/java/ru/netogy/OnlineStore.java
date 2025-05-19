package ru.netogy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class OnlineStore {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 1200, "Dell"),
                new Product(2, "Smartphone", 800, "Apple"),
                new Product(3, "Tablet", 400, "Samsung"),
                new Product(4, "Monitor", 300, "LG")
        );

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(products.get(0), 1);
        cart.addProduct(products.get(1), 2);

        System.out.println("Cart total price: $" + cart.getTotalPrice());

        List<Product> filteredProducts = ProductFilter.filterByKeyword(products, "phone");
        System.out.println("Filtered products: " + filteredProducts);

        RecommendationSystem recommendationSystem = new RecommendationSystem(products);
        List<Product> recommendations = recommendationSystem.recommend(Map.of("manufacturer", "Apple"));
        System.out.println("Recommended products: " + recommendations);

        Order order = new DeliveryOrder(1, cart.getProducts(), "123 Main St");
        order.process();
    }
}
