package hackerRankDataStructuresChallenges;

/**
 * Created by timneville on 2/8/17.
 */
public class LinkedListReverseALinkedList {
    /*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    class Node {
        int data;
        Node next;
    }

    // This is a "method-only" submission.
    // You only need to complete this method.
    Node Reverse(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Node currentNode = head;
        Node prevNode = currentNode;
        Node nextNode = currentNode.next;
        while (nextNode.next != null) {
            currentNode = nextNode;
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
        }
        currentNode = nextNode;
        currentNode.next = prevNode;
        head.next = null;

        return currentNode;
    }

}
