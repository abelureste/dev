package CSCI3200Lab2Assignment;

public class PrintNode<Type>{
    private String job;
    private PrintNode<Type> nextLink;
    private PrintNode<Type> prevLink;
    public PrintNode () {
        job = "";
        nextLink = null;
        prevLink = null;
    }
    public PrintNode (String job) {
        this.job = job;
        nextLink = null;
        prevLink = null;
    }
    public PrintNode (String job, PrintNode<Type> nextLink, PrintNode<Type> prevNode) {
        this.job = job;
        this.nextLink = nextLink;
        this.prevLink = prevNode;
    }
    public void setJob (String newJob) {
        job = newJob;
    }
    public void setNextLink (PrintNode<Type> newLink) {
        nextLink = newLink;
    }
    public void setPrevLink (PrintNode<Type> newLink) {
        prevLink = newLink;
    }
    public PrintNode<Type> getNextLink () {
        return nextLink;
    }
    public PrintNode<Type> getPrevLink () {
        return prevLink;
    }
    public String getJob () {
        return job;
    }
}

