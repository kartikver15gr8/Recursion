package com.Recursion.Level1Questions;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(120020,0));
    }

    /* The below method is to count zeroes in a number
       And in the below function/method, we've given count as
       an argument in the function itself. So that we will initialize
       it in the function call, and it will get updated in the recursive
       calls of the function and at last it will return the count
       as the program meets the base condition given in the function.
     */
    static int countZeroes(int n, int count) {
        if (n % 10 == n) {
            return count;
        }
        if (n % 10 == 0) {
            count++;
        }
        return countZeroes(n / 10, count);
    }

    /* The below function is to count zeroes in a number
       and in this method we've taken a variable count outside
       the function that will get updated inside the function
       and as the base condition meets it will return count.
     */
    static int count = 0;
    static int countZero(int n) {
        if (n % 10 == n) {
            return count;
        }
        if (n % 10 == 0) {
            count++;
        }
        return countZero(n / 10);
    }
}
