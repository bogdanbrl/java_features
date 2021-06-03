package com.bogdanbrl.abstractFactory;

/**
 * @author Double "B"
 * @created 09/04/2021 - 9:18 PM
 * @project DesignPatterns
 */
public class MountainBikeHandlebar extends Handlebar{

    private static final String type = "FLAT";

    @Override
    void getDescription() {
        System.out.println("Mountain bike handlebar. Type: " +type + ".");
    }
}
