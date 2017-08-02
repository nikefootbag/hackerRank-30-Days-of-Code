package hackerRankDataStructuresChallenges;
import java.io.*;
import java.util.*;
/**
 * Created by timneville on 2/8/17.
 */
public class ArrayLeftRotation {


    //public class Solution {

        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int rotation = scanner.nextInt();
            int[] shiftedArray = new int[size];

            //left rotation being index less rotation % size of array
            for (int i = 0; i < size; i++) {
                shiftedArray[(i - rotation + size) % size] = scanner.nextInt();
            }
            for (int each : shiftedArray) {
                System.out.print(each+" ");
            }
        }
    //}
}
