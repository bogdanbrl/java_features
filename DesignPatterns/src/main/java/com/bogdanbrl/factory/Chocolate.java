package com.bogdanbrl.factory;

import java.util.ArrayList;

/**
 * @author Double "B"
 * @created 09/04/2021 - 8:45 PM
 * @project DesignPatterns
 */
public class Chocolate extends Candy{

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList();
        for (int i = 1; i <= quantity; i++){
            Chocolate chocolate = new Chocolate();
            chocolatePackage.add(chocolate);
        }

        System.out.println("One package of " + quantity + " chocolates has been made!");
        return chocolatePackage;
    }
}
