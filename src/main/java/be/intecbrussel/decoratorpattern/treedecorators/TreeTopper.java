package be.intecbrussel.decoratorpattern.treedecorators;

import be.intecbrussel.decoratorpattern.ChristmasTree;
import be.intecbrussel.decoratorpattern.TreeDecorator;

public class TreeTopper extends TreeDecorator {
    public TreeTopper(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + "with tree topper ";
    }
}
