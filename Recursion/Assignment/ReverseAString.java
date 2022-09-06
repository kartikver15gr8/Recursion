package com.Recursion.Assignment;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars, 0, chars.length - 1);
        System.out.println(chars);
        reverseString(chars);
        System.out.println(chars);
    }

    static void reverseString(char[] s, int i, int j) {
        if (i > j) {
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        reverseString(s, i + 1, j - 1);
    }
    static void reverseString(char[] s){
        reverseString(s, 0, s.length - 1);
    }
}
