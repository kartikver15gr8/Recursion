package com.Recursion.Level1Questions;

public class SumFromOneToN {
    public static void main(String[] args) {
        System.out.println(sumOneToN(10));
    }

    static int sumOneToN(int n) {
        if (n == 1) {
            return n;
        }
        return n + sumOneToN(n-1);
    }
}
