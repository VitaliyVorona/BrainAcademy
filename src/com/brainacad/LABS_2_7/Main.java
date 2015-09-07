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
        Shape cirlce = Shape.parseShape("Circle:BLACK:10");
        Shape triangle = Shape.parseShape("Triangle:GREEN:9,7,12");
        System.out.println(triangle.toString());
        System.out.println(cirlce.toString());
    }

}
