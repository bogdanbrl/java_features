package com.bogdanbrl.prototype;

/**
 * @author Double "B"
 * @created 09/04/2021 - 8:22 PM
 * @project DesignPatterns
 */
public class Person implements Cloneable{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
