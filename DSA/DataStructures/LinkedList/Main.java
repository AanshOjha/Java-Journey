package DSA.DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(50);

        myLinkedList.append(40);
        myLinkedList.append(30);
        myLinkedList.append(20);
        myLinkedList.append(10);
        System.out.println("List Contents: ");
        myLinkedList.printList();

        System.out.println();
        myLinkedList.reverse();
        myLinkedList.printList();
//        System.out.println();
//        myLinkedList.remove(2);
    }
}
