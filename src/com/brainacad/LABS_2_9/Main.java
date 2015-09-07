package com.brainacad.LABS_2_9;

/**
 * Created by User on 02.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        Integer x1 = 67;
        Integer x2 = new Integer(267);
        Integer x6 = new Integer("267");
        Integer x3 = Integer.valueOf(267);
        Integer x4 = Integer.parseInt("267");
        Integer x5 = Integer.valueOf("267");

        System.out.println(x1.equals(x1));
        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x3));
        System.out.println(x1.equals(x4));
        System.out.println(x1.equals(x5));
        System.out.println(x1.equals(x6));

        System.out.println(compute((byte) 12, -3));
        test("Rectangle:RED:10,20");

    }

    public static Long compute(Byte b, Integer i) {
        Long sum = Long.valueOf(b + i);
        return sum;
    }

    public static String test(String test) {
        String a = test.substring(0, test.indexOf(":"));
        if (a.equals("Rectangle")){
            System.out.println("Rectangle");
        }
        else System.out.println("Nothing matched");
            return "Rectangle";
        }
    }
