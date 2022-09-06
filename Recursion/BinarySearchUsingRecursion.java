package com.Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 19, 25, 97, 100};
        System.out.println(BSUsingRecursion(arr, 100, 0, arr.length - 1));
    }

    static int BSUsingRecursion(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target > arr[mid]) {
            start = mid + 1;
            return BSUsingRecursion(arr, target, start, end);
        }
        if (target < arr[mid]) {
            end = mid - 1;
        }
        return BSUsingRecursion(arr, target, start, end);
    }
}
