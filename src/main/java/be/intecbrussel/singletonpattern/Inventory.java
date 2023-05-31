package be.intecbrussel.singletonpattern;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static Inventory inventory;
    private final List<Product> productList;

    private Inventory() {
        this.productList = new ArrayList<>();
    }

    public static Inventory getInstance() {
        if (inventory == null) {
            inventory = new Inventory();
        }

        return inventory;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        while (productList.contains(product)) {
        productList.remove(product);
        }
    }

    public void showProductList() {
        productList.forEach(System.out::println);
    }

}
