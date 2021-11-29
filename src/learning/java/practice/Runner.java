package learning.java.practice;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.printList();
        list.insertAtBeg(0);
        list.printList();
        list.insertAtPos(2, 50);
        list.printList();
        list.deleteAt(15);
        list.printList();
    }
}
