package com.brainacad.LABS_2_11;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 07.09.2015.
 */
public class Main {
    public static void main(String[] args) {

//        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";
//        StringTokenizer tokenizer = new StringTokenizer(myStr);
//
//        String delims = ", .";
//        StringTokenizer tokens = new StringTokenizer(myStr, delims);
//        while (tokens.hasMoreElements()) {
//            System.out.println(tokens.nextElement());
//        }
        System.out.println(checkPersonWithRegExp("Vova"));
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
