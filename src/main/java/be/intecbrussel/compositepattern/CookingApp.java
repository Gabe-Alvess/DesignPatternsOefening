package be.intecbrussel.compositepattern;

import be.intecbrussel.compositepattern.ingredients.*;

public class CookingApp {
    public static void main(String[] args) {
        line();
        System.out.println("Bolognese Sauce");
        line();

        Mincemeat mincemeat = new Mincemeat();
        Zucchinis zucchinis = new Zucchinis();
        Tomatoes tomatoes = new Tomatoes();
        Carrots carrots = new Carrots();
        Salt salt = new Salt();

        Mix bologneseSauce = new Mix();

        bologneseSauce.addIngredient(tomatoes);
        bologneseSauce.addIngredient(carrots);
        bologneseSauce.addIngredient(zucchinis);
        bologneseSauce.addIngredient(mincemeat);
        bologneseSauce.addIngredient(salt);

        bologneseSauce.mix();

        line();
        System.out.println("Bolognese Pasta");
        line();

        Pasta pasta = new Pasta();

        Mix bolognesePasta = new Mix();

        bolognesePasta.addIngredient(bologneseSauce);
        bolognesePasta.addIngredient(pasta);

        bolognesePasta.mix();
    }

    public static void line() {
        System.out.println("-".repeat(50));
    }
}
