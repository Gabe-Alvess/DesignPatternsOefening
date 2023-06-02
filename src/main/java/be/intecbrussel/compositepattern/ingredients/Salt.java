package be.intecbrussel.compositepattern.ingredients;

import be.intecbrussel.compositepattern.Ingredient;

public class Salt implements Ingredient {
    @Override
    public void mix() {
        System.out.println("Adding salt...");
    }
}
