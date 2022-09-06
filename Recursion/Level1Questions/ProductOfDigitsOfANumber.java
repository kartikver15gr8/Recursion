package com.Recursion.Level1Questions;

public class ProductOfDigitsOfANumber {
    public static void main(String[] args) {
        System.out.println(productOfDigits(44459));
    }

    static int productOfDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * productOfDigits(n / 10);
    }
}
