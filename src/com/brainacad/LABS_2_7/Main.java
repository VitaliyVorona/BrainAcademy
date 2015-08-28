package com.brainacad.LABS_2_7;

import com.brainacad.LABS_2_7.labs_2_7_1.Device;
import com.brainacad.LABS_2_7.labs_2_7_1.Monitor;

/**
 * Created by User on 26.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        Device mon = new Device();
        mon.setManufacturer("Apple");

        Device de = new Device();
        System.out.println(de.toString());
        System.out.println(de.equals(mon));

    }

}
