/**
 * 
 */
package com.ss.jb.daytwo;

/**
 * @author Li
 *
 */
public class Assignmentsone {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		int i;
		Double sum=0.00;
		try 
	{
			
		
		for (i=0;i<args.length;i++)
		{
			sum=sum+Double.parseDouble(args[i]);
		}
		
		System.out.println("The total value of the numbers you entered is "+sum);
	}
       catch (NumberFormatException nex)
		{
    	   System.out.println("Hey, please enter numbers only");
		}
}
	
}