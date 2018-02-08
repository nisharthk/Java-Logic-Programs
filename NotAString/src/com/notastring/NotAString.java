/*
 * NISHARTH K
 * 10 January 2018
 * Not a String Challenge
 */
 package com.notastring;

import static java.lang.System.out;

import java.util.Scanner;

public class NotAString 
{
	public static String stringToAppendWith=null;
	public static String result=null;
	
	public static String productionCode(String str)
	{
		
		if(stringToAppendWith.contains("not"))
		{
			out.println(stringToAppendWith);
			result=stringToAppendWith;
		}
		else
		{	
			String not="not ";
			result=not+stringToAppendWith;
			out.println(result);
		}
		return stringToAppendWith;
	}
	
	public static void main(String[] args) 
	{
		out.println("To append the string 'Not' with another string and compare the strings");
		out.println("Enter a string to append with 'Not'");
		Scanner in = new Scanner(System.in);
		stringToAppendWith = in.nextLine();
		in.close();
		productionCode(stringToAppendWith);
		out.println("***String Comparison***");
		if (result.equalsIgnoreCase(stringToAppendWith))
			out.println("Strings are the same");
		else
			out.println("Strings are not the same");
		toTestCompare(result);
	}
	public static String toTestCompare(String result)
	{
		String expected1="going to happen";
		String expected2="a";
		String expected3="not interested";
		
		out.println("***Test Cases***");
		
		//case 1
		
		if(expected1.equals(stringToAppendWith))
			out.println("Test case for 'going to happen' passes");
		else 
			out.println("Test case for 'going to happen' fails!!!!!");
		
		//case 2
	
		if(expected2.equals(stringToAppendWith))
			out.println("Test case for 'a' passes");
		else 
			out.println("Test case for 'a' fails!!!!!");
		
		//case 3
		if(expected3.equals(result))
			out.println("Test case for 'interested' passes");
		else 
			out.println("Test case for 'interested' fails!!!!!");
		
		
		return result;
	}
}
