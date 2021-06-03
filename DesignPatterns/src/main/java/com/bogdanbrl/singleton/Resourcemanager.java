package com.bogdanbrl.singleton;

/**
 * @author Double "B"
 * @created 09/04/2021 - 7:50 PM
 * @project DesignPatterns
 *
 * create only one instance:
 *      - window managers
 *      - database connectors
 *      - file managers
 *      - UI dialogs
 *      - resource allocators an spoolers
 */
public class Resourcemanager {

    public static void main(String[] args) {
        PrintSpooler spooler = PrintSpooler.getInstance();

        Thread threadOne = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});
        Thread threadTwo = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});

        threadOne.start();
        threadTwo.start();
    }
}
