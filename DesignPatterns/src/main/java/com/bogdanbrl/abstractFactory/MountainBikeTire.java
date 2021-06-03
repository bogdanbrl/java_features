package com.bogdanbrl.abstractFactory;

/**
 * @author Double "B"
 * @created 09/04/2021 - 9:15 PM
 * @project DesignPatterns
 */
public class MountainBikeTire extends Tire{

    private static final String width = "WIDE";

    private static final String pressure = "MEDIUM";

    @Override
    public void getDescription() {
        System.out.println("Mountain bike tire. Width: " + width + ", pressure: " + pressure);
    }
}
