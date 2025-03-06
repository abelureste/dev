package CSCI3200Lab2Assignment;

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
    public void nextLink (PrintNode newLink) {
        link = newLink;
    }
    public void prevLink (PrintNode lastLink) {
        link = lastLink;
    }
    public void setJob (int newJob) {
        job = newJob;
    }
    public PrintNode getNextLink () {
        return link;
    }
    public PrintNode getPrevLink () {
        return link;
    }
    public int getJob () {
        return job;
    }
}

