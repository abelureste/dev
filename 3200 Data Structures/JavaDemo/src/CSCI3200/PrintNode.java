package CSCI3200;

public class PrintNode{
    private int job;
    private PrintNode link;
    public PrintNode () {
        job = 0;
        link = null;
    }
    public PrintNode (int job) {
        this.job = job;
        link = null;
    }
    public PrintNode(int job, PrintNode link) {
        this.job = job;
        this.link = link;
    }
    public void setLink (PrintNode newLink) {
        link = newLink;
    }
    public void setJob (int newJob) {
        job = newJob;
    }
    public PrintNode getLink () {
        return link;
    }
    public int getJob () {
        return job;
    }
}

