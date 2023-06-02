package be.intecbrussel.compositepattern.ingredients;

import be.intecbrussel.compositepattern.Ingredient;

public class Mincemeat implements Ingredient {
    @Override
    public void mix() {
        System.out.println("Adding mincemeat...");
    }
}
