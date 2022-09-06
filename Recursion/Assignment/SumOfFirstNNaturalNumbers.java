package com.Recursion.Assignment;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumOfFirstNNumbers(n));
    }

    static int sumOfFirstNNumbers(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumOfFirstNNumbers(n - 1);
    }
}
