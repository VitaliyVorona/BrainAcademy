package com.brainacad.LABS_2_17_Mutlythreading.Task3_SubTask2_TestConcurrentCollection;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Groovy on 09-Oct-15.
 */
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap();

        MapReader reader = new MapReader(hashMap);
        hashMap.put("1", "A");
        hashMap.put("2", "B");
        hashMap.put("3", "C");

        Thread thread1 = new Thread(reader);
        Thread thread2 = new Thread(reader);
        Thread thread3 = new Thread(reader);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
