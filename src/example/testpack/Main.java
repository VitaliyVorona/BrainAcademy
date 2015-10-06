package example.testpack;

import brainacad.crappack.*;
import example.applepack.Apple;

/**
 * Created by vitaliy.vorona on 10/6/2015.
 */
public class Main {
    public static void main(String[] args) {
        Crap crap = new Crap();
        crap.setWeight(20);
        System.out.println(crap.toString());

        Apple apple = new Apple();
        apple.setWeight(10);
        System.out.println(apple.toString());
    }
}
