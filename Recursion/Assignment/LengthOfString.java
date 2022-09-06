package com.Recursion.Assignment;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(lengthOfString(str));
    }

    static int lengthOfString(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return lengthOfString(str.substring(1)) + 1;
        }
    }
}
