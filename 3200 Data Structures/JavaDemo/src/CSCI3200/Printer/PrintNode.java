package CSCI3200.Printer;

public class PrintNode {
    {
        private String job;
        private PrintNode link;
        
        public PrintNode () {
            job = null;
            link = null;
        }

        public PrintNode (String job) {
            this.job = job;
            link = null;
        }

        public PrintNode(String job, PrintNode link) {
            this.job = job;
            this.link = link;
        }

        public void setLink (PrintNode newLink) {
            link = newLink;
        }

        public void setJob (String newJob) {
            job = newJob;
        }

        public PrintNode getLink () {
            return link;
        }

        public String getJob () {
            return job;
        }
    }
}
