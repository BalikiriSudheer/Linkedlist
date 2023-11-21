package com.linked6;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(56);
        linkedList.addNode(30);
        linkedList.addNode(70);

        System.out.println("Initial Sequence:");
        linkedList.printList();


        linkedList.popLast();

        System.out.println("Final Sequence:");
        linkedList.printList();
    }
}
