/*
 * NISHARTH K
 * 11 January 2018
 * Multiple of 3 Or 5 Challenge
 */
package com.multipleof3or5;

import static java.lang.System.out;

public class MultipleOf3Or5 
{
	//Production Logic
	public boolean multipleOf3Or5Only(int n) 
	{
		if ((n % 3 == 0 ^ n % 5 == 0)) //divisible by 3 or 5 but not by both
		{
			return true;
		} 
		else
			return false;
	}
	
	//test cases
	public static void main(String[] args) 
	{
		out.println("*** Test case for Multiple of 3 or 5 Challenge ***");
		boolean expectedresult;
		boolean actualresult;

		// test case 1
		expectedresult = true;
		MultipleOf3Or5 obj=new MultipleOf3Or5();
		actualresult = obj.multipleOf3Or5Only(25);
		if (actualresult == expectedresult) {
			System.out.println("Multiple of 3 or 5 for 25 is true -- test passes");
		} else {
			System.out.println("Multiple of 3 or 5 for 25 is false --Test FAILS!");
		}

		// test case 2
		expectedresult = false;
		actualresult = obj.multipleOf3Or5Only(26);
		if (obj.multipleOf3Or5Only(26) == expectedresult) {
			System.out.println("Multiple of 3 or 5 for 26 is false -- test passes");
		} else {
			System.out.println("Multiple of 3 or 5 for 26 is true --Test FAILS!");
		}

		// test case 3
		expectedresult = false;
		actualresult = obj.multipleOf3Or5Only(15);
		if (obj.multipleOf3Or5Only(15) == expectedresult) {
		System.out.println("Multiple of 3 or 5 for 15 is false --Test passes!");
		} else {
			System.out.println("Multiple of 3 or 5 for 15 is true -- test fails");
		}

		// test case 4
		expectedresult = true;		
		actualresult = obj.multipleOf3Or5Only(6);
		if (obj.multipleOf3Or5Only(6) == expectedresult) {
			System.out.println("Multiple of 3 or 5 for 6 is true -- test passes");
		} else {
			System.out.println("Multiple of 3 or 5 for 6 is false --Test FAILS!");
		}

		// test case 5
		expectedresult = true;
		actualresult = obj.multipleOf3Or5Only(10);
		if (obj.multipleOf3Or5Only(10) == expectedresult) {
			System.out.println("Multiple of 3 or 5 for 10 is true -- test passes");
		} else {
			System.out.println("Multiple of 3 or 5 for 10 is false --Test FAILS!");
		}

		// test case 6
		expectedresult = true;		
		actualresult = obj.multipleOf3Or5Only(12);
		if (obj.multipleOf3Or5Only(12) == expectedresult) {
			System.out.println("Multiple of 3 or 5 for 12 is true -- test passes");
		} else {
			System.out.println("Multiple of 3 or 5 for 12 is false --Test FAILS!");
		}

		// test case 7
		expectedresult = false;
		actualresult = obj.multipleOf3Or5Only(30);
		if (obj.multipleOf3Or5Only(30) == expectedresult) {
			System.out.println("Multiple of 3 or 5 for 30 is false --Test passes!");
		} else {
			System.out.println("Multiple of 3 or 5 for 30 is true -- test fails");
		}

		// test case 8
		expectedresult = false;
		actualresult = obj.multipleOf3Or5Only(45);
		if (obj.multipleOf3Or5Only(45) == expectedresult) {
			System.out.println("Multiple of 3 or 5 for 45 is false --Test passes!");
		} else {
			System.out.println("Multiple of 3 or 5 for 45 is true -- test fails");
		}

		// test case 9
		expectedresult = true;
		actualresult = obj.multipleOf3Or5Only(18);
		if (obj.multipleOf3Or5Only(18) == expectedresult) {
			System.out.println("Multiple of 3 or 5 for 18 is true -- test passes");
		} else {
			System.out.println("Multiple of 3 or 5 for 18 is false --Test FAILS!");
		}

		// test case 10
		expectedresult = false;
		actualresult = obj.multipleOf3Or5Only(90);
		if (obj.multipleOf3Or5Only(90) == expectedresult) {
			System.out.println("Multiple of 3 or 5 for 90 is false --Test passes!");
		} else {
			System.out.println("Multiple of 3 or 5 for 90 is true -- test fails");
		}

	}
}
