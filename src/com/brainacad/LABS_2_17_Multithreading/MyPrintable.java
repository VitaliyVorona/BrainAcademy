package com.brainacad.LABS_2_17_Multithreading;

/**
 * Created by vitaliy.vorona on 10/8/2015.
 */
public class MyPrintable implements Runnable {

    private int x;

    public void printStuff(int inValue) {
        System.out.println(inValue);
    }


    @Override
    public void run() {
        printStuff(x);
    }
}
