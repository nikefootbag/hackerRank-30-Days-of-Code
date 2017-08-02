package hackerRankDataStructuresChallenges;

/**
 * Created by timneville on 2/8/17.
 */
public class LinkedListDeleteANodeAtPosition {
    class Node {
        int data;
        Node next;
    }

    Node Delete(Node head, int position) {
        // Complete this method
        if (head == null) {
            return head;
        }
        if (position == 0) {
            if (head.next != null) {
                Node nextNode = head.next;
                head.next = null;
                return nextNode;
            } else {
                return null;
            }
        }

        Node currentNode = head;
        Node prevNode = currentNode;
        for (int i = 0; i < position; i++) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode.next != null) {
            prevNode.next = currentNode.next;
        } else {
            prevNode.next = null;
        }
        return head;
    }
}
