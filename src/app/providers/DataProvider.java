package app.providers;

import app.entity.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DataProvider {

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Maria");
        names.add("Marcus");
        names.add("Alice");
        names.add("Edward");
        names.add("Elsa");
        return names;
    }

    public static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk", 2.79));
        products.add(new Product("Bread", 1.89));
        products.add(new Product("Cereal", 2.00));
        products.add(new Product("Tomatoes", 1.54));
        products.add(new Product("Butter", 3.15));
        products.add(new Product("Apples", 1.68));
        return products;
    }

    public static List<Integer> getTemperature() {
        List<Integer> temperatures = new ArrayList<>();
        temperatures.add(9);
        temperatures.add(12);
        temperatures.add(10);
        temperatures.add(14);
        temperatures.add(15);
        temperatures.add(13);
        temperatures.add(8);
        return temperatures;
    }

}
