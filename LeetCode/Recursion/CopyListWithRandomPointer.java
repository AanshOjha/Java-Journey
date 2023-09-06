package LeetCode.Recursion;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    static Map<Node, Node> map = new HashMap<>();

    static public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        if (map.containsKey(head)) {
            return map.get(head);
        }

        Node newNode = new Node(head.val);
        map.put(head, newNode);

        newNode.next = copyRandomList(head.next);
        newNode.random = copyRandomList(head.random);

        return newNode;
    }

    // DON'T BE AFRAID ! THIS IS JUST TO ENTER INFO AND PRINT RESULT :)
    public static void main(String[] args) {
        // Create nodes with values and random pointers
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        node1.next = node2;
        node1.random = null;

        node2.next = node3;
        node2.random = node1;

        node3.next = node4;
        node3.random = node5;

        node4.next = node5;
        node4.random = node3;

        node5.next = null;
        node5.random = node1;

        // Call the copyRandomList method to perform the deep copy
        Node copiedHead = copyRandomList(node1);

        // Print the result (deep copy of the linked list with random pointers)
        while (copiedHead != null) {
            System.out.print("[" + copiedHead.val + ",");
            if (copiedHead.random != null) {
                System.out.print(copiedHead.random.val);
            } else {
                System.out.print("null");
            }
            System.out.print("] -> ");
            copiedHead = copiedHead.next;
        }
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
