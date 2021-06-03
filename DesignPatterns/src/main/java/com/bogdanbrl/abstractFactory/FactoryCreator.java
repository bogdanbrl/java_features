package com.bogdanbrl.abstractFactory;

/**
 * @author Double "B"
 * @created 09/04/2021 - 9:07 PM
 * @project DesignPatterns
 */
public class FactoryCreator {

    public static BikeFactory createFactory(String type){

        if(type.equalsIgnoreCase("mountain bike")){
            return new MountainBikeFactory();
        }else if(type.equalsIgnoreCase("road bike")){
            return new RoadBikeFactory();
        }else {
            System.out.println("Please specify a valid type");
            return null;
        }
    }
}
