package com.Recursion.ArraysQuestions;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 9, 10};
        int target = 10;
        System.out.println(linearSearch(arr, target));

//        int[] arr2 = {2, 4, 4, 5, 8, 4, 9, 10};
//        int target2 = 4;
//        System.out.println(linearSearchWithDuplicates(arr2, target2));
    }

    static int linearSearch(int[] arr, int target) {
        return helper(arr, target, 0);
    }

    static int helper(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (target == arr[index]) {
            return index;
        }
        return helper(arr, target, index + 1);
    }

    /* If the array contains duplicate elements, And we want
       to get the indices of all those elements. Then we can
       do so by creating a function as below.
     */
//    static ArrayList<Integer> linearSearchWithDuplicates(int[] arr, int target) {
//        return helperDuplicate(arr, target, 0);
//    }
//
//    static ArrayList<Integer> ans = new ArrayList<>();
//    static ArrayList helperDuplicate(int[] arr, int target, int index) {
//        if (index == arr.length) {
//            return ans;
//        }
//        if (target == arr[index]) {
//            ans.add(index);
//        }
//        return helperDuplicate(arr, target, index + 1);
//    }
}
