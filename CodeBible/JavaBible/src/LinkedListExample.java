import java.util.LinkedList;

public class LinkedListExample {
    public static void main (String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");

        linkedList.remove(1);
        linkedList.add(3, "E");

        System.out.println(linkedList);

    }
}
