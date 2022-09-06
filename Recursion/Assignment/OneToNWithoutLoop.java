package com.Recursion.Assignment;

public class OneToNWithoutLoop {
    public static void main(String[] args) {
        int n = 8;
        printOneToN(n, 0);
    }

    static void printOneToN(int n, int i) {
        if (i + 1 > n) {
            return;
        }
        System.out.print(i+" ");
        printOneToN(n, i + 1);
    }
}
