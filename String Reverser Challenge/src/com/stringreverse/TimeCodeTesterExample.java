/*
 * NISHARTH K
 * 11 January 2018
 * String Reverser Challenge
 */
package com.stringreverse;

import static java.lang.System.out;

public class TimeCodeTesterExample {
	private static final int NUM_ITERATIONS = 100000;

	public static void runTimingTest(StringReverser stringReverser) {
		// mark what time it is before beginning the operation
		long start = System.currentTimeMillis();

		String result = "";

		// start doing the operations NUM_ITERATION times.
		for (int i = 0; i < NUM_ITERATIONS; i++) {
			result = stringReverser.reverse("Nisharth");
		}

		// get the stop time now that the operation is complete
		long stop = System.currentTimeMillis();

		// the difference between stop and start is the total run time of the operations
		long totalRunTime = stop - start;

		out.println("Total run time of the operation is " + totalRunTime + "ms");

	}

	public static void main(String args[]) {
		out.println("*** Computation of Time Difference for String Reversal ***");

		runTimingTest(new StringReverseWithoutRecursion());
		runTimingTest(new StringReverseWithRecursion());
		runTimingTest(new StringReverseWithoutRecursion());
		runTimingTest(new StringReverseWithRecursion());
		runTimingTest(new StringReverseWithoutRecursion());
		runTimingTest(new StringReverseWithRecursion());
		runTimingTest(new StringReverseWithoutRecursion());
		runTimingTest(new StringReverseWithRecursion());
		runTimingTest(new StringReverseWithoutRecursion());
		runTimingTest(new StringReverseWithRecursion());
		runTimingTest(new StringReverseWithoutRecursion());
		runTimingTest(new StringReverseWithRecursion());

	}
}
