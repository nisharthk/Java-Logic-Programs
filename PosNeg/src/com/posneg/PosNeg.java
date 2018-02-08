/*
 * NISHARTH K
 * 09 January 2018
 * PosNeg Challenge
 */
 package com.posneg;
import static java.lang.System.out;
class PosNeg
{
	public boolean posNeg(int a, int b, boolean negative) 
	{
		//Production Statement
		if (negative==true) 
			return (a < 0 && b < 0); //if both a and b are negative and negative is true
		
		else 
			return ((a < 0 && b > 0) || (a > 0 && b < 0)); //if one of a and b is negative and negative is false
	}
	
	public static void main(String[] args)
	{
		out.println("Test case for PosNeg Challenge");
		int a,b;
		boolean negative,expectedresult,actualresult;
		
		//test case 1
		a=1;
		b=-1;
		negative=false;
		expectedresult=true;
		actualresult=true;
		PosNeg obj = new PosNeg();
		obj.posNeg(1, -1, false);
		if (obj.posNeg(1, -1, false) == expectedresult) 
		{
			System.out.println("PosNeg of 1,-1,false is true -- test passes");
		} 
		else 
		{
			System.out.println("Test FAILS!");
		}
		
		
		//test case 2
		a=-1;
		b=1;
		negative=false;
		expectedresult=true;
		actualresult=true;	
		obj.posNeg(-1, 1, false);
		if (obj.posNeg(-1, 1, false) == expectedresult) 
		{
			System.out.println("PosNeg of -1,1,false is true -- test passes");
		} 
		else 
		{
			System.out.println("Test FAILS!");
		}
				
				
		//test case 3
		a=1;
		b=1;
		negative=false;
		expectedresult=false;
		actualresult=false;	
		obj.posNeg(1, 1, false);
		if (obj.posNeg(1, 1, false) == expectedresult) 
		{
			System.out.println("PosNeg of 1,1,false is false -- test passes");
		} 
		else 
		{
			System.out.println("Test FAILS!");
		}		
				
				
		//test case 4
		a=1;
		b=1;
		negative=false;
		expectedresult=false;
		actualresult=false;
		obj.posNeg(-1, -1, false);
		if (obj.posNeg(-1, -1, false) == expectedresult) 
		{
			System.out.println("PosNeg of -1,-1,false is false -- test passes");
		} 
		else 
		{
			System.out.println("Test FAILS!");
		}		
				
				
		//test case 5
		a=1;
		b=-1;
		negative=true;
		expectedresult=false;
		actualresult=false;	
		obj.posNeg(1, -1, true);
		if (obj.posNeg(1, -1, true) == expectedresult) 
		{
			System.out.println("PosNeg of 1,-1,true is false -- test passes");
		} 
		else 
		{
			System.out.println("Test FAILS!");
		}		
				
		//test case 6
		a=-1;
		b=1;
		negative=true;
		expectedresult=false;
		actualresult=false;	
		obj.posNeg(-1, 1, true);
		if (obj.posNeg(-1, 1, true) == expectedresult) 
		{
			System.out.println("PosNeg of -1,1,true is false -- test passes");
		} 
		else 
		{
			System.out.println("Test FAILS!");
		}		
				
		//test case 7
		a=1;
		b=1;
		negative=true;
		expectedresult=false;
		actualresult=false;	
		obj.posNeg(1, 1, true);
		if (obj.posNeg(1, 1, true) == expectedresult) 
		{
			System.out.println("PosNeg of 1,1,true is false -- test passes");
		} 
		else 
		{
			System.out.println("Test FAILS!");
		}		
				
		//test case 8
		a=-1;
		b=-1;
		negative=true;
		expectedresult=true;
		actualresult=true;
		obj.posNeg(-1, -1, true);
		if (obj.posNeg(-1, -1, true) == expectedresult) 
		{
			System.out.println("PosNeg of -1,-1,true is true -- test passes");
		} 
		else 
		{
			System.out.println("Test FAILS!");
		}
	}
}