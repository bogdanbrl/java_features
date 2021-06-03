package structuralPatterns.decorator;

public class MainDecoratorPattern {

    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTreeImplementation();
        ChristmasTree christmasTreewithLights = new ChristmasLights(christmasTree);
        System.out.println(christmasTreewithLights.decorate());

        ChristmasTree christmasTreeWithlightsAndGarland = new Garland(new ChristmasLights(christmasTree));
        System.out.println(christmasTreeWithlightsAndGarland.decorate());

        ChristmasTree christmasTreeWithlightsAndGarlandAndStar = new Star(new Garland(new ChristmasLights(christmasTree)));
        System.out.println(christmasTreeWithlightsAndGarlandAndStar.decorate());

        ChristmasTree christmasTreeWithlightsAndGarlandAndStar2 = new Star(christmasTreeWithlightsAndGarland);
        System.out.println(christmasTreeWithlightsAndGarlandAndStar2.decorate());

    }

}
