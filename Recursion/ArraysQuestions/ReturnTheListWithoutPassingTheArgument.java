package com.Recursion.ArraysQuestions;

import java.util.ArrayList;

public class ReturnTheListWithoutPassingTheArgument {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 4, 7, 0, 2};
        int target = 2;
        System.out.println(linearSearch(arr, target, 0));
    }

    static ArrayList<Integer> linearSearch(int[] arr, int target, int index) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (index == arr.length) {
            return ans;
        }
        if (target == arr[index]) {
            ans.add(index);
        }
        ArrayList<Integer> ansFromAllBelowCalls = linearSearch(arr, target, index + 1);
        ans.addAll(ansFromAllBelowCalls);
        return ans;
    }

}
