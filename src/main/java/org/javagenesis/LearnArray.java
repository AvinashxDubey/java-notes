package org.javagenesis;

import java.util.Arrays;

public class LearnArray {
    public static void main(String[] args) {
        int[] nums = rotateArrKTimes(new int[] {1, 2, 3, 4, 5}, 2);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] rotateArrKTimes(int[] arr, int k){
        /**
         *  1 2 3 4 5, k=2
         *  4 5 1 2 3 (after rotating 2 times)
         * Note: there's a reversing algo where you could just reverse the whole arr
         * then just reverse the 0 to k-1 part and k to n-1 part separately
         *
         */
        while(k>0){
            rotateOnce(arr);
            k--;
        }
        return arr;
    }

    private static void rotateOnce(int[] arr) {
        /**
         *  1 2 3 4 5, k=2
         *  4 5 1 2 3 (after rotating 2 times)
         * Note: there's a reversing algo where you could just reverse the whole arr
         * then just reverse the 0 to k-1 part and k to n-1 part separately
         *
         */
        int temp=arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}

/**
 * Array is stored in the contiguous memory location
 * int[] arr = new {3, 5, 6, 7}
 *
 * arr -> Location of the array
 *
 * address of elements in memory:
 *
 * 0th : arr + 0
 * 1th : arr + 1
 * nth : arr +
 *
 */
