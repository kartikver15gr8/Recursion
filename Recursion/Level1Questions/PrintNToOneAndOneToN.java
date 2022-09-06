package com.Recursion.Level1Questions;

public class PrintNToOneAndOneToN {
    public static void main(String[] args) {
        printNToOne(5);
        System.out.println();
        printOneToN(5);

    }

    static void printNToOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        printNToOne(n - 1);
    }

    static void printOneToN(int n) {
        if (n == 0) {
            return;
        }
        printOneToN(n - 1);
        System.out.print(n + " ");
    }
}
