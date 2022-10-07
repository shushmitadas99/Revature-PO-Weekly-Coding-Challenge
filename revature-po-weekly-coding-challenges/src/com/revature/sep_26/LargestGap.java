package com.revature.sep_26;

import java.util.Arrays;

public class LargestGap {
    public static int largestGap (int[] array){
        Arrays.sort(array);
        int largestGapInt = 0;
        int difference = Math.abs(array[1] - array[0]);

        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < array.length; j++){
                if (array[j] - array[i] > difference) {
                    difference = Math.abs(array[j] - array[i]);
                    largestGapInt = difference;
                }
            }
        }
        return largestGapInt;
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        int[] arr2 = {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};
        int[] arr3 = {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};

        System.out.println(largestGap(arr1));
        System.out.println(largestGap(arr2));
        System.out.println(largestGap(arr3));
    }
}
