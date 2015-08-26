package com.brainacad.LABS_2_4;

/**
 * Created by User on 17.08.2015.
 */
public class PiValue {
    //? = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...

    public static double calPi(int n) {
        double piValueApprox = 4;
        double value = 3;

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                piValueApprox = piValueApprox + (4 / value);
                System.out.println(piValueApprox + (4 / value) + " plus");
            } else {
                piValueApprox = piValueApprox - (4 / value);
                System.out.println(piValueApprox - (4 / value) + " minus");
            }
            value=value+2;
            System.out.println(value + " pi is " + piValueApprox);
        }
        return piValueApprox;
    }
}