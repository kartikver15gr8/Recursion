package com.Recursion.SubsetSubsequenceStringQuestions;

public class SkipACharacter {
    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(skipACharacter(str));
        System.out.println(skipCharacter("Haakaad"));
        System.out.println();
//        skip("", "Akkadbakkad");
        System.out.println(skip("Abinator"));
    }

    static String skipACharacter(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

    static StringBuilder b = new StringBuilder();
    static int i = 0;
    static String skipCharacter(String str) {
        if (i == str.length()) {
            return b.toString();
        }
        if (str.charAt(i) != 'a') {
            b.append(str.charAt(i));
            i++;
            return skipCharacter(str);
        }
        i++;
        return skipCharacter(str);
    }


//    static void skip(String p, String up) {
//        if (up.isEmpty()) {
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        if (ch == 'a' || ch == 'A') {
//            skip(p, up.substring(1));
//        } else {
//            skip(p + ch, up.substring(1));
//        }
//    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a' || ch == 'A') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

}
