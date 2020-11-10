package com.main;

import java.util.Scanner;
import com.service.OddSum;

/**
 * Write a program to read a number and calculate the sum of odd digits (values)
 * present in the given number. Create a class with a static method checkSum
 * which accepts a positive integer. The return type should be 1 if the sum is
 * odd. In case the sum is even return -1 as output. Create a class Main which
 * would get the input as a positive integer and call the static method checkSum
 * present in the UserMainCode.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class OddSumMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scanner.nextInt();
		System.out.println(OddSum.CheckSum(number));

	}

}
