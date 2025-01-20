package CSCI3200;

import java.util.Scanner;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = userInput.nextInt();

        System.out.print("Enter power number: ");
        int power = userInput.nextInt();
        userInput.close();

        System.out.println(base + " ^ " + power + " = " + basePowerCalculation(base, power));
    }

    public static int basePowerCalculation(int m, int n) {
        if (m > 0 && n > 0 || m < 0) {        //add a base case
            int answer = (int)Math.pow(m,n);
            return answer;
        } else if (m > 0 && n == 0 || m < 0) {
            return 1;
        } else {                       //add a recursive statement
            return 0;
        }
    }
}
