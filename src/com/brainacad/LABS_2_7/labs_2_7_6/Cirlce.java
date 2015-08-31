package com.brainacad.LABS_2_7.labs_2_7_6;

import static java.lang.Math.*;


/**
 * Created by User on 31.08.2015.
 */
public class Cirlce extends Shape {
    private String color;
    private double radius;

    public Cirlce(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcShape() {
        double area = PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() +  " shape area is = " + calcShape();
    }
}
