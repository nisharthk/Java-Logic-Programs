/*
 * NISHARTH K
 * 23 January 2018
 * Generic Calculator
 */
package com.generics;

public class GenericClass {
	// Production Code
	public static <N extends Number> double add(N a, N b) {
		double sum = 0;
		sum = a.doubleValue() + b.doubleValue();
		return sum;
	}

	public static <N extends Number> double sub(N a, N b) {
		double diff = 0;
		diff = a.doubleValue() - b.doubleValue();
		return diff;
	}

	public static <N extends Number> double product(N a, N b) {
		double product = 0;
		product = a.doubleValue() * b.doubleValue();
		return product;
	}

	public static <N extends Number> double division(N a, N b) throws ArithmeticException {
		double div = 0;
		div = a.doubleValue() / b.doubleValue();
		return div;
	}
}
