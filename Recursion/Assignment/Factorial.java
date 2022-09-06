package com.Recursion.Assignment;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialUsingRecursion(5));
    }

    static int factorialUsingRecursion(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }
}
