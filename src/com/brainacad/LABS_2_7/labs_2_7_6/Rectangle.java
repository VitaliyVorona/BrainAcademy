package com.brainacad.LABS_2_7.labs_2_7_6;

import com.sun.xml.internal.ws.message.saaj.SAAJHeader;

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
        return super.toString() + '\t' + "width = " + width + ", height = " + height +'\n' + "Shape area is: " + calcArea();
    }

    @Override
    public int compareTo(Object o) {
        Shape obj = (Shape)o;
        if (this.calcArea() < obj.calcArea()) {return -1;}
        if (this.calcArea() > obj.calcArea()) {return 1;}
        else return 0;
    }
}
