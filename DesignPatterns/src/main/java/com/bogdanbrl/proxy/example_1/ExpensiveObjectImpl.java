package com.bogdanbrl.proxy.example_1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Double "B"
 * @created 15/04/2021 - 1:31 PM
 * @project DesignPatterns
 */
public class ExpensiveObjectImpl implements ExpensiveObject{

    private static final Logger LOG = LoggerFactory.getLogger(ExpensiveObjectImpl.class);

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        LOG.info("Processing complete.");
    }

    private void heavyInitialConfiguration(){
        LOG.info("Loading initial configuration...");
    }
}
