package com.brainacad.LABS_2_10.labs_2_10_2;

/**
 * Created by User on 11.09.2015.
 */
public class MyException extends Exception {
    String test;

    public MyException(String test) {
        this.test = test;
    }

    public void printOut() {
        System.out.println(test);
    }
}
