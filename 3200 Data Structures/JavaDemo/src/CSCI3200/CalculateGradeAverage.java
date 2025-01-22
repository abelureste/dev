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
            for (int column = 0; column < totalColumns; column++) {                     //Second for loop to represent columns, stops once column value is no longer less than the total amount of columns
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
        for(int row = 0; row < totalRows; row++) {                          //First for loop to represent rows, stops once row value is no longer less than the total amount of rows
            for(int column = 0; column < totalColumns; column++){           //Second for loop to represent columns, stops once column value is no longer less than the total amount of columns
                averages[row] = (grades[row][column] + averages[row]);      //Fills the averages array by adding the grades together in same corresponding index from grades 2D array to averages 1D array
            }
            averages[row] = (averages[row] / totalColumns);                 //Divides each index by the total amount of columns giving the average (average = sum of numbers divided by # of numbers)
        }

        for(int i = 0; i < totalRows; i++){                                                         //For loop initialization that won't stop until all rows are printed
            System.out.println("The average for averages at index "+ i + " = " + averages[i]);      //Prints the average based on index
        }
        return averages;
    }

    public static void main (String[] args) {
        Scanner UserInput = new Scanner(System.in);                             //Initializes scanner
        System.out.print("How many students do you want to enter?: ");        //Prompts user to enter amount of rows for 2D array
        int totalRows = UserInput.nextInt();                                    //Assigns variable to user's input
        System.out.print("How many grades do you want to enter?: ");          //Prompts user to enter amount of columns for 2D array  
        int totalColumns = UserInput.nextInt();                                 //Assigns variable to user's input

        CalculateGradeAverage calculateGrade = new CalculateGradeAverage(totalRows, totalColumns);      //Calls calculateGrade method and assigns variables cooresponding to user input

        calculateGrade.Readgrades();        //Executes Readgrades method
        calculateGrade.Avggrades();         //Executes Avggrades method
        UserInput.close();                  //Closes scanner input
    }
}