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
        Shape circle = Shape.parseShape("Circle:BLACK:10");
        Shape triangle = Shape.parseShape("Triangle:GREEN:9,7,12");
        Shape rectangle = Shape.parseShape("Rectangle:RED:10,20");
        System.out.println(triangle.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        /*Rectangle rectangle = Rectangle.parseRectangle("Rectangle:RED:10,20");
        System.out.println(rectangle.toString());*/
    }

}
