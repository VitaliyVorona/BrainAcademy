package com.brainacad.LABS_2_17_Multithreading;

/**
 * Created by vitaliy.vorona on 10/8/2015.
 */
public class MyRunnable implements Runnable {

    private int counter = 0;
    public int x = 0;

    public MyRunnable(int counter) {
        this.counter = counter;
    }

    public int currentX() {
        return x;
    }

    @Override
    public void run() {
        while (x < counter) {
            currentX();
            x++;
        }
    }
}
