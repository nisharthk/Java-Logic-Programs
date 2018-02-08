/*
 *Nisharth K
 *13-01-2018
 *Back Front Challenge 
 */
package com.backfront;

import static java.lang.System.out;

import java.util.Scanner;

public class BackFrontUI {
	// User Interface
	public static void main(String[] args) {
		out.println("*** Back Front Challenge ***");
		out.println("Enter a String: ");
		String toBackFront = null;
		Scanner in = new Scanner(System.in);
		toBackFront = in.nextLine();
		in.close();
		toBackFront = BackFront.backFront(toBackFront); // Method Calling
		out.println("BackFront String is: " + toBackFront);
	}
}
