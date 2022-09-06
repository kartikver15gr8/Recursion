package com.Recursion.Assignment;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPowerOfThree(n));
    }

    static boolean isPowerOfThree(int n) {
        if (n == 3 || n == 1) {
            return true;
        }
        if (n % 3 != 0 || n == 0) {
            return false;
        }
        if (n % 3 == 0) {
            n /= 3;
        }
        return isPowerOfThree(n);
    }
}
