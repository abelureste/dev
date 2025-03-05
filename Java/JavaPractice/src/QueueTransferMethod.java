import java.util.Stack;
import java.util.Random;

public class QueueTransferMethod {

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        for(int i = 0; i < 5; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt();
            stack1.push(randomNumber);
        }

        transfer(stack1, stack2);
        System.out.println("Stack 1: " + stack1 + ", Stack 2:" + stack2);
    }

    public static void transfer(Stack<Integer> s, Stack<Integer> t) {
        for(Integer i : s) {
            t.push(i);
        }
    }
}
