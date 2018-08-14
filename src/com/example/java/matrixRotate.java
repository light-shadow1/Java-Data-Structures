package com.example.java;

import java.util.List;

/**
 * Created by tanujain on 8/13/2018.
 * Lets Rotate an NxN matrix 90 degrees. High Space Complexity and you replicate the entire matrix in results and time complexity is O(n2)
 */
public class matrixRotate {

    public void rotate(int[][] matrix, int n) {
        int m = n - 1;
        int[][] result = new int[n][n];
        for (int i = 0; i < n && m >=0 ; i++ ) {
            for (int j = 0; j < n ; j++ ) {
                result[j][i] = matrix[m][j];

            }
            m--;
        }
        for (int i = 0; i < n  ; i++ ) {
            for (int j = 0; j < n ; j++ ) {
                System.out.println(" " + result[i][j]);

            }

        }

    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[][] matrix =
                { {1, 2, 3},
                {4, 5, 6},
                {7 , 8, 9}
        };
        matrixRotate obj = new matrixRotate();
        obj.rotate(matrix, matrix[0].length);
    }
}

