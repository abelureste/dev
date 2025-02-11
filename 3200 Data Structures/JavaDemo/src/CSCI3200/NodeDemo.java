package CSCI3200;

public class NodeDemo {
    public static void main (String[] args) {

        PrintNode job1 = new PrintNode(72);
        PrintNode job2 = new PrintNode(87);
        PrintNode job3 = new PrintNode(100);
        PrintNode job4 = new PrintNode(75);

        job1.setLink(job2);
        job2.setLink(job3);
        job3.setLink(job4);
        
        while (job4 != null) {
            System.out.print(job1.getJob());
            System.out.print(" ");
            job1 = job1.getLink();
        }
    }
}
