package com.brainacad.LABS_2_7.labs_2_7_6;

import com.brainacad.LABS_2_8.labs_2_8_1.Drawable;

/**
 * Created by User on 31.08.2015.
 */
public abstract class Shape implements Drawable, Comparable {
    private String shapeColor;

    public void draw() {
        System.out.println(this.toString());
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();


    public static Shape parseShape(String obj) throws NullPointerException {
        String shape = obj.substring(0, obj.indexOf(":"));
        Shape shapeObj = null;

        switch (shape) {
            case "Circle":
                shapeObj = Cirlce.parseCircle(obj);
                break;
            case "Triangle":
                shapeObj = Triangle.parseTriangle(obj);
                break;
            case "Rectangle":
                shapeObj = Rectangle.parseRectangle(obj);
        }

        return shapeObj;
    }

    public static String[] paramsRectangle(String params) {
        String[] paramsList = new String[3];
        paramsList[0] = params.substring(params.indexOf(":") + 1, params.lastIndexOf(":"));
        paramsList[1] = params.substring(params.lastIndexOf(":") + 1, params.indexOf(","));
        paramsList[2] = params.substring(params.indexOf(",") + 1, params.length());
        return paramsList;
    }

    public static String[] paramsTriangle(String params) {
        String[] paramsList = new String[4];
        paramsList[0] = params.substring(params.indexOf(":") + 1, params.lastIndexOf(":"));
        paramsList[1] = params.substring(params.lastIndexOf(":") + 1, params.indexOf(","));
        paramsList[2] = params.substring(params.indexOf(",") + 1, params.lastIndexOf(","));
        paramsList[3] = params.substring(params.lastIndexOf(",") + 1, params.length());
        return paramsList;
    }

    public static String[] paramsCircle(String params) {
        String[] paramsList = new String[2];
        paramsList[0] = params.substring(params.indexOf(":") + 1, params.lastIndexOf(":"));
        paramsList[1] = params.substring(params.lastIndexOf(":") + 1, params.length());
        return paramsList;
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color : " + shapeColor + ",";
    }
}

