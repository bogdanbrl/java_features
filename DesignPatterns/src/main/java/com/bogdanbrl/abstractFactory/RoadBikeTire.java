package com.bogdanbrl.abstractFactory;

/**
 * @author Double "B"
 * @created 09/04/2021 - 9:15 PM
 * @project DesignPatterns
 */
public class RoadBikeTire extends Tire{

    private static final String width = "NARROW";

    @Override
    public void getDescription() {
        System.out.println("Road bike tire width: " + width + ".");
    }
}
