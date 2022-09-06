package com.Recursion.Assignment;

public class RemoveAllConsecutiveElementsFromString {
    public static void main(String[] args) {
        String s = "Kaartiikeyy";
        System.out.println(removeConsecutiveElements(s, 1, 0));
    }

    //    static String removeConsecutiveElements(String s) {
//        if (s.length() == 0 || s.length() == 1) {
//            return s;
//        } else {
//            StringBuilder ans = new StringBuilder();
//            ans.append(s.charAt(0));
//            int j = 0;
//            for (int i = 1; i < s.length(); i++) {
//                if (ans.charAt(j) != s.charAt(i)) {
//                    ans.append(s.charAt(i));
//                    j++;
//                }
//            }
//            return ans.toString();
//        }
//    }

    // Below is the solution using recursion
    static StringBuilder ans = new StringBuilder();

    static String removeConsecutiveElements(String s, int i, int j) {
        if (ans.length() == 0) {
            ans.append(s.charAt(0));
        }
        if (i == s.length()) {
            return ans.toString();
        }
        if (ans.charAt(j) != s.charAt(i)) {
            ans.append(s.charAt(i));
            return removeConsecutiveElements(s, i + 1, j + 1);
        }
        return removeConsecutiveElements(s, i + 1, j);
    }
}
