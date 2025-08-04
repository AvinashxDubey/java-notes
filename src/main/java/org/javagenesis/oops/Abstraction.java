package org.javagenesis.oops;

public class Abstraction {

    public static void main(String[] args) {
        DemoImpl obj = new DemoImpl();
        obj.move();
        obj.eat();
    }

    /** Abstraction:
     *
     * 100% -> Interfaces
     * 0-100% -> Abstract Classes
     *
     */
}

/**
 * Abstract
 */
abstract class Demo1{
    public abstract void move();  // if all the methods were abstract then this would be 100% abstraction

    public void eat(){            // if all the methods werent abstract then 0% abstraction
        System.out.println("eating food");
    }
//    mix of both these type of methods would give 0-100% abstraction
}

//DemoImp is an Internal class which extends an abstract class
class DemoImpl extends Demo1{
    //if this derived class does not provide implementation for the parent abstract class
    //then it must be declared abstract as well
    @Override
    public void move() {
        System.out.println("walking hastily");
    }
}
