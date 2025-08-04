package org.javagenesis.oops;

public interface AnimalInterface {
    public void eat();

    public void speak();
    /**
     * 100% Abstraction
     * Abstraction benefits:
     * 1) allows to update source code without changing the end user exp
     * 2) secures data by hiding unnecessary details from end user
     */
}

class Dog implements AnimalInterface{
    @Override
    public void eat() {
        System.out.println("eats dog food");
    }

    @Override
    public void speak() {
        System.out.println("bark!!bark!!");
    }
}
