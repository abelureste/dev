package CSCI3200;

import java.util.Scanner;
import java.util.Stack;

public class StackExerciseDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        Scanner userInput = new Scanner(System.in);
        int count = 1;
        while(count < 11){
            System.out.print("Enter an Integer (" + count + ") to add to the stack: ");
            int stackAdd = userInput.nextInt();
            stack.push(stackAdd);
            count++;
        }
        userInput.close();

        StackSort(stack);

        System.out.println(stack);
    }

    public static void StackSort(Stack<Integer> stack){
        Stack<Integer> sortedStack = new Stack<Integer>();

        while(stack.isEmpty() != true){
            int temp = stack.pop();

            while(sortedStack.isEmpty() != true && sortedStack.peek() < temp){
                stack.push(sortedStack.pop());
            }

            sortedStack.push(temp);
        }

        while(sortedStack.isEmpty() != true){
            stack.push(sortedStack.pop());
        }

    }
}

