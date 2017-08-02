package com.timneville.hackerRank_30DaysOfCode;

import java.util.Scanner;

/**
 * Created by timneville on 24/6/17.
 */
public class Day11_2D_Arrays {
    public static int arr[][];

    public static int hourGlass(int row, int column) {

        int currentHourGlassSum = 0;

        for (int j = 0; j < 3; j++) {
            currentHourGlassSum += arr[row][column + j];
        }

        currentHourGlassSum += arr[row + 1][column + 1];

        for (int j = 0; j < 3; j++) {
            currentHourGlassSum += arr[row + 2][column + j];
        }

        return currentHourGlassSum;
    }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            arr = new int[][]
            {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0},
                {0,0,1,2,4,0},
                {0,0,1,2,4,0}
            };

            //in case of negative edge cases
            int largestHourGlassSum = -1000;

            for (int row = 0; row < arr[0].length-2; row++) {
                for (int column = 0; column < arr[1].length-2; column++) {

                    largestHourGlassSum = Math.max(largestHourGlassSum, hourGlass(row, column));
                }
            }
            System.out.println(largestHourGlassSum);
        }
}
