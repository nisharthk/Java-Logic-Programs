/*
 * NISHARTH K
 * 11 January 2018
 * IsOne Or Sum 10 Challenge
 */
public class IsOneOrSum10 
{

	// Production Code Logic
	public static boolean isOneOrSum10(int a, int b) 
	{
		if(a == 10 || b == 10 || a+b == 10) 
		{
			return true;
		} else 
		{
			return false;
		}
	}

	// Test cases of Is One or Sum 10
	public static void main(String args[]) {
		System.out.println("*** Test Cases ***");

		int a, b;
		boolean expected, actual;

		// test case: 1
		// step 1: define variables for test case
		a = 9;
		b = 10;
		expected = true;

		// step 2: pass input into the function and get the result
		actual = isOneOrSum10(a, b);
		if (expected == actual) 
		{
			System.out.println("Test Passes for a= 9 and b= 10");
		} else {
			System.out.println("Test FAILS for a= 9 and b= 10 !!!");
		}

		// test case: 2
		// step 1: Define variables for test case
		a = 9;
		b = 9;
		expected = false;

		// step 2: Pass input values through parameter of the function to get the result
		actual = isOneOrSum10(a, b);
		if (expected == actual) {
			System.out.println("Test Passes for a= 9 and b= 9");
		} else {
			System.out.println("Test FAILS for a= 9 and b=9 !!!");
		}

		// test case: 3
		// step 1: Define variables for test case
		a = 1;
		b = 9;
		expected = true;

		// step 2: Pass input values through parameter of the function to get the result
		actual = isOneOrSum10(a, b);
		if (expected == actual) 
		{
			System.out.println("Test Passes for a= 1 and b= 9");
		} 
		else 
		{
			System.out.println("Test FAILS for a= 1 and b= 9 !!!");
		}
		

	}
}
