package com.linked5;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(56);
        list.addNode(30);
        list.addNode(70);

        System.out.println("Original Sequence:");
        list.display();

        list.popLast();

        System.out.println("Final Sequence after popLast:");
        list.display();
    }
}
