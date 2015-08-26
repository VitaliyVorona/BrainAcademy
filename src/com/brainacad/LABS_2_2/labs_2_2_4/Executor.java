package com.brainacad.LABS_2_2.labs_2_2_4;

/**
 * Created by User on 12.08.2015.
 */
public class Executor {
    public static void main(String[] args) {
        Person person = new Person();
        person.set("Adams");
        person.set("John", "Mironov");

        person.printAll();
    }
}
