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
//        Shape shape = new Shape("GREEN");
        Cirlce cirlce1 = new Cirlce("RANGE", 5);
        Cirlce cirlce2 = new Cirlce("ORANGE", 10);
        Rectangle rectangle1 = new Rectangle("BLUE", 4, 5);
        Rectangle rectangle2 = new Rectangle("YELLOW", 4, 5);
//        Triangle triangle2 = new Triangle("BRED", 5, 5, 5);
        Triangle triangle1 = new Triangle("RED", 25, 5, 5);
//        Triangle triangle3 = new Triangle("FRED", 25, 5, 5);
//        Triangle triangle4 = new Triangle("DRED", 5, 5, 35);
//        Triangle triangle5 = new Triangle("SRED", 54, 35, 25);
//        triangle2, triangle3, triangle4, triangle5,
        Shape[] shapes = new Shape[]{triangle1, cirlce1, cirlce2, rectangle1, rectangle2};
        System.out.println(rectangle1.compareTo(cirlce1));
        for (Shape i : shapes) {
//            System.out.println(i.);
//            area = area + i.calcArea();
            i.draw();
        }
        }

    }
