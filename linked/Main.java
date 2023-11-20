package com.linked;

public class Main {
    
        public static void main(String[] args) {
            LinkedList linkedList = new LinkedList();

            // Inserting values into the linked list
            linkedList.insert(56);
            linkedList.insert(30);
            linkedList.insert(70);

            // Displaying the linked list
            System.out.println("Linked List: ");
            linkedList.display();
        }
}
