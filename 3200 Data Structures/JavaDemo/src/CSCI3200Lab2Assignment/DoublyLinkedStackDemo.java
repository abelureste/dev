package CSCI3200Lab2Assignment;

public class DoublyLinkedStackDemo {
    public static void main (String[] args) {
        PrintNode<String> job1 = new PrintNode<String>("www.ung.edu");
        PrintNode<String> job2 = new PrintNode<String>("www.google.edu");
        PrintNode<String> job3 = new PrintNode<String>("www.gmail.edu");
        PrintNode<String> job4 = new PrintNode<String>("www.nfl.edu");

        job1.setNextLink(job2);
        job2.setNextLink(job3);
        job3.setNextLink(job4);
        
        job4.setPrevLink(job3);
        job3.setPrevLink(job2);
        job2.setPrevLink(job1);

        //Current webpage
        PrintNode<String> firstNode = job1;
        System.out.println("The current webpage is " + firstNode.getJob());
        //Second webpage
        while(firstNode != job2) {
            firstNode = firstNode.getNextLink();
            System.out.println("The second webpage visited is " + firstNode.getJob());
        }
        //Third webpage
        while(firstNode != job3) {
            firstNode = firstNode.getNextLink();
            System.out.println("The third webpage visited is " + firstNode.getJob());
        }
        //Backtracking
        while(firstNode.getPrevLink() != null) {
            firstNode = firstNode.getPrevLink();
            if(firstNode.getPrevLink() == null) {
                System.out.println("The webpage firstNode is pointing to after backtracking is " + firstNode.getJob());
                }
        }
    }
}
