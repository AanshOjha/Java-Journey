package DSA.DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(6);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);

        System.out.println("List Contents: ");
        myLinkedList.printList();
        System.out.println();

        myLinkedList.printList();
    }
}
