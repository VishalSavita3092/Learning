package learning.java.practice;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeg(5);
        list.insertAtBeg(10);
        list.insertAtBeg(15);
        list.insertAtBeg(20);
        System.out.println("Printing list after inserting");
        list.printList();
        list.insertAtPos(2, 50);
        list.insert(55);
        list.printList();
        System.out.println("Deleting specified key node");
        list.deleteAt(50);
        list.printList();
        System.out.println("Deleting first element");
        list.deleteFirst();
        list.printList();
        System.out.println("Deleting last element");
        list.deleteAtLast();
        list.printList();
    }
}
