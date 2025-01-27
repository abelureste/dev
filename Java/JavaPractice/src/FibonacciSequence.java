import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many times do you want to initalize the Fibonacci sequence?: ");
        int number = userInput.nextInt();
        userInput.close();
        
        System.out.println("The Fibonacci sequince initialized " + number + " times is: " + FibSequence(number));
    }

    public static int FibSequence(int number) {     //Generate Fibonnaci's sequence for as many times as the number is entered.
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0; i < number; i++){
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
            a = b;
            b = c;
        }
        return c;
    }
}
