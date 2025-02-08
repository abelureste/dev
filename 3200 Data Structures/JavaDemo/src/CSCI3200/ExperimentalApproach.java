package CSCI3200;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExperimentalApproach {
	// use this one as example for video
	public static int alg1(int n) {
		int steps = 0;
		for (int i = 0; i < n * n; i++)
			steps++;
		return steps;
	}

	public static void main(String[] args) {

		for (int i = 1; i < 1000; i++) {
			System.out.println(i + "," + alg1(i) + "," + ((int) (Math.log(i) / Math.log(2))) + "," + (i * i) + "," + (i * i * i));

		}

	}

}
