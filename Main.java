package com.linked1;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        
        linkedList.addNode(70);
        linkedList.addNode(30);
        linkedList.addNode(56);

        // Printing the linked list
        System.out.println("LinkedList Sequence:");
        linkedList.printList();
    }
}
