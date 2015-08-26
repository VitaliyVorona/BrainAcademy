package com.brainacad.LABS_2_5.labs_225_1;

/**
 * Created by User on 26.08.2015.
 */
public class MyInitTest {
    static {
        System.out.println("static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    {
        System.out.println("non-static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    public MyInitTest() {
        this(2);
        System.out.println("constructor 1");
    }
    public MyInitTest(int i) {
        System.out.println("constructor 2");
    }

}
