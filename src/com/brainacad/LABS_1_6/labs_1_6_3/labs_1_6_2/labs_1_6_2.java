package com.brainacad.LABS_1_6.labs_1_6_3.labs_1_6_2;

/**
 * Created by User on 14.08.2015.
 */
public class labs_1_6_2 {

   public static int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 64 };

    public static void main(String[] args) {
        int max = 0;
        for(int i = 0; i < m.length; i++){
            if (max < m[i]){
                max = m[i];
            }
        }
        System.out.print(max);
    }
}
