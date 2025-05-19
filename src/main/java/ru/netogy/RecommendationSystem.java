package ru.netogy;

import java.util.List;
import java.util.Map;

// Принцип DIP: Класс RecommendationSystem зависит от абстракции (Product), а не от конкретной реализации
class RecommendationSystem {
    private List<Product> products;

    public RecommendationSystem(List<Product> products) {
        this.products = products;
    }

    public List<Product> recommend(Map<String, String> preferences) {
        return products.stream()
                .filter(p -> preferences.get("manufacturer") != null && preferences.get("manufacturer").equalsIgnoreCase(p.getManufacturer())
                        || preferences.get("keyword") != null && p.getName().toLowerCase().contains(preferences.get("keyword").toLowerCase()))
                .toList();
    }
}
