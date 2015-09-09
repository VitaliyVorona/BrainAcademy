package com.brainacad.LABS_2_11;

import com.brainacad.LABS_2_11.labs_2_11_3.UniqueChars;

/**
 * Created by User on 07.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        String test = "asdfasdfasdffeeebfhfhgfh";
        char[] ch = uniqueChars("asdfasdfasdffeeebfhfhgfh");
        for (char i : ch) {
            System.out.println(i);
        }
        printAbsentLetters(myStr1, myStr2);
        UniqueChars chars = new UniqueChars();
        char[] testCh = chars.uniqueChars(test);
        for (char i : testCh) {
            System.out.println( " sec = " + i);
        }
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
