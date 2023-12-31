package DSA.DataStructures.LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    // Constructor
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }


    // ============================= Understand from here ======================================

    // Adding value at the beginning of LinkedList
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }


    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }


    public Node removeFirst() {
        // If empty
        if (length == 0) {
            return null;
        }

        // if List has more than 1 element
        Node temp = head; // current head value to temp
        head = head.next; // shifting head
        temp.next = null; //  ensures removed node doesn't retain any references to the rest of the list
        length--;

        // After removing element if list has become null, set tail to null
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    // Removing the last element from LinkedList
    public Node removeLast() {

        // If List is empty
        if (length == 0) {
            return null;
        }

        // If list has more than 1 element
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);     // Getting value of index
        if (temp != null) {
            temp.value = value;     // Assigning temp value as provided value
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        // -ve and over length not allowed
        if (index < 0 || index > length) {
            return false;
        } else if(index == 0) {     // To insert in beginning
            prepend(value);
            return true;
        } else if(index == length) {    // To insert in end
            append(value);
        }

        // Somewhere in the list
        Node newNode = new Node(value);     // Create a new node
        Node temp = get(index -1);      // Assign temp with value of preceding index
        newNode.next = temp.next;       // Attach newNode.next to the next one in list
        temp.next = newNode;            //  Assign newNode as next to temp.next
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index > length) {
            return null;
        } else if (index == 0) {
            removeFirst();
        } else if (index == length) {
            removeLast();
        }
        Node temp = get(index - 1);     // Assigning temp as preceding element
        temp.next = get(index + 1);     // Assigning next element as temp.next
        length--;
        return get(index);
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public Node middleNode() {
        // For empty Node
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome() {
        if (head == null || head.next ==null){
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node middleNode = slow;
        // reverse all after the midnode
        Node current = middleNode;
        Node previous = null;
        Node next;
        while (current != null){
            next = current.next;
            current.next = previous ;
            previous = current ;
            current = next;
        }
        Node left = head;
        Node right = previous;

        while (right !=null){
            if (right.value != left.value){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    // =================================================================================================

    // Of LeetCode. add Node head in the arguments
    public Node remove2(int val) {
        // Handle cases where the list starts with nodes with the target value
        while (head != null && head.value == val) {
            head = head.next;
        }

        Node current = head;
        Node previous = null;

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

    // Exact Leetcode not applicable in this file
    public Node  deleteDuplicates(Node head) {

     Node current = head;

        while (current != null && current.next != null) {
            // if next node value is similar to current node
            // skip next node and update current.next

            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}