package CSCI3200;

import java.util.Scanner;

public class CalculateGradeAverage {
    double[][] Grades = new double[3][3];
    double[] student = new double[3];

    //need to add constructor

    public void ReadGrades() {
        Scanner UserInput = new Scanner(System.in);
        for(int row = 0; row < 3; row++) {
            for(int column = 0; column < 3; column++) {
                System.out.print("Enter value for [" + row + "][" + column + "]: ");
                double gradeValue = UserInput.nextDouble();
                if (gradeValue >= 0 && gradeValue <= 100){
                    Grades[row][column] = gradeValue;
                } else {
                    System.out.println("Please enter a value between 0 and 100");
                    UserInput.close();
                    return;
                }
            }
        }
        UserInput.close();
    }

    public double[] AvgGrades() {
        for(int row = 0; row < Grades.length; row++) {
            for(int column = 0; column < Grades[row].length; column++){
                student[row] = (Grades[row][column] + student[row]);
            }
            student[row] = (student[row] / 3);
        }

        for(int i = 0; i < 3; i++){
            System.out.println("The average for student at index "+ i + " = " + student[i]);
        }
        return student;
    }

    public static void main (String[] args) {
        CalculateGradeAverage run = new CalculateGradeAverage();

        run.ReadGrades();
        run.AvgGrades();
    }
}