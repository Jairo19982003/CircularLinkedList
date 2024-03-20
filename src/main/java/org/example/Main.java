package org.example;


public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(3);
        list.add(2);
        list.add(0);
        list.add(-4);
        System.out.println("Lista circular: ");
        list.display();
    }
}
