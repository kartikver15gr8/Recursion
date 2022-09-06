package com.Recursion.Assignment;

public class PrintOneToNWithoutLoop {
    public static void main(String[] args) {
        int n = 20;
        oneToN(n);
        System.out.println("In reverse order!");
        oneToNInReverseOrder(n);
    }

    static void oneToN(int n) {
        if (n < 1) {
            return;
        }
        oneToN(n - 1);
        System.out.println(n);
    }

    static void oneToNInReverseOrder(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        oneToNInReverseOrder(n - 1);
    }
}
