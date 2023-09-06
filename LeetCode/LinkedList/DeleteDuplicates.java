package LeetCode.LinkedList;


import LeetCode.ListNode;

public class DeleteDuplicates {


    static public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {
            // if next node value is similar to current node
            // skip next node and update current.next

            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l7 = new ListNode(5);
        ListNode l6 = new ListNode(5, l7);
        ListNode l5 = new ListNode(4, l6);
        ListNode l4 = new ListNode(3, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);


        deleteDuplicates(l1);

        // Just for printing our result
        var head = l1;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
