package be.intecbrussel.observerpattern;

public class Influencer implements Observer {
    private final String name;

    public Influencer(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println("Hello " + name + ", We've made a new product! Check it out:\n" + product);
    }
}
