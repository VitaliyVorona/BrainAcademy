package com.brainacad.LABS_2_17_Mutlythreading.Task3_Task1_TestDeadLock;

/**
 * Created by Groovy on 09-Oct-15.
 */
public class Main {
    public static void main(String[] args) {

        final MyObject object1 = new MyObject("1");
        final MyObject object2 = new MyObject("2");
        final MyObject object3 = new MyObject("3");


        Thread thread1 = new MyThread(1, object1, object2, object3);
        Thread thread2 = new MyThread(2, object2, object3, object1);
        Thread thread3 = new MyThread(3, object3, object1, object2);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
