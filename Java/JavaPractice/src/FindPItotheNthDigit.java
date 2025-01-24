import java.text.DecimalFormat;
import java.util.Scanner;

public class FindPItotheNthDigit {
    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner(System.in);                         //Open scanner
        System.out.print("How many numbers do you want after PI?: ");     //Ask user to input amount of decimals to put behind PI
        int numbers = userInput.nextInt();                                  //Take in user input into variable numbers
        userInput.close();                                                  //Close user input to prevent memory leak

        System.out.println("PI rounded to " + numbers + " decimal places is: " + FindPItotheNth(numbers));      //Prints answer to method FindPItotheNth
        
    }

    public static double FindPItotheNth(int numbers) {
        StringBuilder pattern = new StringBuilder("#.");
        for(int i = 0; i < numbers; i++) {
            pattern.append("#");
        }
        DecimalFormat rounded = new DecimalFormat(pattern.toString());
        double roundedDouble = Double.parseDouble(rounded.format(Math.PI));
        return roundedDouble;
    }

}
