package CSCI3200;

import java.util.Scanner;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);         //Initializes scanner
        System.out.print("Enter base number: ");          //Prompts user to enter number for base
        int base = userInput.nextInt();                     //Assigns user input to integer variable base

        System.out.print("Enter power number: ");         //Prompts user to enter number for power
        int power = userInput.nextInt();                    //Assigns user input to integer variable power
        userInput.close();                                  //Closes scanner

        System.out.println(base + " ^ " + power + " = " + basePowerCalculation(base, power));       //Prints base and power variable as well as the result from basePowerCalculation method
    }

    public static int basePowerCalculation(int m, int n) {          //Initialize basePowerCalculation method with inputs integer m and integer n
        if (m > 0 && n > 0 || m < 0) {                              //Only returns recursive method if base isn't 0 and power is a postive
            return m * basePowerCalculation(m, n - 1);              //Multiples the base number by itself and returns to method with a decrement in the power value
        } else if (m > 0 && n == 0 || m < 0) {                      //If any integer is put to a power of 0 the result should be 1
            return 1;                                               //Returns 1 to main method
        } else {                                                    //Moves on to result for all other cases (such as power being negative which would result in a fraction)
            return 0;                                               //Returns a 0 to main method
        }
    }
}
