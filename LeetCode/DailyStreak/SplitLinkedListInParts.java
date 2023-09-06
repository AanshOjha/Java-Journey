package LeetCode.DailyStreak;

import LeetCode.ListNode;

import java.util.Arrays;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class SplitLinkedListInParts {
    static public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int partSize = length / k;
        int extra = length % k;

        ListNode[] result = new ListNode[k];
        temp = head;
        for (int i = 0; i < k; i++) {
            result[i] = temp;
            int currentPartSize = partSize + (extra-- > 0 ? 1 : 0);
            for (int j = 0; j < currentPartSize - 1; j++) {
                temp = temp.next;
            }
            if (temp != null) {
                ListNode next = temp.next;
                temp.next = null;
                temp = next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        int k = 5;

        ListNode[] result = splitListToParts(l1, k);
        // Iterate through the result array and print the elements
        for (int i = 0; i < k; i++) {
            ListNode current = result[i];
            System.out.print("Part " + (i + 1) + ": ");

            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }

            System.out.println(); // Move to the next line for the next part
        }
    }
}