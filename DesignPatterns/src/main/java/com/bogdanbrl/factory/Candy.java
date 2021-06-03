package com.bogdanbrl.factory;

import java.util.ArrayList;

/**
 * @author Double "B"
 * @created 09/04/2021 - 8:43 PM
 * @project DesignPatterns
 */
public abstract class Candy {

    abstract ArrayList<Candy> makeCandyPackage(int quantity);
}
