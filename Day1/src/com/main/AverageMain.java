package com.main;

import com.service.Average;
import java.util.Scanner;

/**
 *
 * Write a Java program that takes three numbers as input to calculate and print
 * the average of the numbers.
 *
 * @author Lakshmi Neeharika
 *
 */
public class AverageMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Enter values:");
		float[] values = new float[size];
		Average average = new Average();
		for (int i = 0; i < size; i++) {
			values[i] = scanner.nextFloat();
		}
		System.out.println(average.calculate(values, size));

	}

}
