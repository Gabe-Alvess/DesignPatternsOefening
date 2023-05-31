package be.intecbrussel.decoratorpattern;

public class RealChristmasTree implements ChristmasTree {
    @Override
    public String decorate() {
        return "Christmas tree ";
    }
}
