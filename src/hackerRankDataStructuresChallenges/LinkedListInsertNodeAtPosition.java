package hackerRankDataStructuresChallenges;

/**
 * Created by timneville on 2/8/17.
 */
public class LinkedListInsertNodeAtPosition {
    class Node {
        int data;
        Node next;
    }

    Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        //create new node and initialize data.
        Node insertedNode = new Node();
        insertedNode.data = data;

        //check for null
        if (head == null) {
            return insertedNode;
        }
        //fast insert at position 0
        if (position == 0) {
            insertedNode.next = head;
            return insertedNode;
        }

        //traverse to position
        Node currentNode = head;
        for (int i = 1; i < position; i++) {
            currentNode = currentNode.next;
        }

        Node nextNode = currentNode.next;
        currentNode.next = insertedNode;
        insertedNode.next = nextNode;
        return head;
    }
}
