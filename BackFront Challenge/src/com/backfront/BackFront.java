/*
 *Nisharth K
 *13-01-2018
 *Back Front Challenge 
 */
package com.backfront;

import static java.lang.System.out;

public class BackFront {
	// Production code
	public static String backFront(String n) {
		int length = n.length();
		
		// If length of string is equal to 1
		if(length==1)
		{
			return n;
		}
		// If length of string is less than 4
		else if (length < 4) {
			String firstChar = n.substring(0, 1);
			String lastChar = n.substring(length - 1, length);
			n = lastChar + n.substring(1, length - 1) + firstChar;
			return n;
		} 
		// If length of the string is greater than 4
		else if (length >= 4) {
			// Reversing first two characters of a string

			String firstTwoChar = n.substring(0, 2);
			String firstChar = n.substring(0, 1);
			String secondChar = n.substring(1, 2);
			firstTwoChar = secondChar + firstChar;

			// Reversing last two characters of a string

			String lastTwoChar = n.substring(length - 2);
			String lastChar = n.substring(length - 2, length - 1);
			String lastbeforeChar = n.substring(length - 1, length);
			lastTwoChar = lastbeforeChar + lastChar;

			// concatenating with middle letters of a string

			String middleLetters = n.substring(2, length - 2);
			n = firstTwoChar + middleLetters + lastTwoChar;

			return n;
		} else
			return n;
	}

	public static void main(String[] args) {
		out.println("*** Test Cases *** \n");
		String expected, actual;
		
		// case1:
		expected = "hello world";
		out.println("Expected String: " + expected);
		actual = BackFront.backFront("ehllo wordl");
		out.println("Actual String: " + actual);
		if (actual.equals(expected))
			out.println("----------------> Test passes for 'hello world' \n");
		else
			out.println("----------------> Test fails for 'hello world' \n");

		// case2:
		expected = "tac";
		out.println("Expected String: " + expected);
		actual = BackFront.backFront("cat");
		out.println("Actual String: " + actual);
		if (actual.equals(expected))
			out.println("----------------> Test passes for 'cat' \n");
		else
			out.println("----------------> Test fails for 'cat' \n");

		// case3:
		expected = "ball";
		out.println("Expected String: " + expected);
		actual = BackFront.backFront("abll");
		out.println("Actual String: " + actual);
		if (actual.equals(expected))
			out.println("----------------> Test passes for 'ball' \n");
		else
			out.println("----------------> Test fails for 'ball' \n");

		// case4:
		expected = "apple";
		out.println("Expected String: " + expected);
		actual = BackFront.backFront("papel");
		out.println("Actual String: " + actual);
		if (actual.equals(expected))
			out.println("----------------> Test passes for 'apple' \n");
		else
			out.println("----------------> Test fails for 'apple' \n");

		// case5:
		expected = "nisharth";
		out.println("Expected String: " + expected);
		actual = BackFront.backFront("insharht");
		out.println("Actual String: " + actual);
		if (actual.equals(expected))
			out.println("----------------> Test passes for 'nisharth' \n");
		else
			out.println("----------------> Test fails for 'nisharth' \n");
	}

}
