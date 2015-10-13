package com.brainacad.LABS_2_17_Multithreading;

/**
 * Created by vitaliy.vorona on 10/8/2015.
 */
public class TestThread extends Thread {

    int x = 10;

    @Override
    public void run() {

        while (x >= 0) {
            try {
                System.out.println(x);
                Thread.sleep(1000);
                if (x==1){Thread.currentThread().interrupt();}
            } catch (InterruptedException e) {
                System.out.println("BOOM!!!");
            }
            x--;
        }
    }
}
