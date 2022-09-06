package com.Recursion.IntroductionToRecursion;

public class NumberExampleForRecursion {
    public static void main(String[] args) {
        print(1);
        /* We use 'Recursion' because it helps us in solving
           bigger and complex problems in an easy way */

        /* We can convert 'Recursion' solution into 'Iteration'
           and vise-versa */
    }

    static void print(int n) {
        // Base Condition
        /* If there is no base condition, then function call will keep happening
            and take separate memory in the stack again and again, And at some point
            the stack will get full(i.e, memory of computer will exceed the limit) and will show 'Stack overflow' error.
         */

        if (n == 5) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        // Recursive call
        // If you are calling a function again and again, you can treat it as a separate call in the stack
        // This is called "Tail Recursion"
        // This is the last function call.
        print(n + 1);
    }
}
