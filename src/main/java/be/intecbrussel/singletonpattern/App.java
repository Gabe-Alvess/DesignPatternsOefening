package be.intecbrussel.singletonpattern;

public class App {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInventory();

        Product apple = new Product("Apple");
        Product soda = new Product("Soda");
        Product chocolate = new Product("Chocolate");
        Product pizza = new Product("Pizza");
        Product chips = new Product("Chips");

        inventory.addProduct(apple);
        inventory.addProduct(soda);
        inventory.addProduct(chocolate);
        inventory.addProduct(pizza);
        inventory.addProduct(chips);

        inventory.showProductsList();

        System.out.println("------------------------");

        inventory.removeProduct(chips);
        inventory.removeProduct(soda);

        inventory.showProductsList();
    }
}
