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
        double x = (a + b + c)/2;
        double area = Math.sqrt(x * (x - a) * (x - b) * (x - c));
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + '\t' + "a = " + a + ", b = " + b + ", c = " + c + '\n' + "Shape area is: " + calcArea();
    }

    @Override
    public int compareTo(Object o) {
        Shape obj = (Shape)o;
        if (this.calcArea() < obj.calcArea()) {return -1;}
        if (this.calcArea() > obj.calcArea()) {return 1;}
        else return 0;
    }
}
