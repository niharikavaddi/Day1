package com.main;

import java.util.Scanner;

import com.service.ArithmeticOperations;

/**
 * 
 * Write a Java program to print the sum (addition), multiply, subtract, divide
 * and remainder of two numbers.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class ArithmeticOperationsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Enter any operator:");
		String operator = scanner.next();
		ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
		if (operator.equals("+"))
			System.out.println(arithmeticOperations.add(a, b));
		else if (operator.equals("-"))
			System.out.println(arithmeticOperations.sub(a, b));
		else if (operator.equals("*"))
			System.out.println(arithmeticOperations.mul(a, b));
		else if (operator.equals("/"))
			System.out.println(arithmeticOperations.div(a, b));

	}

}
