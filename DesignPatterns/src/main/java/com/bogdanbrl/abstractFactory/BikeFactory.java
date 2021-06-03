package com.bogdanbrl.abstractFactory;

/**
 * @author Double "B"
 * @created 09/04/2021 - 9:09 PM
 * @project DesignPatterns
 */
public abstract class BikeFactory {

    abstract BikePart create(String type);
}
