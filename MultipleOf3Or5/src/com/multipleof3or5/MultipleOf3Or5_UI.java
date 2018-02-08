/*
 * NISHARTH K
 * 11 January 2018
 * Multiple of 3 or 5 Challenge
 */package com.multipleof3or5;

import static java.lang.System.out;

import java.util.Scanner;

public class MultipleOf3Or5_UI 
{
	//User Interface to get the input
	public static void main(String[] args) 
	{
		int n;
		boolean bOfMultipleOf3Or5;
		out.println("Multiple of 3 or 5 Challenge");
		out.println("Enter a Number");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		input.close();
		MultipleOf3Or5 obj=new MultipleOf3Or5();
		bOfMultipleOf3Or5=obj.multipleOf3Or5Only(n);
		out.println("The Boolean of Multiple of 3 and 5 i.e 'divisible by 3 or divisible by 5, \nbut not divisible by both 3 and 5' is : ");
		out.println(bOfMultipleOf3Or5);
	}
}

