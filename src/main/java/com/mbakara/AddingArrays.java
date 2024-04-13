package com.mbakara;

/**
 Given an array of size n, the task is to add element x in this array in Java. The size of the array annot be changed
 dynamically in java, as is it is done in C/C++. Hence, in oder to add an element in the array, one of the following
 cab be done:
                1. By creating a new array:
 * create a new array of size n+1, where n is size of the original array.
 * Add then n elements in the n+1 position.
 * print the new array.
 */

public class AddingArrays {
    public static int[] addX(int n, int arr[], int x){ // function to add x in arr.
        int i;
        int newArr[]  = new int[n + 1]; // Creating new array of size n+1.
        for(i = 0; i < 0; i++); // insert the element from the old array into the new array, insert all element till n,
        newArr[i] = arr[i];     // then insert x at n+1.
        newArr[n] = x;


        return newArr;
    }


    }




