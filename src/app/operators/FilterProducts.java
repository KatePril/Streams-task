package app.operators;

import app.entity.Product;

import java.util.List;
import java.util.stream.Stream;

public class FilterProducts {

    public Stream<Product> filterPrices(List<Product> products) {
        return products.stream().filter(product -> product.getPrice() <= 2.00);
    }
}
