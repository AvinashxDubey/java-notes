package org.javagenesis;

public class Recursion {

    public static void main(String[] args) {
//        print the arr recursively
        int[] arr = {1, 2, 3, 4, 5};
        printArr(arr);
//        checking palindrome
        int[] nums = {1, 2, 2, 1, 1};
        System.out.println(checkPalindrome(nums , 0, nums.length-1));
//        tower of hanoi
        /**
         * S(n) D A -> S D(n) A -> moves(S, D, A, n)
         *
         * 1. moving n-1 smaller coins from S to A -> moves(S, A, D, n-1)
         * 2. moving 1 large coin from S to D -> 1
         * 3. moving n-1 smaller coins from A to D -> moves(A, D, S, n-1)
         *
         */
    }


    public static void printArr(int[] arr){  //method makes use of helper
        System.out.print("[ ");              //helper uses recursion
        printArrRecHelper(arr, 0);
        System.out.println("] ");
    }

    public static void printArrRecHelper(int[] arr, int i){
        if(i>=arr.length) return;
        System.out.print(arr[i] + " ");
        printArrRecHelper(arr, i+1);
    }


    public static boolean checkPalindrome(int[] nums, int start, int end){
        if(end<=start) return true;
        return (nums[start]==nums[end]) && checkPalindrome(nums, start+1, end-1);
    }

    /**
     *
     * Recursion: Base Condition + Logic + Recursive calls
     * 1) forward recursion
     * a) base condition
     * b) logic
     * c) recursive call
     *
     * 2) backward recursion
     * a) base condition
     * b) logic
     * c) recursive call
     *
     */

}
