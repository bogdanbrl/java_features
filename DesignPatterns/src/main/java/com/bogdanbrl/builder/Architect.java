package com.bogdanbrl.builder;

import java.awt.*;

/**
 * @author Double "B"
 * @created 09/04/2021 - 6:50 PM
 * @project DesignPatterns
 */
public class Architect {

    public static void main(String[] args) {

        Bedroom bedroom = new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeilingHeight(132).setFloorNumber(2).setWallColor(Color.yellow).setNumberOfWindows(2).setNumberOfDoors(1).setIsDouble(true).setHasEnsuite(true).createBedroom();
        System.out.println(bedroom);

    }
}
