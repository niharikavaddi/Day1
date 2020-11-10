package com.main;

import java.util.Scanner;
import com.service.Ascii;

/**
 * 
 * Write a Java program to print the ascii value of a given character. 
 * 
 * @author Lakshmi Neeharika
 *
 */
public class AsciiMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any character");
		char value = scanner.next().charAt(0);
		Ascii ascii = new Ascii();
		System.out.println(ascii.asciiCheck(value));

	}

}
