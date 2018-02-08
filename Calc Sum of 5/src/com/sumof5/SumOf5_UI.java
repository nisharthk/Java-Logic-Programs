package com.sumof5;

import static java.lang.System.out;

import static java.lang.System.in;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOf5_UI {
	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		SumOf5 test = new SumOf5();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no of values");
		int userArr = scn.nextInt();
		System.out.println("Enter the values:");
		for (int i = 0; i < userArr; i++) {
			int userInput = scn.nextInt();
			list.add(userInput);
		}
		scn.close();
		int actualsum =test.calcSum5(list);
		System.out.println("The sum of all 5th element is" + actualsum);
		//System.out.println("The sum of all 5th element is" + randsum);

	}
}
