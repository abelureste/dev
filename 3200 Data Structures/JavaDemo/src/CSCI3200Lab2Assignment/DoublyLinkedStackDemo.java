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

        PrintNode<String> current = job1;
        while(current != job4){
            System.out.print(current.getJob());
            if(current.getNextLink() != job4){
                System.out.print(" --> ");
            }
            current = current.getNextLink();
        }
    }
}
