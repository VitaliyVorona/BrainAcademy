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

    public static Cirlce parseCircle(String param) throws NullPointerException{
        Cirlce rectObj = null;
        String rectangle = param.substring(0, param.indexOf(":"));
        if (rectangle.equals("Circle")) {
            String[] parameters = new String[2];
            parameters[0] = param.substring(param.indexOf(":") + 1, param.lastIndexOf(":"));
            parameters[1] = param.substring(param.lastIndexOf(":") + 1, param.length());
            rectObj = new Cirlce(parameters[0].toString(), Double.parseDouble(parameters[1].toString()));
        }
        return rectObj;
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
