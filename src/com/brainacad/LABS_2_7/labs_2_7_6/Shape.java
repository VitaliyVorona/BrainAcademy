package com.brainacad.LABS_2_7.labs_2_7_6;

/**
 * Created by User on 31.08.2015.
 */
public class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcShape() {
        double area = 0;
        return area;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " , color is : "  + shapeColor;
    }
}

