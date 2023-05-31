package be.intecbrussel.decoratorpattern.treedecorators;

import be.intecbrussel.decoratorpattern.ChristmasTree;
import be.intecbrussel.decoratorpattern.TreeDecorator;

public class Garland extends TreeDecorator {
    public Garland(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + "with garlands ";
    }
}
