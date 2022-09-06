package com.Recursion.Assignment;

public class MaxAndMinValueInArray {
    public static void main(String[] args) {
        int[] arr = {2, 7, 0, 15, -1, 89, 97, 100};
        System.out.println("The maximum value in the array is:");
        System.out.println(maxValue(arr, 0));
        System.out.println("The minimum value in the array is:");
        System.out.println(minValue(arr, 0));
    }

    static int max = 0;
    static int min = 0;
    static int maxValue(int[] arr, int start) {
        if (start == arr.length) {
            return max;
        }
        if (arr[start] > max) {
            max = arr[start];
        }
        return maxValue(arr, start + 1);
    }
    static int minValue(int[] arr, int start) {
        if (start == arr.length) {
            return min;
        }
        if (arr[start] < min) {
            min = arr[start];
        }
        return minValue(arr, start + 1);
    }
}
