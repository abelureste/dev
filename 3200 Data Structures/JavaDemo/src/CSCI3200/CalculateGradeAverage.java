package CSCI3200;

import java.util.Scanner;

public class CalculateGradeAverage {
    double[][] grades;      //Initializing variable for 2D array for grades
    double[] averages;      //Initializing variable for 1D array for grade averages
    int totalRows;          //Initializing variable for empty integer for total amount of rows (how many students we need to enter)
    int totalColumns;       //Initializing variable for empty integer for total amount of columns (how many grades each student will be assigned)

    public CalculateGradeAverage(int totalRows, int totalColumns){      //Method containing two double parameters that can be modified.
        this.totalRows = totalRows;                                     //Assigns totalRows variable as local variable
        this.totalColumns = totalColumns;                               //Assigns totalColumns variable as local variable            
        grades = new double[totalRows][totalColumns];                   //Assigns empty grades 2D array to take input from method parameters
        averages = new double[totalRows];                               //Assigns empty averages 1D array to take input from method parameters
    }

    public void Readgrades() {                                                          //Method to read grades returning void 
        Scanner UserInput = new Scanner(System.in);                                     //Initializes scanner
        for (int row = 0; row < totalRows; row++) {                                     //First for loop to represent rows, stops once row value is no longer less than the total amount of rows
            for (int column = 0; column < totalColumns; column++) {                     //Second for loop to represent columns, stops once column value is no longer less than the total amount of column
                System.out.print("Enter value for [" + row + "][" + column + "]: ");    //Prompts user to enter values for the respective cells
                double gradeValue = UserInput.nextDouble();                             //Assigns the user's input to gradeValue variable for later use
                if (gradeValue >= 0 && gradeValue <= 100) {                             //Only accepts integers and floating point numbers between 0 and 100
                    grades[row][column] = gradeValue;                                   //Assigns the grade value to the respective cell
                } else {
                    System.out.println("Please enter a value between 0 and 100.");    //Prompts user to only enter values within bounds
                    column--;                                                           //Decrements the row value allowing the for loop to stay on the same instance
                }
            }
        }
        UserInput.close();                                                              //Closes scanner
    }

    public double[] Avggrades() {                                           //Method returning a double that is the average grade for each student
        for(int row = 0; row < totalRows; row++) {                      
            for(int column = 0; column < totalColumns; column++){           //FIX THIS MATH IT WONT WORK IF THE GRID OF ROWS AND COLUMNS IS NOT SQUARE (FIX FOR RECTANGULAR CASES)
                averages[row] = (grades[row][column] + averages[row]);
            }
            averages[row] = (averages[row] / totalRows);
        }

        for(int i = 0; i < totalRows; i++){
            System.out.println("The average for averages at index "+ i + " = " + averages[i]);
        }
        return averages;
    }

    public static void main (String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("How many students do you want to enter?: ");
        int totalRows = UserInput.nextInt();
        System.out.print("How many grades do you want to enter?: ");
        int totalColumns = UserInput.nextInt();

        CalculateGradeAverage calculateGrade = new CalculateGradeAverage(totalRows, totalColumns);

        calculateGrade.Readgrades();
        calculateGrade.Avggrades();
        UserInput.close();
    }
}