package com.brainacad.LABS_2_17_Mutlythreading.Task3_Task1_TestDeadLock;

/**
 * Created by Groovy on 09-Oct-15.
 */
public class MyThread extends Thread {

    int threadNumA;
    MyObject obj1 = new MyObject("Thread1");
    MyObject obj2 = new MyObject("Thread2");
    MyObject obj3 = new MyObject("Thread3");

    public MyThread(int a, int b, MyObject obj1, MyObject obj2, MyObject obj3) {
        threadNumA = a;
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void run() {
        synchronized (obj3) {
            obj1.order(obj3, obj2);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        synchronized (obj1) {
            obj2.order(obj1, obj3);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        synchronized (obj2) {
            obj3.order(obj2, obj1);
        }
    }
}
