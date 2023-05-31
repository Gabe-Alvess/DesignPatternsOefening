package be.intecbrussel.singletonpattern;

public class App {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInstance();

        Product apple = new Product("Apple");
        Product apple1 = new Product("Apple");
        Product apple2 = new Product("Apple");
        Product apple3 = new Product("Apple");
        Product soda = new Product("Soda");
        Product chocolate = new Product("Chocolate");
        Product pizza = new Product("Pizza");
        Product chips = new Product("Chips");

        inventory.addProduct(apple);
        inventory.addProduct(apple1);
        inventory.addProduct(apple2);
        inventory.addProduct(apple3);
        inventory.addProduct(soda);
        inventory.addProduct(chocolate);
        inventory.addProduct(pizza);
        inventory.addProduct(chips);

        inventory.showProductList();

        System.out.println("------------------------");

        inventory.removeProduct(chips);
        inventory.removeProduct(apple);

        inventory.showProductList();
    }
}
