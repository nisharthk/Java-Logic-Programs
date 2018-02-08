/*
 * NISHARTH K
 * 11 January 2018
 *  IsOne Or Sum 10 Challenge
 */
import java.util.Scanner;

public class IsOneorSum10_UI {

	// Gets the input from the user and computes it by calling a method in another class
	public static void main(String args[]) {
		System.out.println("*** Is One or Sum 10 Challenge ***");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter two integers:  ");
		int a = in.nextInt();
		int b = in.nextInt();
		boolean result = IsOneOrSum10.isOneOrSum10(a, b); //method calling
		
		System.out.println("The result of " + a + " and " + b + " is  " + result);
		
		
		
	}
}
