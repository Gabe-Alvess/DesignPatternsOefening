package be.intecbrussel.compositepattern.ingredients;

import be.intecbrussel.compositepattern.Ingredient;

public class Zucchinis implements Ingredient {
    @Override
    public void mix() {
        System.out.println("Mixing zucchinis...");
    }
}
