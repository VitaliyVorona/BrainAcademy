package com.brainacad.LABS_2_7.labs_2_7_6;

/**
 * Created by Vitaliy.Vorona on 9/2/2015.
 */
public class Triangle extends Shape {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double area = (a + b + c)/2;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "a=" + a + ", b=" + b + ", c=" + c + '\n' + "Shape are is: " + calcArea();
    }
}
