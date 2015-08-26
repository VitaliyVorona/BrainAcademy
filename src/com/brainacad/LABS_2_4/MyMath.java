package com.brainacad.LABS_2_4;

/**
 * Created by User on 17.08.2015.
 */
public class MyMath {

    static int findMin(int[] arrayInput) {
        int minValue = 0;
        for (int i = 0; i < arrayInput.length; i++){
            if (arrayInput[i] < minValue){
                minValue = arrayInput[i];
            }
        }
        return minValue;
    }

    static int findMax(int[] arrayInput) {
        int maxValue = 0;
        for (int i = 0; i < arrayInput.length; i++){
            if (arrayInput[i] > maxValue){
                maxValue = arrayInput[i];
            }
        }
        return maxValue;
    }
}
