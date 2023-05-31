package be.intecbrussel.singletonpattern;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static Inventory inventory;
    private final List<Product> products;

    private Inventory() {
        this.products = new ArrayList<>();
    }

    public static Inventory getInventory() {
        if (inventory == null) {
            inventory = new Inventory();
        }

        return inventory;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void showProductsList() {
        products.forEach(product -> System.out.println(product.getName()));
    }

}
