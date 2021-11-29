package learning.java.practice;

public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        public Node(int d){
            data = d;
        }

    }

//    Inserting values in the end of the Linked List
    public void insert(int data){
        Node node = new Node(data);
//        node.data = data;
        if(head == null){
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    //    Inserting values at Beginning of the Linked List
    public void insertAtBeg(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else {
            node.data = data;
            node.next = null;
            node.next = head;
            head = node;
        }
    }

//    Inserting data at the specified position
    public void insertAtPos(int index, int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else {
            Node temp = head;
            int i=0;
            while (i<index){
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

//    Deleting the Node from the Linked List

    public void deleteAt(int key){
            Node temp = head, prev = null;
            if(temp != null && temp.data == key){
                head = temp.next;

                return;
            }
            while (temp != null && temp.data != key){
                prev = temp;
                temp = temp.next;
            }
            if(temp == null){
                return;
            }
            prev.next = temp.next;;
    }

//    Printing the whole Linked List
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}


