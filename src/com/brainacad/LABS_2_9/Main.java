package com.brainacad.LABS_2_9;

/**
 * Created by Groovy on 04-Sep-15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(compute((byte)11112, 11112));
    }

    static Long compute(Byte b, Integer i) {
        Long sum = b.longValue() + i;
        return sum;
    }
}
