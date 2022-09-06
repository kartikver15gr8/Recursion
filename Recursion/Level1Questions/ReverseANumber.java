package com.Recursion.Level1Questions;

public class ReverseANumber {
    /* The below is method 1 to solve the problem by
     creating a variable sum outside the function*/
    static int sum = 0;
    static void reverseNumber(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNumber(n / 10);
    }

    /* Sometimes you might need some additional variables in
       the argument, in that case, make another function */
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

    /* Here we are calling all functions */
    public static void main(String[] args) {
        reverseNumber(4578);
        System.out.println(sum);
        System.out.println(revNumber(78457898));
    }

    // Solution without using Recursion
//    static int revNumber(int n) {
//        int ans = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            ans = ans * 10 + rem;
//            n /= 10;
//        }
//        return ans;
//    }
}
