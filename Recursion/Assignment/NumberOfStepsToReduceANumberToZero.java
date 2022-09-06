package com.Recursion.Assignment;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(1823));
    }

    /* The below is the way to solve it by making another
       static variable outside the function that will get updated
       inside the function and will get returned by the function as
       the base condition meets up!
     */

    static int steps = 0;
    static int numberOfSteps(int num) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            steps++;
            return numberOfSteps(num / 2);
        }
        steps++;
        return numberOfSteps(num - 1);
    }

    /* This method shown below can also be used to solve the problem.
       In this method we made a helper function that will take two arguments,
       first one is the number and the second argument will be the steps
       that initially are zero and will get updated inside the function and
       get returned by the function as the base condition meets up!
     */
//    static int numberOfSteps(int num) {
//        return helper(num, 0);
//    }
//
//    static int helper(int num, int steps) {
//        if (num == 0) {
//            return steps;
//        }
//        if (num % 2 == 0) {
//            return helper(num / 2, steps + 1);
//        }
//        return helper(num - 1, steps + 1);
//    }
}
