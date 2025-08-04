package org.javagenesis.oops.polymorphism;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Father f1 = new Father();
        Father s1 = new Son();
        /**
         * Aspect	                Base class ref to derived obj           Derived class ref
         * Overridden methods	    Calls derived class version	            Calls derived class version
         * Extra methods in child	Not accessible	                        Fully accessible
         * Type safety	            safer-treat all subclasses uniformly	More flexible, but less general
         */

        f1.advice();
        s1.advice();
    }
}

class Father{
//    public static void advice(){   (every child would have the same implementation)
    public void advice(){   // if this was static there would be no runtime polymorphism for this method
        System.out.println("Son, life ain't all sunshine and rainbows, but it's beautiful still");
    }
}

class Son extends Father{
    @Override               //Run-time Polymorphism
    public void advice() {
        System.out.println("Yeah dad, there's beauty in the struggle.");
    }
}
