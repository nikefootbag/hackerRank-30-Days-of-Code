package hackerRankDataStructuresChallenges;

/**
 * Created by timneville on 2/8/17.
 */
public class LinkedListInsertNodeAtHead {
    class Node {
        int data;
        Node next;
    }

    Node Insert(Node head,int x) {
        Node insertedNode = new Node();
        insertedNode.data = x;

        if (head == null) {
            return insertedNode;
        }
        insertedNode.next = head;
        return insertedNode;
    }
}
