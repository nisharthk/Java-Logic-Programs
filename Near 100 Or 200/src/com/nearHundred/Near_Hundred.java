/*
 * NISHARTH K
 * 16 January 2018
 * Near 100 or 200 Challenge
 */
package com.nearHundred;

import static java.lang.System.out;

public class Near_Hundred {

	// Production Code
	public static boolean nearHundred(int a) {
		if ((Math.abs(a) > 89 && Math.abs(a) < 111) || (Math.abs(a) > 189 && Math.abs(a) < 211)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		out.println("*** Test Cases for Near Hundred Challenge *** \n");
		boolean actual, expected;

		// testcase 1
		expected = true;
		actual = Near_Hundred.nearHundred(93);
		if (actual == expected)
			out.println("Test Passes for 93 --> true \n");
		else
			out.println("Test Fails for 93 --> false \n");

		// testcase 2
		expected = true;
		actual = Near_Hundred.nearHundred(90);
		if (actual == expected)
			out.println("Test Passes for 90 --> true \n");
		else
			out.println("Test Fails for 90 --> false \n");

		// testcase 3
		expected = false;
		actual = Near_Hundred.nearHundred(89);
		if (actual == expected)
			out.println("Test Passes for 89 --> false \n");
		else
			out.println("Test fails for 89 --> true \n");

		// testcase 4
		expected = true;
		actual = Near_Hundred.nearHundred(110);
		if (actual == expected)
			out.println("Test Passes for 110 --> true \n");
		else
			out.println("Test Fails for 110 --> false \n");

		// testcase 5
		expected = true;
		actual = Near_Hundred.nearHundred(209);
		if (actual == expected)
			out.println("Test Passes for 209 --> true \n");
		else
			out.println("Test Fails for 209 --> false \n");

		// testcase 6
		expected = false;
		actual = Near_Hundred.nearHundred(250);
		if (actual == expected)
			out.println("Test Passes for 250 --> false \n");
		else
			out.println("Test Fails for 250 --> true \n");

		// testcase 7
		expected = false;
		actual = Near_Hundred.nearHundred(211);
		if (actual == expected)
			out.println("Test Passes for 211 --> false \n");
		else
			out.println("Test fails for 211 --> true \n");

		// testcase 8
		expected = true;
		actual = Near_Hundred.nearHundred(-210);
		if (actual == expected)
			out.println("Test Passes for -210 --> true \n");
		else
			out.println("Test Fails for -210 --> false \n");
	}

}