package CSCI3200Lab1Assignment;

import java.util.LinkedList;

public class Spring3200Lab1 {
    public static <Type> void PrintAllNodes(PrintNode<String> job) {        //Method that prints all nodes connected to the job inputted
        PrintNode<String> current = job;        //Initializes new node and equals it to the value inputted into the method
        while (current != null) {           //Loops while the current node has a link
            System.out.print(current.getJob());         //Prints the current node
            if (current.getLink() != null) {        //If current node has a link
                System.out.print(" --> ");        //Print arrow pointing to next node
            }
            current = current.getLink();        //Initalizes current node as the next node in the link
        }
        System.out.println("");
    }

    public static void main (String[] args) {
        //Question 1
        System.out.println("-------- Question 1 --------");
        LinkedList<String> myLinkedList = new LinkedList<String>();
        
        //Step 1
        myLinkedList.add("3200");

        //Step 2
        myLinkedList.addFirst("CSCI");

        //Step 3
        myLinkedList.add(":");

        //Step 4
        myLinkedList.add(2, "D1");

        //Step 5
        System.out.println("Contents of the list: " + myLinkedList + ", List Size: " + myLinkedList.size());

        //Step 6
        myLinkedList.add(" ");
        myLinkedList.add(" ");
        myLinkedList.add(" ");

        //Step 7
        System.out.println("Contents of the list: " + myLinkedList + ", List Size: " + myLinkedList.size());

        //Step 8
        myLinkedList.add("Spring 2025");

        //Step 9
        myLinkedList.add("Algorithm Analysis");

        //Step 10
        myLinkedList.add(6, "Data Structure");

        //Step 11
        System.out.println("Element in the 6th position: " + myLinkedList.get(5));

        //Step 12
        System.out.println("Last element: " + myLinkedList.getLast());

        //Step 13
        myLinkedList.remove(5);
        System.out.println("Element in the 6th position: " + myLinkedList.get(5));

        //Step 14
        System.out.println("Contents of the list: " + myLinkedList + " List size: " + myLinkedList.size());

        //Question 2
        System.out.println("");
        System.out.println("-------- Question 2 --------");
        PrintNode<String> job1 = new PrintNode<String>("College");
        PrintNode<String> job2 = new PrintNode<String>("Department");
        PrintNode<String> job3 = new PrintNode<String>("Professor");
        PrintNode<String> job4 = new PrintNode<String>("Student");
        PrintNode<String> job5 = new PrintNode<String>("Registrar");
        PrintNode<String> job6 = new PrintNode<String>("UNG Web Server");
        PrintNode<String> job7 = new PrintNode<String>("Banners");
        PrintNode<String> job8 = new PrintNode<String>("D2L");
        PrintNode<String> job9 = new PrintNode<String>("Provost");
        
        job1.setLink(job2);
        job2.setLink(job6);
        job3.setLink(job6);
        job4.setLink(job7);
        job5.setLink(job6);
        job6.setLink(job7);
        job7.setLink(job8);
        job9.setLink(job5);

        PrintAllNodes(job2);
        PrintAllNodes(job1);
        PrintAllNodes(job4);
        PrintAllNodes(job6);
    }
}