package com.brainacad.LABS_2_3.labs_2_3_1;

/**
 * Created by User on 14.08.2015.
 */
public class MyWindow {

    boolean isOpen;
    public double width;
    public double height;
    public int numberOfGlass;
    public String color;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    private MyWindow(double width, double height) {
        this(width, height, 3, "RED", true);
//        this.height = height;
//        this.color = "RED";
//        this.isOpen = true;

    }

//    public MyWindow(){
//        this(12, 31);
//    }

    public MyWindow(){
        this(12, 21, 223, "FDS", true);
    }

    public void printField() {
        System.out.println("Width: " + width + "\theight " + height + "\tnumber of glass: " + numberOfGlass +
                "\tcolor " + color + "\tisOpen: "  + isOpen);
    }

}
