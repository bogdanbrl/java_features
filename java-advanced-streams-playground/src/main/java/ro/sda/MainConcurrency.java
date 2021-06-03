package ro.sda;


import java.util.*;
import java.util.stream.Collectors;

public class MainConcurrency {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
//        StopWatch stopWatch1 = new StopWatch("samsung");
//        StopWatch stopWatch2 = new StopWatch("fit bit");
//        Thread stepCounter = new Thread(new StepCounter());
//        stopWatch1.start();
//        stopWatch2.start();
//        stepCounter.start();

        Bench bench = new Bench(1);

        Thread seatTaker1 = new Thread(new SeatTakerThread(bench));
        Thread seatTaker2 = new Thread(new SeatTakerThread(bench));
        seatTaker1.start();
        seatTaker2.start();
        System.out.println("Main thread stops");
    }

}
