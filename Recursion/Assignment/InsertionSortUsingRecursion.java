package com.Recursion.Assignment;

import java.util.Arrays;

public class InsertionSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {-5, 8, -7, 0, 100, 97};
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr, int arrayLength) {
        if (arrayLength <= 1) {
            return;
        }
        insertionSort(arr, arrayLength - 1);
        int last = arr[arrayLength - 1];
        int j = arrayLength - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }
}
