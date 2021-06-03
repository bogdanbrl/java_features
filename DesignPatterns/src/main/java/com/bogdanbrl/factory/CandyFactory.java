package com.bogdanbrl.factory;

import java.util.ArrayList;

/**
 * @author Double "B"
 * @created 09/04/2021 - 8:50 PM
 * @project DesignPatterns
 */
public class CandyFactory {

    private Candy getCandy(String type){
        switch (type){
            case "hard candy":
                return new HardCandy();
            case "chocolate":
                return new Chocolate();
            default:
                return null;
        }
    }

    public ArrayList getCandyPackage(int quantity, String type){
        Candy candy = getCandy(type);
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}
