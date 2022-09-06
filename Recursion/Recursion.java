package com.Recursion;

public class Recursion {
    public static void main(String[] args) {
        // When a function calls itself, that's known as 'Recursion'
        printName(1);
    }

    static void printName(int n) {
        if (n == 5) {
            System.out.println("Never Give Up!!!");
            return;
        }
        System.out.println("Never Give Up!!!");
        printName(n + 1);
    }
}
