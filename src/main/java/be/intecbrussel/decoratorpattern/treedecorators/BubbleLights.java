package be.intecbrussel.decoratorpattern.treedecorators;

import be.intecbrussel.decoratorpattern.ChristmasTree;
import be.intecbrussel.decoratorpattern.TreeDecorator;

public class BubbleLights extends TreeDecorator {
    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + "with bubble lights ";
    }
}
