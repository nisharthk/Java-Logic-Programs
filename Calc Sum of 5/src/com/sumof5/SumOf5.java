package com.sumof5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class SumOf5 
{
	int sum = 0;

	public int calcSum5(ArrayList<Integer> arrlist) 
	{
		
		if(arrlist==null)
		{
			return 0;
		}
		
		int length=arrlist.size();
		if(length==0)
		{
			return 0;
		}
		else
		{
			for(int i =1;i<length;i++)
			{
				if(i%5==0)
				{
					sum=sum+arrlist.get(i);
				}
			}
		}
		return sum;
	}

	public static void main(String [] args)
		// testcases
	{
		SumOf5 test = new SumOf5();
		int expected;		
		
		System.out.println("*** Get the Sum of the values in the index of Multiples of 5 in an ArrayList ***");
		
		//test 1
		Integer[] tempArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		ArrayList<Integer> list1 = new ArrayList<Integer>(java.util.Arrays.asList(tempArr));
		expected=17;
		test.testcase(expected,list1);
		
		// test 2
		Integer[] tempArr2 = {};
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(tempArr2));
		expected = 0;
		test.testcase(expected, list2);

		// #test 3
		Integer[] tempArr3 = null;
		ArrayList<Integer> list3 = null;
		expected = 0;
		test.testcase(expected, list3);

		//test 4
		Integer[] tempArr4 = {2,5};
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(tempArr4));
		expected = 0;
		test.testcase(expected, list4);
	}
	
	private int testcase(int expected, ArrayList<Integer>list)
	{	
		SumOf5 getSum = new SumOf5();
		int sum;
		
		sum=getSum.calcSum5(list);
		if (expected == sum)
			System.out.println("Test Passes!");
		else
			System.out.println("Test Fails!!!!!!!");
		
		return sum;
	}

}