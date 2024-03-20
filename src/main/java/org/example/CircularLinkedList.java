package org.example;

public class CircularLinkedList {
    public Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
           Node temp = head;
           while (temp.next != head) {
                temp = temp.next;
           }
           temp.next = newNode;
              newNode.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("La lista esta vacia. ");
        } else {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println(" ");
        }
    }
}
