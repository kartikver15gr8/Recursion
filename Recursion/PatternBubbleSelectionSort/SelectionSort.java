package com.Recursion.PatternBubbleSelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int end) {
        if (end == 0) {
            return;
        }
        swap(arr, max(arr, end), end);
        selectionSort(arr, end - 1);
    }

    static void swap(int[] arr, int start, int i) {
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
    }

    static int max(int[] arr, int end) {
        int ind = 0;
        int max = arr[0];
        for (int i = 0; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ind = i;
            }
        }
        return ind;
    }
}
