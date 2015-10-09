package com.brainacad.LABS_2_17_Mutlythreading.Task1_Task1_2_Notify;

/**
 * Created by Groovy on 09-Oct-15.
 */
public class Counter implements Runnable {

    int x = 0;

    @Override
    public void run() {
        count();
    }

    public Storage count() {
        Storage storage = new Storage();
        while (x < 10) {
            storage.value.add(x);
            x++;
        }
        return storage;
    }
}
