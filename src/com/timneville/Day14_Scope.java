package com.timneville;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by timneville on 25/6/17.
 */
public class Day14_Scope {

    class Difference {
        private int[] elements;
        public int maximumDifference;
        // Add your code here

        public Difference(int[] elements) {
            this.elements = elements;
        }

        public void computeDifference() {
            int lowest = 101;
            int highest = 0;
            for (int each : elements) {
                lowest = Math.min(lowest, each);
                highest = Math.max(highest, each);
            }
            maximumDifference = Math.abs(highest) - Math.abs(lowest);
        }
    } // End of Difference class

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        sc.close();
//
//        Difference difference = new Difference(a);
//
//        difference.computeDifference();
//
//        System.out.print(difference.maximumDifference);
//    }
}
