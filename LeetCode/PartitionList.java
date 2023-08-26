package LeetCode;

public class PartitionList {
     public ListNode partition(ListNode head, int x) {
         ListNode lessHead = new ListNode(0); // Dummy node for nodes less than x
         ListNode less = lessHead; // Pointer to the tail of the "less than x" list
        
         ListNode greaterHead = new ListNode(0); // Dummy node for nodes greater than or equal to x
         ListNode greater = greaterHead; // Pointer to the tail of the "greater than or equal to x" list
        
         while (head != null) {
             if (head.val < x) {
                 less.next = head;
                 less = less.next;
             } else {
                 greater.next = head;
                 greater = greater.next;
             }
             head = head.next;
         }
        
         // Connect the two lists
         greater.next = null; // Set the next of the greater list's tail to null
         less.next = greaterHead.next; // Link the "less than x" list to the "greater than or equal to x" list
        
         return lessHead.next; // Return the head of the partitioned list
     }

     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     public static void main(String[] args) {
         ListNode node6 = new ListNode(2);
         ListNode node5 = new ListNode(5, node6);
         ListNode node4 = new ListNode(2, node5);
         ListNode node3 = new ListNode(3, node4);
         ListNode node2 = new ListNode(4, node3);
         ListNode node1 = new ListNode(1, node2);
        
         PartitionList partitionList = new PartitionList();
         ListNode result = partitionList.partition(node1, 3);
        
         // Print the result
         while (result != null) {
             System.out.print(result.val + " ");
             result = result.next;
         }
     }
 }

// public class PartitionList {
//     public ListNode partition(ListNode head, int x) {
//         ListNode lessHead = new ListNode(0); // Dummy node for nodes less than x
//         ListNode less = lessHead; // Pointer to the tail of the "less than x" list
        
//         ListNode greaterHead = new ListNode(0); // Dummy node for nodes greater than or equal to x
//         ListNode greater = greaterHead; // Pointer to the tail of the "greater than or equal to x" list
        
//         while (head != null) {
//             if (head.val < x) {
//                 less.next = head;
//                 less = less.next;
//             } else {
//                 greater.next = head;
//                 greater = greater.next;
//             }
//             head = head.next;
//         }
        
//         // Connect the two lists
//         greater.next = null; // Set the next of the greater list's tail to null
//         less.next = greaterHead.next; // Link the "less than x" list to the "greater than or equal to x" list
        
//         return lessHead.next; // Return the head of the partitioned list
//     }

//     public class ListNode {
//         int val;
//         ListNode next;
//         ListNode() {}
//         ListNode(int val) { this.val = val; }
//         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     }
//     public static void main(String[] args) {
//         ListNode node6 = new ListNode(2);
//         ListNode node5 = new ListNode(5, node6);
//         ListNode node4 = new ListNode(2, node5);
//         ListNode node3 = new ListNode(3, node4);
//         ListNode node2 = new ListNode(4, node3);
//         ListNode node1 = new ListNode(1, node2);
        
//         PartitionList partitionList = new PartitionList();
//         ListNode result = partitionList.partition(node1, 3);
        
//         // Print the result
//         while (result != null) {
//             System.out.print(result.val + " ");
//             result = result.next;
//         }
//     }
// }
