package com.Recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        System.out.println(factorialUsingRecursion(n));
    }

    static int factorialUsingRecursion(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }
}
