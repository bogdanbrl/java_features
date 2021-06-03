package com.bogdanbrl.abstractFactory;

/**
 * @author Double "B"
 * @created 09/04/2021 - 9:09 PM
 * @project DesignPatterns
 */
public class RoadBikeFactory extends BikeFactory {
    @Override
    BikePart create(String type) {
        if (type.equalsIgnoreCase("tire")) {
            return new RoadBikeTire();
        } else if (type.equalsIgnoreCase("handlebar")) {
            return new RoadBikeHandlebar();
        } else {
            return null;
        }
    }
}
