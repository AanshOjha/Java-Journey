package LeetCode.LinkedList;


import LeetCode.ListNode;

public class DeleteDuplicates {


    public ListNode deleteDuplicates(ListNode head) {

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
}

//class ListNode {
//    public int val;
//    public ListNode next;
//    ListNode() {}
//    public ListNode(int val) { this.val = val; }
//    public ListNode(int val, LeetCode.ListNode next) { this.val = val; this.next = next; }
//}
