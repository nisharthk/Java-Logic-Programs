/*
 * NISHARTH K
 * 16 January 2018
 * Near 100 or 200 Challenge
 */
package com.nearHundred;

import static java.lang.System.out;

import java.util.Scanner;

public class Near_Hundred_UI {

	public static void main(String[] args) {
		// User Interface
		out.println("*** Number Is Within 10 Of 100 Or 200 ***\n");
		int number;
		out.print("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		input.close();
		boolean bool;
		bool = Near_Hundred.nearHundred(number);
		out.println("\nResult Boolean of Near 100 or 200 is : " + bool);
	}
}
