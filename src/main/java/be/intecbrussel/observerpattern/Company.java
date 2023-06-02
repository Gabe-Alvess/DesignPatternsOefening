package be.intecbrussel.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Company implements Subject {
    private final List<Observer> observerList;

    public Company() {
        observerList = new ArrayList<>();
    }

    public void createNewProduct(String name, String description, double price) {
        Product product = new Product(name, description, price);
        notifyObservers(product);
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(Product product) {
        observerList.forEach(observer -> observer.update(product));
    }
}
