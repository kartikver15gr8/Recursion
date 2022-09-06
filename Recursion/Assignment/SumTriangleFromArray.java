package com.Recursion.Assignment;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumTriangleArray(arr);
    }

    static void sumTriangleArray(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int[] ans = new int[arr.length-1];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr[i] + arr[i + 1];
        }
        sumTriangleArray(ans);
        System.out.println(Arrays.toString(arr));
    }
}
