package ch_18.concurrency;

/**
 * @author Double "B"
 * @created 01/04/2021 - 11:57 AM
 * @project OCP_java
 */
public class CalculateAverage implements Runnable{

    private double[] scores;

    public CalculateAverage(double[] scores) {
        this.scores = scores;
    }

    @Override
    public void run() {

    }
}
