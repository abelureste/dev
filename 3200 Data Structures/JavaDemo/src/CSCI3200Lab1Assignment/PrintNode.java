package CSCI3200Lab1Assignment;

public class PrintNode<Type>{
    private int job;
    private Type link;
    public PrintNode () {
        job = 0;
        link = null;
    }
    public PrintNode (int job) {
        this.job = job;
        link = null;
    }
    public PrintNode(int job, Type link) {
        this.job = job;
        this.link = link;
    }
    public void setLink (Type newLink) {
        link = newLink;
    }
    public void setJob (int newJob) {
        job = newJob;
    }
    public Type getLink () {
        return link;
    }
    public int getJob () {
        return job;
    }
}

