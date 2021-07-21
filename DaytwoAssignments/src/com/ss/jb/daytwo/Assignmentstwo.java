/**
 * 
 */
package com.ss.jb.daytwo;

/**
 * @author Li
 *
 */
public class Assignmentstwo {

	/**
	 * @param args
	 */
	public void findMaxNumber() {
		// create a 2d array
        int[][] a = 
        {
            {1, 2, 3,87}, 
            {4, 5, 6, -9,-129,9999}, 
            {7,-98,54,6578}, 
        };
        int m=a[0][0];
        int r=0;
        int c=0;
        //outer loop for the row of the array
        for (int i=0;i<a.length;i++)
        {
        	//inner loop for the column of the array
        	for (int j=0;j<a[i].length;j++)
        	{
        		//if the value of the array item is bigger,then replace it
        		if (a[i][j]>m)
        		{
        			m=a[i][j];
        			r=i;
        			c=j;
        		}
        	}
        }
        
        //Print out the results
        System.out.println("The max number in the array a is "+m+ ", It's in a["+r+"]["+c+"]");

	}

public static void main(String[] args) 
 {
	//Create a new object for class Assignmentstwo
	Assignmentstwo assignment=new Assignmentstwo();
	assignment.findMaxNumber();
 }	 
}
