package org.javagenesis;

 class BasicShi {
    public static void main(String[] args) {
        System.out.println("Hello World");

        /*
        1. Name of java file and public class should be same
        2. If the class is not public -> Name of the file could be different
         */

        //post and pre - increment and decrement
        int i=0;
        System.out.println(i++ - --i + i-- + ++i);
        //while using      0      0    0       0
        //after using      1      0    -1      0


//        checking vararg
        add("these are the nos", 3, 5, 6, 7, 8);
    }
// taking variable no. of parameters (varargs)
// varargs should be the last parameter
// varargs acts like an array
     public static void add(String a, int... numbers){
         System.out.println(a);
         for(int num : numbers){
             System.out.print(num + " ");
         }
     }
}
