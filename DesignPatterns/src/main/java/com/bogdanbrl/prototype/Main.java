package com.bogdanbrl.prototype;

/**
 * @author Double "B"
 * @created 09/04/2021 - 8:06 PM
 * @project DesignPatterns
 * <p>
 * <p>
 * prototype pattern involve making copies of one original object
 * useful when you want to create o new object, but a similar one already exists,
 * it should be used when you do not want a system to know details of how objects are created
 * Useful when creating a new object is a memory-intensive process. So you clone it (like characters into a game - birds, animals etc), making the app faster
 * the cloned object can be modified, can clone it, after that give it its own name
 * the required object must implements Cloneable
 * there will be problems with fields that are mutable. This problem can be resolved if the second class (Person class) also implements cloneable
 */
public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(8);
        rabbit.setOwner(new Person("Sally"));
        Rabbit rabbitCopy = rabbit.clone();
        System.out.println("Age of first rabbit: " + rabbit.getAge());
        System.out.println("Age of second rabbit: " + rabbitCopy.getAge());

        rabbitCopy.getOwner().setName("Steve");
        System.out.println("Owner of first rabbit: " + rabbit.getOwner().getName());
        System.out.println("Owner of second rabbit: " + rabbitCopy.getOwner().getName());
    }
}
