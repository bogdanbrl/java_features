package structuralPatterns.decorator;

public class ChristmasLights extends TreeDecorator{


    public ChristmasLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithChristmasLights();
    }

    private String decorateWithChristmasLights(){
        return " with lights ";
    }
}
