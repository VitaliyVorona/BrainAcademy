package com.brainacad.LABS_2_7;

import com.brainacad.LABS_2_7.labs_2_7_1.Device;
import com.brainacad.LABS_2_7.labs_2_7_1.EthernetAdapter;
import com.brainacad.LABS_2_7.labs_2_7_1.Monitor;

/**
 * Created by User on 26.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        Device mon = new Device("Apple", 23, "ABS2134e2");
        System.out.println(mon.toString());

        Device[] devices = new Device[2];
        devices[0] = new Monitor("Microsoft", 2399, "ASDF234", 1920, 1080, 234, "asdf");
        devices[1] = new EthernetAdapter("Apple", 2399, "1234@$ASDF234", 2321344, "a@!$sdf");

        for (Device i : devices) {
            System.out.println(i.toString());
        }
    }

}
