package hackerRankDataStructuresChallenges;
import java.io.*;
import java.util.*;
/**
 * Created by timneville on 2/8/17.
 */
public class Arrays2D {

    //public class Solution {

        public static int sumHourGlass(int indexX, int indexY, int[][] hourGlassArray) {
            int[][] hourglassArray = hourGlassArray;
            return hourglassArray[indexX][indexY] +
                    hourglassArray[indexX+1][indexY] +
                    hourglassArray[indexX+2][indexY] +
                    hourglassArray[indexX+1][indexY+1] +
                    hourglassArray[indexX][indexY+2] +
                    hourglassArray[indexX+1][indexY+2] +
                    hourglassArray[indexX+2][indexY+2];
        }

        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            int[][] hourglassArray = new int[6][6];
            int largestHourGlass = Integer.MIN_VALUE;

            //read input and create 2d array
            for (int y = 0; y < 6; y++) {
                for (int x = 0; x < 6; x++) {
                    int num = scanner.nextInt();
                    hourglassArray[x][y] = num;

                    //System.out.print(num);
                    //System.out.print(" ");
                }
                //System.out.println();
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int sum = sumHourGlass(j, i, hourglassArray);
                    if (largestHourGlass < sum) {
                        largestHourGlass = sum;
                    }
                }
            }
            System.out.print(largestHourGlass);

        }
    //}
}
