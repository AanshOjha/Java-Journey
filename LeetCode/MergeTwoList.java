package LeetCode;

public class MergeTwoList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); // Dummy node
        ListNode current = dummy; // Current pointer for merged list
        
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        // Link the remaining nodes, if any
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        
        return dummy.next; // Head of the merged list
    }
    
    // Just for Printing
    public static void printListNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node30 = new ListNode(4);
        ListNode node20 = new ListNode(3, node30);
        ListNode node10 = new ListNode(1, node20);

        
        ListNode result = mergeTwoLists(node1, node10);
        printListNode(result);
    }

}

