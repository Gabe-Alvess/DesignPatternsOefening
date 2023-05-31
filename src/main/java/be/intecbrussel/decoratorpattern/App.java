package be.intecbrussel.decoratorpattern;

import be.intecbrussel.decoratorpattern.treedecorators.BubbleLights;
import be.intecbrussel.decoratorpattern.treedecorators.Garland;
import be.intecbrussel.decoratorpattern.treedecorators.TreeTopper;

public class App {
    public static void main(String[] args) {

        RealChristmasTree rct = new RealChristmasTree();

        System.out.println("-----------------");
        System.out.println("One Decoration");
        System.out.println("-----------------");

        TreeDecorator bubbleLights = new BubbleLights(rct);
        TreeDecorator garland = new Garland(rct);
        TreeDecorator treeTopper = new TreeTopper(rct);

        System.out.println(bubbleLights.decorate());
        System.out.println(garland.decorate());
        System.out.println(treeTopper.decorate());


        System.out.println("-----------------");
        System.out.println("All Decorations");
        System.out.println("-----------------");

        TreeDecorator treeWithEveryThing = new TreeTopper(new BubbleLights(new Garland(rct)));
        System.out.println(treeWithEveryThing.decorate());
    }
}
