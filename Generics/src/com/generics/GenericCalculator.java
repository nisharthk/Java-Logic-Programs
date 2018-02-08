/*
 * NISHARTH K
 * 23 January 2018
 * Generic Calculator
 */
package com.generics;

import java.text.DecimalFormat;

public class GenericCalculator extends GenericClass {
	public static void main(String[] args) {
		// User Interface
		System.out.println("\n----- Java Generics Example -----\n");

		double sum = GenericCalculator.add(5.34, 174);
		System.out.println("Sum is: " + sum);

		double diff = GenericCalculator.sub(5.34, 174);
		System.out.println("\nDifference is: " + diff);

		double product = GenericCalculator.product(5.34, 174);
		System.out.println("\nProduct is: " + product);

		double div = GenericCalculator.division(10000, 2.534);
		DecimalFormat f = new DecimalFormat("###00.00");
		System.out.println("\nDivision is: " + f.format(div));

	}

}