package CSCI3200Lab1Assignment;

public class PrintNode<Type>{
    private String job;
    private PrintNode<Type> link;
    public PrintNode () {
        job = "";
        link = null;
    }
    public PrintNode (String job) {
        this.job = job;
        link = null;
    }
    public PrintNode(String job, PrintNode<Type> link) {
        this.job = job;
        this.link = link;
    }
    public void setLink (PrintNode<Type> newLink) {
        link = newLink;
    }
    public void setJob (String newJob) {
        job = newJob;
    }
    public PrintNode<Type> getLink () {
        return link;
    }
    public String getJob () {
        return job;
    }
}

