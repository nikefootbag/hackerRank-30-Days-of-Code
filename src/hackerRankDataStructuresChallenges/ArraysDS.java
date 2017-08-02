package hackerRankDataStructuresChallenges;

import java.io.*;
import java.util.*;
/**
 * Created by timneville on 2/8/17.
 */
public class ArraysDS {

    //public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);
            int length = scan.nextInt();
            int[] intArray = new int[length];
            //for the length of the array, scan for each int
            for (int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            scan.close();
            for (int i = length - 1; i >= 0; i--) {
                System.out.print(intArray[i] + " ");
            }

        }
    //}
}
