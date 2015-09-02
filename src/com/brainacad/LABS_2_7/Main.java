package com.brainacad.LABS_2_7;

import com.brainacad.LABS_2_7.labs_2_7_6.Cirlce;
import com.brainacad.LABS_2_7.labs_2_7_6.Rectangle;
import com.brainacad.LABS_2_7.labs_2_7_6.Shape;
import com.brainacad.LABS_2_7.labs_2_7_6.Triangle;

/**
 * Created by User on 26.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        /*Device mon = new Device("Apple", 23, "ABS2134e2");
        System.out.println(mon.toString());

        Device[] devices = new Device[2];
        devices[0] = new Monitor("Microsoft", 2399, "ASDF234", 1920, 1080, 234, "asdf");
        devices[1] = new EthernetAdapter("Apple", 2399, "1234@$ASDF234", 2321344, "a@!$sdf");

        for (Device i : devices) {
            System.out.println(i.toString());
        }*/
        Shape shape = new Shape("GREEN");
        Cirlce cirlce = new Cirlce("ORANGE", 10);
        Rectangle rectangle = new Rectangle("RED", 11, 22);
        Triangle triangle = new Triangle("RED", 5, 5, 5);

        System.out.println(shape.toString());
        System.out.println(cirlce.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());
    }

}
