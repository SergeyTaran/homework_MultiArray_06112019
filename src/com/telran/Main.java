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
                for (int a = 99; a >= 90; a--) {
                    if (i == 0 && j == 0) {
                        result[i][j] = 99;
                    } else if (i == 0 && j > 0) {
                        result[i][j] = 99 - j;
                    } else if (i > 0 && j == 0) {
                        result[i][j] = 99 - (i * 10);
                    }else if(i>0 && j>0){
                        result[i][j]=99-j-(i*10);
                    }
                }
            }
        }
        return result;
    }
}