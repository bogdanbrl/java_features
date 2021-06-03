package com.bogdanbrl.factory;

import java.util.ArrayList;

/**
 * @author Double "B"
 * @created 09/04/2021 - 8:49 PM
 * @project DesignPatterns
 */
public class HardCandy extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList();
        for (int i = 1; i <= quantity; i++){
            Chocolate chocolate = new Chocolate();
            hardCandyPackage.add(chocolate);
        }

        System.out.println("One package of " + quantity + " chocolates has been made!");
        return hardCandyPackage;
    }
}
