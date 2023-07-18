package app;

import app.entity.Product;
import app.operators.FilterProducts;
import app.operators.FilterStrings;
import app.outputGetter.OutputGetter;
import app.providers.DataProvider;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        executeTaskOne();
        executeTaskTwo();
    }

    private static void executeTaskOne() {
        System.out.println("----------Task 1----------");
        List<String> names = DataProvider.getNames();
        OutputGetter.getInitDataMsg();
        OutputGetter.getStreamOutput(names.stream());

        Stream<String> filteredNames = FilterStrings.filterLetter(names, "M");
        OutputGetter.getFilteredDataMsg();
        OutputGetter.getStreamOutput(filteredNames);
    }

    private static void  executeTaskTwo() {
        System.out.println("\n----------Task 2----------");
        List<Product> products = DataProvider.getProducts();
        OutputGetter.getInitDataMsg();
        OutputGetter.getStreamOutput(products.stream().map(Product::getName));

        Stream<Product> filteredProducts = FilterProducts.filterPrices(products);
        OutputGetter.getFilteredDataMsg();
        OutputGetter.getStreamOutput(filteredProducts.map(Product::getName));
    }
}
