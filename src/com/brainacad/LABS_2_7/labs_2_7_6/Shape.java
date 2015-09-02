package com.brainacad.LABS_2_7.labs_2_7_6;

import com.brainacad.LABS_2_8.labs_2_8_1.Drawable;

/**
 * Created by User on 31.08.2015.
 */
public abstract class Shape implements Drawable, Comparable{
    private String shapeColor;

    public void draw(){
        System.out.println(this.toString());
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color : " + shapeColor + ",";
    }
}

