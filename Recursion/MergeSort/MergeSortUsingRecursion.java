package com.Recursion.MergeSort;

import java.util.Arrays;

public class MergeSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {78, 98, 5, 1, -4, -45, 8};
//        int[] a = {3, 4, 8};
//        int[] b = {5, 6, 12};
//        int[] ans = merge(a, b);
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] nums = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                nums[index] = first[i];
                i++;
            } else {
                nums[index] = second[j];
                j++;
            }
            index++;
        }
        /*After the above loop there might be a possibility
          That out of both the arrays 'first' and 'second'
          some elements of anyone of the array are still not traversed
          for that we made the below condition, to copy the remaining elements.
         */

        while (i < first.length) {
            nums[index] = first[i];
            i++;
            index++;
        }
        while (j < second.length) {
            nums[index] = second[j];
            j++;
            index++;
        }
        return nums;
    }
}
