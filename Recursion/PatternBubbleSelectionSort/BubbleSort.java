package com.Recursion.PatternBubbleSelectionSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {78, 98, 74, 1, 0, -1};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int end, int start) {
        if (end == 0) {
            return;
        }
        if (start < end) {
            if (arr[start] > arr[start + 1]) {
                swap(arr, start, start + 1);
            }
            bubbleSort(arr, end, start + 1);
        } else {
            bubbleSort(arr, end - 1, 0);
        }
    }

    static void swap(int[] arr, int start, int i) {
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
    }
}
