package com.Recursion.Assignment;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 16, 45, 87, 97, 100};
        int target = 8;
        System.out.println(BSUsingRecursion(arr, target));
    }

    static int BSUsingRecursion(int[] arr, int target) {
        return helper(arr, target, 0, arr.length - 1);
    }

    static int helper(int[] nums, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (target == nums[mid]) {
            return mid;
        }
        if (target > nums[mid]) {
            return helper(nums, target, mid + 1, end);
        }
        return helper(nums, target, start, mid - 1);
    }
}
