package LeetCode.LinkedList;

import LeetCode.ListNode;

public class ReverseLinkedListBetween {
    static public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        // Move prev and current to the starting position
        for (int i = 1; i < left; i++) {
            prev = current;
            current = current.next;
        }

        ListNode start = prev;
        ListNode end = current;

        // Reverse the sublist from left to right
        for (int i = left; i <= right; i++) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Update pointers to reconnect the reversed sublist
        start.next = prev;
        end.next = current;

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        reverseBetween(l1, 2, 4);

        ListNode head = l1;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
