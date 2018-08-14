package com.example.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanujain on 8/2/2018.
 */
public class matrixSpiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int start_w = 0 , start_h = 0 ;
        int width = matrix[0].length ;
        int height = matrix.length  ;
        int i,j;
        for( i = start_w; i < width; i++) {
            System.out.println("Value at " + start_w + "," + i + " = " + matrix[start_w][i]);
        }
        start_w++;
        for( j = start_w; j < height ; j++) {
            System.out.println("Value at " + start_w + "," + i + " = " + matrix[j][i-1]);

        }
        for (start_w = i-1; start_w >0 ; start_w--) {
            System.out.println("Value at " + j + "," + start_w + " = " + matrix[j-1][start_w]);
        }

            return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[][] matrix =  { {1, 2, 3},
                            {5, 6, 7},
                            {9, 10,11}
                        };
        matrixSpiral obj = new matrixSpiral();
        obj.spiralOrder(matrix);
    }
}
