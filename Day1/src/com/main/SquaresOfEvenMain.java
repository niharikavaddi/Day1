package com.main;

import java.util.Scanner;

import com.service.SquaresOfEven;

/**
 * Write a program to read a number, calculate the sum of squares of even digits
 * (values) present in the given number.
 * 
 * Create a class UserMainCode with a static method sumOfSquaresOfEvenDigits
 * which accepts a positive integer. The return type (integer) should be the sum
 * of squares of the even digits.
 * 
 * Create a class Main which would get the input as a positive integer and call
 * the static method sumOfSquaresOfEvenDigits present in the UserMainCode.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class SquaresOfEvenMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scanner.nextInt();
		System.out.println(SquaresOfEven.sumOfSquaresOfEvenDigits(number));
	}

}
