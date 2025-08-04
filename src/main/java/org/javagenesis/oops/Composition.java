package org.javagenesis.oops;

public class Composition {
    /**
     * Composition is like possession or ownership of one object by another
     * hasA test is used for checking composition
     * for eg: Person hasA Car which is true, thus person owns the car
     */
}

class Person{
    private String name;
    private int age;
    private Car car; // Composition

}

class Car{
    private String model;
    private String color;
}
