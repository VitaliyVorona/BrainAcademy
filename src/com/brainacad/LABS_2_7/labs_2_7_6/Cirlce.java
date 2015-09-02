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
    public double calcArea() {
        double area = PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() +  '\n' + "Shape area is = " + calcArea();
    }

    @Override
    public int compareTo(Object o) {
        Shape obj = (Shape)o;
        if (this.calcArea() < obj.calcArea()) {return -1;}
        if (this.calcArea() > obj.calcArea()) {return 1;}
        else return 0;
    }
}
