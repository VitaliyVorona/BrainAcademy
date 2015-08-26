package com.brainacad.LABS_2_2.labs_2_2_1;

/**
 * Created by User on 12.08.2015.
 */
public class Matrix2D {


    int[][] newMatrix = new int[2][2];

    public int[][] add(int[][] matrix, int[][] matrix2) {
            int[][] sum = new int[matrix.length][matrix2.length];

            int rows = 2;
            int columns = 2 ;

            for (int i = 0; i < columns; i++) {
                for (int ii = 0; ii < rows; ii++){
                    sum[i][ii] = matrix[i][ii] + matrix2[i][ii];
                }
            }
            return sum;
        }
}
