package deLaInstructor.singleresponsibility.antiexample;

public class Employee {

    private String name;
    private int age;
    private double salary;

    public void calculatePay() {
        System.out.println("Calculating pay...");
    }

    public void save() {
        System.out.println("Saving employee...");
    }

    public void describeEmployee(){
        System.out.println("Describing employee...");
    }
}
