package com.bogdanbrl.factory;

/**
 * @author Double "B"
 * @created 09/04/2021 - 8:31 PM
 * @project DesignPatterns
 *
 *
 *
 * used when a class doesn't know exactly what object types need to be created
 * makes the code much more maintainable
 */
public class CandyStore {

    private static final CandyFactory candyFactory = new CandyFactory();

    public static void main(String[] args) {

        candyFactory.getCandyPackage(12, "chocolate");
        candyFactory.getCandyPackage(7, "chocolate");
        candyFactory.getCandyPackage(14, "hard candy");
        candyFactory.getCandyPackage(20, "hard candy");



    }

}
