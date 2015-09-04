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
        Integer a = new Integer(2);

        double area = 0;

        int z = a.MAX_VALUE;
        Cirlce cirlce1 = new Cirlce("RANGE", 5);
        Cirlce cirlce2 = new Cirlce("ORANGE", 10);
        Rectangle rectangle1 = new Rectangle("BLUE", 4, 5);
        Rectangle rectangle2 = new Rectangle("YELLOW", 4, 5);

        Triangle triangle1 = new Triangle("RED", 25, 5, 5);

        Shape[] shapes = new Shape[]{triangle1, cirlce1, cirlce2, rectangle1, rectangle2};
        System.out.println(rectangle1.compareTo(cirlce1));
        for (Shape i : shapes) {
            i.draw();
        }
    }
}
