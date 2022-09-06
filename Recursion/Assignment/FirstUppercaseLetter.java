package com.Recursion.Assignment;

public class FirstUppercaseLetter {
    public static void main(String[] args) {
        String str = "geeksfOrgeeks";
        System.out.println(firstUppercase(str, 0));
    }
    static char firstUppercase(String str, int i) {
        if (str.charAt(i) >= 60 && str.charAt(i) <= 90) {
            return str.charAt(i);
        }
        return firstUppercase(str, i + 1);
    }

}
