package com.timneville;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by timneville on 26/6/17.
 */
public class Day16_ExceptionStringtoInteger {

    public class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();

            try {
                System.out.println(Integer.parseInt(S));
            } catch (NumberFormatException nfe) {
                System.out.println(("Bad String"));
            }
        }
    }
}
