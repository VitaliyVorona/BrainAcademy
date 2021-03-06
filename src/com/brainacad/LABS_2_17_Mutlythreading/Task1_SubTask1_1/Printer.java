package com.brainacad.LABS_2_17_Mutlythreading.Task1_SubTask1_1;

/**
 * Created by Groovy on 09-Oct-15.
 */
public class Printer implements Runnable {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread threadPrinter = new Thread(printer);
        threadPrinter.start();
    }

    Counter counter = new Counter();
    Thread threadCounter = new Thread(counter);

    @Override
    public void run() {
        threadCounter.start();
        synchronized (threadCounter){

            Storage storage = counter.count();
            for (int i : storage.value) {
                System.out.println(i);
            }
        }
    }
}
