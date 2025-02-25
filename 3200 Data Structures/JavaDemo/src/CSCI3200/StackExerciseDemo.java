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
    }

    public static void StackSort(Stack<Integer> stack){
        Stack<Integer> sortedStack = new Stack<Integer>();

        if(stack.isEmpty()){
            return;
        }

        while(stack.isEmpty() != true){
            int temp = stack.pop();
            if(temp > stack.peek()){
                sortedStack.add(temp);
            }
        }

        while(stack.isEmpty() != false){
            
        }
    }
}

