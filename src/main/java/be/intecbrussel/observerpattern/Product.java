package be.intecbrussel.observerpattern;

public class Product {
    private final String name;

    private final String description;

    private final double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product -> " +
                "Name: " + name +
                " -> Description: " + description +
                " -> Price: " + price;
    }
}
