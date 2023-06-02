package be.intecbrussel.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Mix implements Ingredient {
    private List<Ingredient> ingredients;

    public Mix() {
        ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
    @Override
    public void mix() {
        for (Ingredient ingredient : ingredients) {
            ingredient.mix();
        }
    }
}
