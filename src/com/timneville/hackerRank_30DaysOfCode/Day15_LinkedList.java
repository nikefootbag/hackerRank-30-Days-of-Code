package com.timneville.hackerRank_30DaysOfCode;

import java.io.*;
import java.util.*;

/**
 * Created by timneville on 26/6/17.
 */
public class Day15_LinkedList {

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    /********CodeFrom*****************/
    class Solution {
        public  Node insert(Node head,int data) {
            //Complete this method
            Node newNode = new Node(data);

            if (head == null) {
                return newNode;
            }
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            return head;

        }
    /********CodeTo*****************/
        public void display(Node head) {
            Node start = head;
            while(start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        public void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            Node head = null;
            int N = sc.nextInt();

            while(N-- > 0) {
                int ele = sc.nextInt();
                head = insert(head,ele);
            }
            display(head);
            sc.close();
        }
    }
}

