package com.linked1;

public class LinkedList {
    AddingLinked head;

    public void addNode(int data) {
        AddingLinked newNode = new AddingLinked(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        AddingLinked current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

