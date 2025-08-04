package org.javagenesis;

public class LearnStringsAndImmutability {
    public static void main(String[] args) {
        String name = new String("yo");
        String name1 = "yo";
        String name2 = "yo";
        System.out.println(name==name1);//true cz the address is same
        String name3 = new String("yo");
        System.out.println(name==name3);//false cz the address is diff
        System.out.println(reverse("Avinash"));

    }

    /**
     * Stack                Heap            [String Pool]
     * name   ----------->  vObj             vObj(name, name1, name2, name3)
     * name1
     * name2
     * name3  ----------->  vObj1
     */


    /**
     * Class immutable -> No one can change the property
     * 1. private variables and Setters
     * 2. Method -> No one should be able to override the methods : final
     * 3. final class
     *
     */
    //extra - reflection api(does shit exceptional to java oops)

    /**
     * reverse a string
     */
    public static String reverse(String s){
//        String rev = "";
//        for(int i=s.length()-1; i>=0; i--){
//            rev+=s.charAt(i);     //memory leak cz objects are being created for each concatenation
//        }
        StringBuilder rev = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            rev.append(s.charAt(i));     //memory leak cz objects are being created for each concatenation
        }
        return rev.toString();
    }
}

final class ImmutableClass{
    private int num1;
    private String str1;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setStr1(String str1) {
        this.str1 = str1 ;
    }
}
