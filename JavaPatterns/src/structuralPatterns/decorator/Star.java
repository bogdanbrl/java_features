package structuralPatterns.decorator;

public class Star extends TreeDecorator {

    public Star(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithStar();
    }

    private String decorateWithStar(){
        return " with star ";
    }
}
