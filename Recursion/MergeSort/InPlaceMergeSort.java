package com.Recursion.MergeSort;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {78, 5, 4, 14, 6};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end-start == 1) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] nums = new int[end-start];
        int i = start;
        int j = mid;
        int index = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                nums[index] = arr[i];
                i++;
            } else {
                nums[index] = arr[j];
                j++;
            }
            index++;
        }
        /*After the above loop there might be a possibility
          That out of both the arrays 'first' and 'second'
          some elements of anyone of the array are still not traversed
          for that we made the below condition, to copy the remaining elements.
         */

        while (i < mid) {
            nums[index] = arr[i];
            i++;
            index++;
        }
        while (j < end) {
            nums[index] = arr[j];
            j++;
            index++;
        }
        for (int k = 0; k < nums.length; k++) {
            arr[start + k] = nums[k];
        }
    }
}
