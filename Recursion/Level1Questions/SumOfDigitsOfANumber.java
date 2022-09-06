package com.Recursion.Level1Questions;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(457889));
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return n;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
}
