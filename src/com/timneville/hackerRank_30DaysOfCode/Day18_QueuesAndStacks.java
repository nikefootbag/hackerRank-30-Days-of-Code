package com.timneville.hackerRank_30DaysOfCode;

import java.io.*;
import java.util.*;
/**
 * Created by timneville on 5/7/17.
 */

public class Day18_QueuesAndStacks {
/** Solution */
    Stack<Character> stackData = new Stack<>();
    Queue<Character> queueData = new LinkedList<>();

    public void pushCharacter(char ch) {
        stackData.push(ch);
    }

    public void enqueueCharacter(char ch) {
        queueData.add(ch);
    }

    public char popCharacter() {
        return stackData.pop();
    }

    public char dequeueCharacter() {
        return queueData.remove();
    }
}
