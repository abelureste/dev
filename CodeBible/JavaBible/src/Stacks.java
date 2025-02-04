import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();          //Initialize stack

        stack.push("Minecraft");                       //Push elements into stack
        stack.push("Skyrim");                       
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("Red Dead Redemption");

        System.out.println(stack);                          //Returns stack

        stack.pop();                                        //Removes top element from stack
        stack.pop();

        System.out.println(stack.peek());                   //Returns top element in stack

        System.out.println(stack.isEmpty());                //Returns true if stack is empty, else returns false

        System.out.println(stack.search("DOOM"));         //Returns the index of the element in the stack else returns -1
        System.out.println(stack.search("Fallout"));
    }    

}
