package com.bogdanbrl.builder;

import java.awt.*;

/**
 * @author Double "B"
 * @created 09/04/2021 - 7:13 PM
 * @project DesignPatterns
 */
public interface Builder {
    Builder setDimensions(Dimension dimensions);

    Builder setCeilingHeight(int ceilingHeight);

    Builder setFloorNumber(int floorNumber);

    Builder setWallColor(Color wallColor);

    Builder setNumberOfWindows(int numberOfWindows);

    Builder setNumberOfDoors(int numberOfDoors);
}
