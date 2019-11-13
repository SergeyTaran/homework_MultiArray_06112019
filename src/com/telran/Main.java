package com.telran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int m = 10;
        int n = 10;

        int[][] array = makeNewArray(10, 10);
        for (int i = 0; i < array.length; i++)
            System.out.println(Arrays.toString(array[i]));
    }

    static int[][] makeNewArray(int m, int n) {
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                result[i][j] = 99 - j - (i * 10);
            }
        }
        return result;
    }
}


//test for git 2nd commit
//test for git 3d commit