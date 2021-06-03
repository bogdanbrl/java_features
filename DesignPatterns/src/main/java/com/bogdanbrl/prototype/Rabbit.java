package com.bogdanbrl.prototype;

/**
 * @author Double "B"
 * @created 09/04/2021 - 8:13 PM
 * @project DesignPatterns
 */
public class Rabbit implements Cloneable{

    public enum Breed{
        HIMALAYAN,
        AMERiCAN,
        MINI_REX,
        LIONHEAD,
        DUTCH
    }

    private int age;
    private Breed breed;
    private Person owner;

    public Rabbit() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person person) {
        this.owner = person;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    @Override
    protected Rabbit clone() {
        try{
            Rabbit rabbit = (Rabbit) super.clone();
            rabbit.owner = owner.clone();
            return rabbit;
        }catch (CloneNotSupportedException ex){
            throw  new AssertionError();
        }
    }
}
