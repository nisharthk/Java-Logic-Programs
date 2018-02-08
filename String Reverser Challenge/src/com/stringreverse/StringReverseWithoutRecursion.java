/*
 * NISHARTH K
 * 11 January 2018
 * String Reverser Challenge
 */
package com.stringreverse;

public class StringReverseWithoutRecursion implements StringReverser {
	public String reverse(String s) {
		StringBuilder sB = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; --i)
			sB.append(s.charAt(i));
		return sB.toString();
	}
}
