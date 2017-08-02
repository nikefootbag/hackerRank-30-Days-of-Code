package hackerRankDataStructuresChallenges;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by timneville on 2/8/17.
 */
public class LinkedListPrintElementsInReverse {
    class Node {
        int data;
        Node next;
    }

    void ReversePrint(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        if (head == null) {
        } else {
            Node currentNode = head;
            Deque<Integer> reverseListStack = new ArrayDeque<Integer>();
            reverseListStack.push(currentNode.data);

            while (currentNode.next != null) {
                currentNode = currentNode.next;
                reverseListStack.push(currentNode.data);
            }
            while (!reverseListStack.isEmpty()) {
                System.out.println(reverseListStack.pop());
            }
        }
    }
}
