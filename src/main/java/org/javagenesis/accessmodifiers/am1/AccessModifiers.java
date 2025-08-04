package org.javagenesis.accessmodifiers.am1;

public class AccessModifiers {
    int num1;
    private int num2;
    protected int num3;
    public int num4;

//    default: Only in the same package
//    private: Only within the same class
//    protected: Within the same package and child classes in other packages
//    public : Visible in every package within the project
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.num1);
        System.out.println(obj.num2);
        System.out.println(obj.num3);
        System.out.println(obj.num4);
    }

}
