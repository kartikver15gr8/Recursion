package com.Recursion.Assignment;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] arr = {-5, 8, -7, 0, 100, 97};
        System.out.println(sortedOrNot(nums, 0));;
        System.out.println(sortedOrNot(arr, 0));
    }

    static boolean sortedOrNot(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return sortedOrNot(arr, index + 1);
    }
}
