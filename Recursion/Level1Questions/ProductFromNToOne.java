package com.Recursion.Level1Questions;

public class ProductFromNToOne {
    public static void main(String[] args) {
        System.out.println(productFromNToOne(5));
    }


    // The below program can also be used to find factorial of a number
    static int productFromNToOne(int n) {
        if (n == 1) {
            return n;
        }
        return n * productFromNToOne(n - 1);
    }
}
