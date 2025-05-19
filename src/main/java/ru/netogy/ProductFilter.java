package ru.netogy;

import java.util.List;

// Принцип SRP: Класс ProductFilter отвечает только за фильтрацию товаров
class ProductFilter {
    public static List<Product> filterByKeyword(List<Product> products, String keyword) {
        return products.stream()
                .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }

    public static List<Product> filterByPriceRange(List<Product> products, double minPrice, double maxPrice) {
        return products.stream()
                .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                .toList();
    }

    public static List<Product> filterByManufacturer(List<Product> products, String manufacturer) {
        return products.stream()
                .filter(p -> p.getManufacturer().equalsIgnoreCase(manufacturer))
                .toList();
    }
}
