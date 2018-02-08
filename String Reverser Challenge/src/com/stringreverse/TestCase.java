/*
 * NISHARTH K
 * 11 January 2018
 * String Reverse Challenge
 */

package com.stringreverse;

import static java.lang.System.out;

public class TestCase {

	public static void main(String[] args) {
		StringReverseWithoutRecursion withoutRecursion = new StringReverseWithoutRecursion();
		StringReverseWithRecursion withRecursion = new StringReverseWithRecursion();
		String expected, actual;
		out.println("*** String Reverser test cases ***");

		// unit test case 1
		expected = "nisharth";
		actual = withoutRecursion.reverse("htrahsin");
		out.println("Given String: " + expected);
		out.println("Reversed String: " + actual);
		if (actual.equals(expected))
			out.println("Strings Match for 'nisharth' -- test passes");
		else
			out.println("String DO NOT MATCH for 'nisharth' -- test fails");

		// unit test case 2
		expected = "anil";
		actual = withRecursion.reverse("lina");
		out.println("Given String: " + expected);
		out.println("Reversed String: " + actual);
		if (actual.equals(expected))
			out.println("Strings Match for 'anil' -- test passes");
		else
			out.println("String DO NOT MATCH for 'anil' -- test fails");

		// unit test case 3
		expected = "james";
		actual = withoutRecursion.reverse("semaj");
		out.println("Given String: " + expected);
		out.println("Reversed String: " + actual);
		if (actual.equals(expected))
			out.println("Strings Match for 'james' -- test passes");
		else
			out.println("String DO NOT MATCH for 'james' -- test fails");

		// unit test case 4
		expected = "janani";
		actual = withRecursion.reverse("inanaj");
		out.println("Given String: " + expected);
		out.println("Reversed String: " + actual);
		if (actual.equals(expected))
			out.println("Strings Match for 'janani' -- test passes");
		else
			out.println("String DO NOT MATCH for 'janani' -- test fails");

		// unit test case 5
		expected = "nandiny";
		actual = withoutRecursion.reverse("ynidnan");
		out.println("Given String: " + expected);
		out.println("Reversed String: " + actual);
		if (actual.equals(expected))
			out.println("Strings Match for 'nandiny' -- test passes");
		else
			out.println("String DO NOT MATCH for 'nandiny' -- test fails");
	}

}
