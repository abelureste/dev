package CSCI3200Lab1Assignment;

import java.util.LinkedList;

public class Spring3200Lab1 {
    public static <Type> void PrintAllNodes(PrintNode<String> job) {        //Method that prints all nodes connected to the job inputted
        PrintNode<String> current = job;
        while (current != null) {
            System.out.print(current.getJob());
            if (current.getLink() != null) {
                System.out.print(" --> ");
            }
            current = current.getLink();
        }
        System.out.println("");
    }

    public static void main (String[] args) {
        //Question 1
        System.out.println("-------- Question 1 --------");
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("3200");
        myLinkedList.addFirst("CSCI");
        myLinkedList.add(":");
        myLinkedList.add(3, "D1");
        System.out.println(myLinkedList);
        myLinkedList.add("   ");
        System.out.println(myLinkedList + " List Size: " + myLinkedList.size());
        myLinkedList.add("Spring 2025");
        myLinkedList.add("Algorithm Analysis");
        myLinkedList.add(6, "Data Structure");
        System.out.println(myLinkedList.get(6));
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList + " List size: " + myLinkedList.size());

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