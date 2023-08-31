package LeetCode.LinkedList;


import LeetCode.ListNode;

public class RemoveNode {
    public ListNode remove2(ListNode head, int val) {
        // Handle cases where the list starts with nodes with the target value
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            if (current.val == val) {
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
//class ListNode {
//    public int val;
//    public LeetCode.ListNode next;
//    ListNode() {}
//    public ListNode(int val) { this.val = val; }
//    public ListNode(int val, LeetCode.ListNode next) { this.val = val; this.next = next; }
//}
