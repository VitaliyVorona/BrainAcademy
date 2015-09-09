package com.brainacad.LABS_2_11.labs_2_11_3;

/**
 * Created by vitaliy.vorona on 9/9/2015.
 */
public class UniqueChars {

    public char[] uniqueChars(String s) {
        char[] nonUniqueChars = s.toCharArray();
        char[] uniqueChars = new char[s.length()];
        int j = 0;
        for (char i :  nonUniqueChars) {
            if (s.indexOf(String.valueOf(i)) == s.lastIndexOf(String.valueOf(i))){
                uniqueChars[j] = i;
                j++;
            }
        }
        return uniqueChars;
    }
}
