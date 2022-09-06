package com.Recursion.ArraysQuestions;

public class SortedArrays {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 5, 8, 9, 10};
        System.out.println(sortedArray(arr));
        int[] nums = {78, 68, 58, 48, 14, 12, 10, 9, 5, 2, 1, 0};
        System.out.println(sortedArray(nums));
    }

    static boolean sortedArray(int[] arr) {
        if (arr[0] > arr[arr.length - 1]) {
            return helperDes(arr, 0);
        } else {
            return helperAsc(arr, 0);
        }
    }

    /* The below function checks whether the array is sorted
       in descending order or not!
     */
    static boolean helperDes(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] >= arr[index + 1] && helperDes(arr, index + 1);
    }

    /* The below function checks whether the array is sorted
       in ascending order or not!
     */
    static boolean helperAsc(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] <= arr[index + 1] && helperAsc(arr, index + 1);
    }

    /* The above is an optimized way to solve with lesser lines
       of code, And the below is the function to check whether the
       array is sorted or not, but it has more lines of code.
     */

//    static boolean ans = false;

//    static boolean helperDes(int[] arr, int index) {
//        if (index == arr.length - 1) {
//            return true;
//        }
//        if (arr[index] >= arr[index + 1] && index <= arr.length - 1) {
////            ans = true;
//            return helperDes(arr, index + 1);
//        } else {
////            ans = false;
//            return false;
//        }
//    }

//    static boolean helperAsc(int[] arr, int index) {
//        if (index == arr.length - 1) {
//            return true;
//        }
//        if (arr[index] <= arr[index + 1] && index <= arr.length - 1) {
////            ans = true;
//            return helperAsc(arr, index + 1);
//        } else {
////            ans = false;
//            return false;
//        }
}
