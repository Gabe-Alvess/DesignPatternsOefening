package be.intecbrussel.compositepattern.ingredients;

import be.intecbrussel.compositepattern.Ingredient;

public class Carrots implements Ingredient {
    @Override
    public void mix() {
        System.out.println("Mixing carrots...");
    }
}
