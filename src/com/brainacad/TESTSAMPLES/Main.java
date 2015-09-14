package com.brainacad.TESTSAMPLES;

/**
 * Created by Groovy on 14-Sep-15.
 */
public class Main {

    public static void main(String[] args) {
        Sub s = new Sub();
        Base a = new Base();
        Base b = s;
        System.out.println(a.getName());
        System.out.println(s.getName() + " " + b.getName());
    }
}
