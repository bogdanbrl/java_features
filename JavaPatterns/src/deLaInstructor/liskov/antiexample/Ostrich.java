package deLaInstructor.liskov.antiexample;

public class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new IllegalStateException("I cannot fly!");
    }
}
