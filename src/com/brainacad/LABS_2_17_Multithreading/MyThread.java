package com.brainacad.LABS_2_17_Multithreading;

/**
 * Created by vitaliy.vorona on 10/8/2015.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (!isInterrupted()) {
            if (getName().equals("TestYield")) {
                Thread.yield();
            }
            System.out.println("Thread: " + getName() + ": i = " + i++);
        }
    }
}
