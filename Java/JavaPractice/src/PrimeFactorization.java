//Prime Factorization - Have the user enter a number and find all Prime Factors (if there are any) and display them.

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = userInput.nextInt();
        userInput.close();

        if (number > 1) {
            System.out.print("Prime factors: ");
            primeFactorization(number);
        } else {
            System.out.println("Enter a number greater than 1.");
        }
    }

    public static void primeFactorization(int num) {
        while(num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        for(int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num > 1) {
            System.out.print(num);
        }
    }
}