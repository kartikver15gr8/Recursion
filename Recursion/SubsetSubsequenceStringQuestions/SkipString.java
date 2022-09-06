package com.Recursion.SubsetSubsequenceStringQuestions;

public class SkipString {
    public static void main(String[] args) {
        String str = "An apple a day keeps the doctor away!";
        String j = "ajflkappssdapplehk";
        System.out.println(skipString("anappleadaykeepsappsaway"));
    }

//    static String skipString(String str) {
//        if (str.isEmpty()) {
//            return "";
//        }
//        if (str.startsWith("apple")) {
//            return skipString(str.substring(5));
//        } else {
//            return str.charAt(0) + skipString(str.substring(1));
//        }
//    }

    // Skip "app" when it's not equals to "apple"
    static String skipString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipString(str.substring(3));
        } else {
            return str.charAt(0) + skipString(str.substring(1));
        }
    }


}
