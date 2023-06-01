package be.intecbrussel.decoratorpattern;

import be.intecbrussel.decoratorpattern.treedecorators.BubbleLights;
import be.intecbrussel.decoratorpattern.treedecorators.Garland;
import be.intecbrussel.decoratorpattern.treedecorators.TreeTopper;

public class App {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("Tree Decorators");
        System.out.println("-----------------");

        RealChristmasTree realChristmasTree = new RealChristmasTree();

        TreeDecorator bubbleLights = new BubbleLights(realChristmasTree);
        TreeDecorator garland = new Garland(bubbleLights);
        TreeDecorator treeTopper = new TreeTopper(garland);

        System.out.println(realChristmasTree.decorate());
        System.out.println(bubbleLights.decorate());
        System.out.println(garland.decorate());
        System.out.println(treeTopper.decorate());
    }
}
