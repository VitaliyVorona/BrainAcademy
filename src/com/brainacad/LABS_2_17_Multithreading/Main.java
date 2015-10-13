package com.brainacad.LABS_2_17_Multithreading;

/**
 * Created by vitaliy.vorona on 10/8/2015.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        TestThread thread = new TestThread();
        thread.start();
    }
}
