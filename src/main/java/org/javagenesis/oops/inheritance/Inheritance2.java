package org.javagenesis.oops.inheritance;

public class Inheritance2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.ghar();
    }
}

// Multi-level Inheritance
class GrandParent{
    public void ghar(){
        System.out.println("Ghar created by Dada Ji");
    }
}

class Parent extends GrandParent{

}

class Child extends Parent{

}
