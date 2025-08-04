package org.javagenesis.practice;

public class Patterns {

    public static void solidSquare(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void starTriagnle(int n){
        for(int i=n-1; i>=0;  i--){
            for(int j=i; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberTriFlipped(int n){
        for(int i=1; i<=n; i++){
            for(int k=n-i-1; k>=0; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=n-i-1; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=1; j<2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternA(){
//        Grid pattern approach
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==0 && j==2) System.out.print("*");
                else if(i==1 && (j==1 || j==3)) System.out.print("*");
                else if(i==2) System.out.print("*");
                else if(i>2 && (j==0 || j==4)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    /*

         0 1 2 3 4
       0     *
       1   *   *
       2 * * * * *
       3 *       *
       4 *       *
     */

    public static void main(String[] args) {
        solidSquare(5);
        System.out.println();
        starTriagnle(5);
        System.out.println();
        numberTriFlipped(5);
        System.out.println();
        pyramid(5);
        System.out.println();
        patternA();
    }
}
