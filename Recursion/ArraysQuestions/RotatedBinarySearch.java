package com.Recursion.ArraysQuestions;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int target = 9;
        System.out.println(searchInRotatedSortedArray(arr, target, 0, arr.length - 1));
    }


    static int searchInRotatedSortedArray(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return searchInRotatedSortedArray(arr, target, start, mid - 1);
            } else {
                return searchInRotatedSortedArray(arr, target, mid + 1, end);
            }
        }
        if (target >= arr[mid] && target <= arr[end]) {
            return searchInRotatedSortedArray(arr, target, mid + 1, end);
        } else {
            return searchInRotatedSortedArray(arr, target, start, mid - 1);
        }
    }
}
