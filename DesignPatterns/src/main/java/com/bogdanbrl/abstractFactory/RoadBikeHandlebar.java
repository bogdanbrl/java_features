package com.bogdanbrl.abstractFactory;

/**
 * @author Double "B"
 * @created 09/04/2021 - 9:18 PM
 * @project DesignPatterns
 */
public class RoadBikeHandlebar extends Handlebar{

    private static final String type = "DROP";

    @Override
    void getDescription() {
        System.out.println("Road bike handlebar. Type: " +type + ".");
    }
}
