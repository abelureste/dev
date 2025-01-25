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
