package com.brainacad.LABS_2_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 07.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        String day = "SunDay";
        day = day.replace('D', 'Z').substring(3);
        System.out.println(day);
    }

    public static void uniqueChars(String a, String b) {
        char[] charsA = a.toLowerCase().toCharArray();
        for (char c : charsA) {
                if (!b.toLowerCase().contains(String.valueOf(c))){
                    System.out.println(c);
                }
            }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {
//        boolean check;

        Pattern pattern = Pattern.compile("[A-Z][a-z]*");
        Matcher matcher = pattern.matcher(userNameString);
        return matcher.matches();
    }

    public static String reverseString(String arg) {
        StringBuilder builder = new StringBuilder(arg);
        builder.reverse();
        return builder.toString();
    }

    public static void printAbsentLetters(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (b.indexOf(ch) == -1) {
                System.out.println(ch);
            }
        }
    }

    public static char[] uniqueChars(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.lastIndexOf(ch) == s.indexOf(ch)) {
                builder.append(ch);
            }
        }
        return builder.toString().toCharArray();
    }
}
