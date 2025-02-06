package CSCI3200.Printer;

public class Printer {
    public static void main(String[] args) {
            PrintNode job1 = new PrintNode();
            job1.setJob("Dino.xls");
            PrintNode job2 = new PrintNode ("Fred.doc", job1);
            PrintNode job3 = new PrintNode ("Barney.pdf", job2);
            PrintNode job4 = job3;
                while (job4 != null) {
                    System.out.println(job4.getJob());
                    job4 = job4.getLink();
                }
    }
}
