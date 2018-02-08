/*
 * NISHARTH K
 * 11 January 2018
 * String Reverse Challenge
 */
package com.stringreverse;

public class StringReverseWithRecursion implements StringReverser {
	public String reverse(String toReverse) {
		if (toReverse.isEmpty())
			return toReverse;
		// Calling Function Recursively
		return reverse(toReverse.substring(1)) + toReverse.charAt(0);
	}

}
