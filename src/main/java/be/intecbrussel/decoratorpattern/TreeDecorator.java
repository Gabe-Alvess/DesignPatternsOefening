package be.intecbrussel.decoratorpattern;

public abstract class TreeDecorator implements ChristmasTree {
    private final ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
       return christmasTree.decorate();
    }
}
