package com.bogdanbrl.abstractFactory;

/**
 * @author Double "B"
 * @created 09/04/2021 - 9:00 PM
 * @project DesignPatterns
 *
 *
 *
 * provides an interface for creating families of objects without specifying what their concrete types are
 * It should be used when there is a system that creates objects, but how those objects are created should be hidden from view
 * In particular, it is used when app have families of objects
 * The app should be able to choose which of a selection families it wants to use
 *
 */


public class MainBikeBuilder {

    public static void main(String[] args) {
        createBikeWithoutAbstractFactory();
        createBikeWithAbstractFactory("mountain bike");
    }

    private static void createBikeWithoutAbstractFactory() {
        MountainBikeTire mountainBikeTireFront = new MountainBikeTire();
        MountainBikeTire mountainBikeTireBack = new MountainBikeTire();
        MountainBikeHandlebar mountainBikeHandlebar = new MountainBikeHandlebar();
        mountainBikeTireFront.getDescription();
        mountainBikeTireBack.getDescription();
        mountainBikeHandlebar.getDescription();
        System.out.println();
    }

    private static void createBikeWithAbstractFactory(String type) {
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);
        Tire tireFront = (Tire) bikeFactory.create("tire");
        Tire tireBack = (Tire) bikeFactory.create("tire");
        Handlebar handlebar = (Handlebar) bikeFactory.create("handlebar");
        tireFront.getDescription();
        tireBack.getDescription();
        handlebar.getDescription();
        System.out.println();
    }
}
