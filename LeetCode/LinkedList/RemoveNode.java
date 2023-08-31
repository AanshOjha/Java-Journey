package LeetCode.LinkedList;

import DSA.DataStructures.LinkedList.LinkedList;
import LeetCode.ListNode;

public class RemoveNode {
    public ListNode remove2(int val) {
        // Handle cases where the list starts with nodes with the target value
        while (head != null && head.value == val) {
            head = head.next;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            if (current.value == val) {
                if (previous != null) {
                    previous.next = current.next;
                }
            } else {
                previous = current;
            }
            current = current.next;
        }

        return head;
    }
}
