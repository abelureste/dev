package CSCI3200Lab1Assignment;

import java.util.LinkedList;

public class Spring3200Lab1 {
    public static void main (String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("3200");
        myLinkedList.addFirst("CSCI");
        myLinkedList.add(":");
        myLinkedList.add(3, "D1");
        System.out.println(myLinkedList);
        myLinkedList.add("   ");
        System.out.println(myLinkedList + " List Size:" + myLinkedList.size());
        myLinkedList.add("Spring 2025");
        myLinkedList.add("Algorithm Analysis");
        myLinkedList.add(6, "Data Structure");
        System.out.println(myLinkedList.get(6));
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList + " List size: " + myLinkedList.size());

        PrintNode<String> job4 = new PrintNode<String>();
    }
}