package com.brainacad.LABS_2_17_Mutlythreading.Task3_SubTask2_TestConcurrentCollection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Groovy on 09-Oct-15.
 */
public class MapReader implements Runnable {

    ConcurrentHashMap<String, String> map;

    public MapReader(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        mapReader(map);
    }

    public void mapReader(ConcurrentHashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            System.out.println(key + " " + entry.getValue());
        }
    }
}
