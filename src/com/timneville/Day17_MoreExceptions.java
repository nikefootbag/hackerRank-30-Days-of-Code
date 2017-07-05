package com.timneville;

import java.util.*;
import java.io.*;
/**
 * Created by timneville on 26/6/17.
 */
public class Day17_MoreExceptions {

//Write your code here
    class Calculator {
        public int power(int n, int p) {
            if (n < 0 || p < 0) {
                throw new IllegalArgumentException("n and p should be non-negative");
            }
            return (int) Math.pow(n,p);
        }
}

    class Solution{

        public /*Static*/ void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while (t-- > 0) {

                int n = in.nextInt();
                int p = in.nextInt();
                Calculator myCalculator = new Calculator();
                try {
                    int ans = myCalculator.power(n, p);
                    System.out.println(ans);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            in.close();
        }
    }
}
