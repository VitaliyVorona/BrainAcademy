package com.brainacad.LABS_2_9;

import com.brainacad.LABS_2_7.labs_2_7_6.Shape;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by User on 02.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader((System.in)));
        String line = scanner.nextLine();
        int numOfShapes = Integer.parseInt(line);
        System.out.println(line);

        Shape[] shapes = new Shape[numOfShapes];
        for (int i = 0; i < numOfShapes; i++) {
            line = scanner.nextLine();
            shapes[i] = Shape.parseShape(line);
        }
        for (Shape i : shapes){
            i.draw();
        }
        scanner.close();
    }

    public static Long compute(Byte b, Integer i) {
        Long sum = Long.valueOf(b + i);
        return sum;
    }

    public static String test(String test) {
        String a = test.substring(0, test.indexOf(":"));
        if (a.equals("Rectangle")) {
            System.out.println("Rectangle");
        } else System.out.println("Nothing matched");
        return "Rectangle";
    }
}
