package com.Recursion.Level1Questions;

public class PalindromeOrNot {
    public static void main(String[] args) {
        System.out.println(isPalindrome(787));
    }

    static int revNumber(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
    static boolean isPalindrome(int n) {
        return n == revNumber(n);
    }
}
