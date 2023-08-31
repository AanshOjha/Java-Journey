package LeetCode.LinkedList;

import LeetCode.ListNode;

public class BinaryToIntInLinkedList {
    static public int getDecimalValue(ListNode head) {
        int result = 0;

        while (head != null) {
            result = (result << 1) + head.val;
            head = head.next;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(1);
        ListNode l2 = new ListNode(0, l3);
        ListNode l1 = new ListNode(1, l2);

        System.out.println(getDecimalValue(l1));
    }
}
