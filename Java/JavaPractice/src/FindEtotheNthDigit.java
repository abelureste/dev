//Find e to the Nth Digit - Just like the previous problem, but with e instead of PI. Enter a number and have the program generate e up to that many decimal places. Keep a limit to how far the program will go.

import java.text.DecimalFormat;
import java.util.Scanner;

public class FindEtotheNthDigit {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputtedNumber = userInput.nextInt();
        userInput.close();

        System.out.println("Euler's number to it's decimal place would be: " + FindEtotheNth(inputtedNumber));

    }

    public static double FindEtotheNth(int number) {
        StringBuilder pattern = new StringBuilder("#.");
        for(int i = 0; i < number; i++) {
            pattern.append("#");
        }
        DecimalFormat answer = new DecimalFormat(pattern.toString());
        return Double.parseDouble(answer.format(Math.E));
    }
}
