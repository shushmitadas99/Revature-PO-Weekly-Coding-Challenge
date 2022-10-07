package com.revature.sep_12;

import java.util.Arrays;
import java.util.Collections;

//a) Create a function that reorders the digits of each numerical element in an array based on ascending (asc)
// or descending (desc) order.
public class DriverA {
    public static void reorderDigits(Integer[] array, String order){
        int n = array.length;


        for (int i = 0; i < n; i++){
            if ((array[i] > 9) && (order == "asc")){
                Arrays.sort(array);
            } else if ((array[i] > 9) && (order == "desc")) {
                Arrays.sort(array, Collections.reverseOrder());
            }
        }
        System.out.printf("\nArray[]: %s", Arrays.toString(array));
    }

    public static void main(String[] args) {
        Integer[] arr = {515, 341, 98, 44, 211};
        Integer[] arr2 = {63251, 78221};
        Integer[] arr3 = {1, 2, 3, 4, 3, 1, 5};

        reorderDigits(arr, "asc");  // Array[]: [44, 98, 211, 341, 515]
        reorderDigits(arr, "desc"); // Array[]: [515, 341, 211, 98, 44]

        reorderDigits(arr2, "asc"); // Array[]: [63251, 78221]
        reorderDigits(arr2, "desc");// Array[]: [78221, 63251]

        reorderDigits(arr3, "asc"); // Array[]: [1, 2, 3, 4, 3, 1, 5]
        reorderDigits(arr3, "desc");// Array[]: [1, 2, 3, 4, 3, 1, 5]
    }
}
