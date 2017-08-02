package hackerRankDataStructuresChallenges;

/**
 * Created by timneville on 2/8/17.
 */
public class LinkedListInsertNodeAtTail {
    class Node {
        int data;
        Node next;
    }

    Node Insert(Node head,int data) {
// This is a "method-only" submission.
// You only need to complete this method.
        Node insertedNode = new Node();
        insertedNode.data = data;

        if (head == null) {
            return insertedNode;
        }

        Node originalHead = head;

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = insertedNode;


        return originalHead;
    }

}
