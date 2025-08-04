package org.javagenesis.oops.polymorphism;

public class CompileTimePolymorphism {
    /**
     * Poly (multiple) + morph(form)
     * 1. Compile-time/ static polymorphism
     * 2. Run-time/ dynamic polymorphism
     */
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(4, 5));
        System.out.println(obj.add(4, 5, 6));
//        System.out.println(obj.add(4,5,6,7));
//        error occurs during compile-time thus compile-time polymorphism
    }
}

class Calculator{
//    method overloading
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
}
