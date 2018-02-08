/*
 * NISHARTH K
 * 09 January 2018
 * PosNeg Challenge
 */
 
package com.posneg;
import static java.lang.System.out;

import java.util.Scanner;

class PosNegUI
{
	
	public static void main( String args[])
	{
		String c;
		out.println("PosNeg Challenge");
		out.println("Please enter two integer: ");
		Scanner in= new Scanner(System.in);
		boolean negative;
		int a=in.nextInt();
		int b=in.nextInt();
		out.println("Please enter the value of boolean: ");
		c=in.next();
		in.close();
		if(c=="true") {
			negative=true ;
			}
		else {
			negative=false ;
		}
		PosNeg obj=new PosNeg();
		boolean actualresult=obj.posNeg(a,b,negative);
		System.out.println("The PosNeg of a and b is " +actualresult);
	}
	
}