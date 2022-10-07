package com.revature.sep_12;

import java.util.Arrays;

// b) Write a function that returns true if you can partition an array into one element and the rest, such that this
// element is equal to the product of all other elements excluding itself.
public class DriverB {
    public static boolean canPartition(int[] array)  {
        Arrays.sort(array);
        int product = 1;
        int n = array.length;
        int target = array[n-1];

        for(int i = 0; i < n-1; i++) {
            product = product * Math.abs(array[i]);
        }

        if (product == target) {
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 1};
        System.out.println(canPartition(arr));  // true

        int[] arr1 = {-1, -10, 1, -2, 20};
        System.out.println(canPartition(arr1));  // true

        int[] arr2 = {-1, -20, 5, -1, -2, 2};
        System.out.println(canPartition(arr2));  // false
    }
}
