package org.javagenesis.oops.inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
//        Cat inherits Animal
        Cat kitty = new Cat();
        kitty.eat();

        /**
         * Inheritance1 benefits:
         * 1) establishes relation between objects
         * 2) reuse the code from parent in child
         */
    }
}

class Animal{
    public void eat(){
        System.out.println("Eating!");
    }
}

/**
 * isA test is used for checking if inheritance is valid (like dna tests)
 * for eg: Cat isA Animal, which is true
 */
class Cat extends Animal{

}