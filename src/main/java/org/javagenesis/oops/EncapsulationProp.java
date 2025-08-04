package org.javagenesis.oops;

public class EncapsulationProp {
    /**
     * Binding the data and behaviour together
     * No one should be allowed to access the data directly
     */
}

class Human{
    /**
     * No one access these private fields directly
     */
    private String name;
    private int age;

    /**
     * to allow some level of accessibility for other objects indirectly
     * getters and setters are used
     * with encapsulation we get better level of awareness of how the objects are interacting
     * using getter and setters indirectly with private data/variables
     * is better than using public data directly
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
