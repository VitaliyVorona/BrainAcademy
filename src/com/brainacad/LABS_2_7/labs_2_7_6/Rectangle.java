package com.brainacad.LABS_2_7.labs_2_7_6;

import com.sun.xml.internal.ws.message.saaj.SAAJHeader;

import java.util.IllegalFormatException;

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

    public static Rectangle parseRectangle(String param) throws NullPointerException{
        Rectangle rectObj = null;
        String rectangle = param.substring(0, param.indexOf(":"));
        if (rectangle.equals("Rectangle")) {
            String[] parameters = new String[3];
            parameters[0] = param.substring(param.indexOf(":") + 1, param.lastIndexOf(":"));
            parameters[1] = param.substring(param.lastIndexOf(":") + 1, param.indexOf(","));
            parameters[2] = param.substring(param.lastIndexOf(",") + 1, param.length());
            rectObj = new Rectangle(parameters[0].toString(), Double.parseDouble(parameters[1].toString()), Double.parseDouble(parameters[2].toString()));
        }
        return rectObj;
    }

    @Override
    public double calcArea() {
        double area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + '\t' + "width = " + width + ", height = " + height + '\n' + "Shape area is: " + calcArea();
    }

    @Override
    public int compareTo(Object o) {
        Shape obj = (Shape) o;
//        if (obj == null || !(obj instanceof Shape)){throw IllegalArgumentException;}
        if (this.calcArea() < obj.calcArea()) {
            return -1;
        }
        if (this.calcArea() > obj.calcArea()) {
            return 1;
        } else return 0;
    }
}
