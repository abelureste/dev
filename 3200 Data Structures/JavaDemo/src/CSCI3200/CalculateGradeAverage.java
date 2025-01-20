package CSCI3200;

import java.util.Scanner;

public class CalculateGradeAverage {
    public static void main (String[] args) {
        double[][] Grades = new double[3][3];
        
        Scanner UserInput = new Scanner(System.in);
        for(int row = 0; row < 3; row++) {
            for(int column = 0; column < 3; column++) {
                System.out.print("Enter value for [" + row + "][" + column + "]: ");
                Grades[row][column] = UserInput.nextDouble();
            }
        }
        UserInput.close();

        double[] student = new double[3];

        for(int row = 0; row < Grades.length; row++) {
            for(int column = 0; column < Grades[row].length; column++){
                student[row] = (Grades[row][column] + student[row]);
            }
            student[row] = (student[row] / 3);
        }

        for(int i = 0; i < 3; i++){
            System.out.println("The average for student at index "+ i + " = " + student[i]);
        }
    }

    /* 
    public double[] ReadGrades() {

        return;
    }

    public double[] AvgGrades() {
        return;
    }
    */
}