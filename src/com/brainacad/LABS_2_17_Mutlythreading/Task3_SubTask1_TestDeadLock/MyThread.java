package com.brainacad.LABS_2_17_Mutlythreading.Task3_SubTask1_TestDeadLock;

/**
 * Created by Groovy on 09-Oct-15.
 */
public class MyThread extends Thread {

    int threadNumA;
    MyObject obj1 ;
    MyObject obj2 ;
    MyObject obj3 ;

    public MyThread(int a, MyObject obj1, MyObject obj2, MyObject obj3) {
        threadNumA = a;
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void run() {
        synchronized (obj1) {
            obj1.order(obj3, obj2);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        synchronized (obj2) {
            obj2.order(obj1, obj3);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        synchronized (obj3) {
            obj3.order(obj2, obj1);
        }
    }
}
