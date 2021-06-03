package com.bogdanbrl.singleton;

/**
 * @author Double "B"
 * @created 09/04/2021 - 7:53 PM
 * @project DesignPatterns
 */
public class PrintSpooler {

    private static final PrintSpooler spooler = new PrintSpooler();

    private PrintSpooler() {
        init();
    }

    private void init() {
        //code to initialize our print spooler goes here
    }

    public static synchronized PrintSpooler getInstance() {
        return spooler;
    }
}
