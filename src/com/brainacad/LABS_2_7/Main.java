package com.brainacad.LABS_2_7;

import com.brainacad.LABS_2_7.labs_2_7_1.Monitor;

/**
 * Created by User on 26.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        Monitor mon = new Monitor();
        mon.setResolutionX(1920);
        mon.setResolutionY(1080);

        System.out.println(mon.getResolutionX());
        System.out.println(mon.getResolutionY());
    }
}
