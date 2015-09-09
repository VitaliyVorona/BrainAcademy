package com.brainacad.LABS_2_11.labs_2_11_3;

/**
 * Created by vitaliy.vorona on 9/9/2015.
 */
public class UniqueChars {

    public char[] uniqueChars(String s) {
        char[] nonUniqueChars = s.toCharArray();
        char[] uniqueChars = new char[s.length()];
        for (char i :  nonUniqueChars) {
            if (s.startsWith(String.valueOf(i)) == s.endsWith(String.valueOf(i))){
                uniqueChars[i] = i;
            }
        }
        return uniqueChars;
    }
}
