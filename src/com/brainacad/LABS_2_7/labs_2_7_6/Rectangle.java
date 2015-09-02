package com.brainacad.LABS_2_7.labs_2_7_6;

/**
 * Created by Vitaliy.Vorona on 9/2/2015.
 */
public class Rectangle extends Shape {
    private String color;
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;

    }

    @Override
    public double calcArea() {
        double area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "width = " + width + "height = " + height +'\n' + "Shape are is: " + calcArea();
    }
}
