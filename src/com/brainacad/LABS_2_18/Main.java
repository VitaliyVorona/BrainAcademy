package com.brainacad.LABS_2_18;

/**
 * Created by User on 05.10.2015.
 */
public class Main {
    public static void foo(Animal a) {
        System.out.println("Animal");
    }

    public static void foo(Dog d) {
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        foo(animal);

        byte b = 10;
        foo1(b, 5);
        foo1(1, 2, 3);
    }

    public static void foo1(int a, int b) {
        System.out.println("int a is " + a + " int b is " + b);
    }

    public static void foo1(int... i) {
        for (int j : i) {
            System.out.println("int is " + j);
        }
    }
}
