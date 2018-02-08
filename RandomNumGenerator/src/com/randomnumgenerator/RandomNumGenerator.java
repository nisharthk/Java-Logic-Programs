package com.randomnumgenerator;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumGenerator {
	private static int MIN = 0;
	private static int MAX = 100;
	private static int SIZE = 10000000;

	public ArrayList<Integer> generate(ArrayList<Integer> list) {
		for (int i = 1; i <= SIZE; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(MIN, MAX);
			list.add(randomNum);
		}
		return list;

	}

	public static void main(String[] args) {

		RandomNumGenerator obj = new RandomNumGenerator();
		out.println("*** Test Cases for Random Number Generator ***");
		// Test Cases

		// if collection is within range 0-100
		int value = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		obj.generate(list);
		boolean isPassing = false;
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			value = it.next();
			if (value > 0 && value <= 100)
				isPassing = true;
			else
				isPassing = false;
		}
		if (isPassing)
			out.println("\nRange test passes \n");
		else
			out.println("\nRange test fails : Number which produced the fail case --> " + value + "\n");

		// if size of collection is 1000000
		if (list.size() == SIZE) {
			out.println("Arraylist Size Test passes \n");
		} else {
			out.println("Arraylist Size Test fails. Actual Size is : " + SIZE);
		}
	}

}

/*
 * James Do not Read This. It's Bad Code!
 * 
 * // both cases fails do { SIZE = SIZE + 1; value = value + 100;
 * out.println("Size is: "+SIZE+ " Value is: "+value); if (list.size() == SIZE
 * && (value > MIN && value > MAX)) {
 * out.println("Range test and size test passes \n"); } else { out.
 * println("Test passes  \nRange test fails : Number which produced the fail case --> "
 * + value); out.println("Size test fails: Actual Size is :" + SIZE);
 * out.println(""); } } while (SIZE == list.size());
 * 
 * // one of tests fail -- range passes and size fails do { value=value-100;
 * out.println("Size is: "+SIZE+ " Value is: "+value); if (list.size() != SIZE)
 * { out.println("Test passes \nsize test fails! Actual Size is : " + SIZE);
 * out.println("Range test passes \n"); }
 * 
 * } while (SIZE == list.size());
 * 
 * // one of tests fail -- range fails and size passes do { value=value+100;
 * SIZE=SIZE-1; out.println("Size is: "+SIZE+ " Value is: "+value); if ((value >
 * MIN && value < MAX) == false) { out.
 * println("Test passes \nRange test fails : Number which produced the fail case --> "
 * + value); out.println("Size test passes"); } } while (value > MIN && value <
 * MAX);
 */
