package com.ss.jb.firstday;


/**
 * @author Li
 *
 */
public class Assignmentsone {

	/**
	 * @param args
	 */
	// Function to demonstrate printing pattern
    public static void printPatternfirst(int n)
    {
    	System.out.print("1)");
    	System.out.println();
        int i, j;
 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            //  inner loop to handle number of columns   
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("*");
            }
 
            // ending line after each row
            System.out.println();
        }
        System.out.print("---------");
        System.out.println(" ");
        System.out.println();
   }
    
    
    public static void printPatternsecond(int n)
    {
    	System.out.print("2)");
    	System.out.println();
    	System.out.print("----------");
    	System.out.println();
        int i, j;
 
        // outer loop to handle number of rows
        //  n in this case
        for(i=n; i>0; i--)
        {
 
            //  inner loop to handle number of columns  
            for(j=i; j>0; j--)
            {
                // printing stars
                System.out.print("*");
            }
 
            // ending line after each row
            System.out.println();
        }
   }
    
    
    public static void printPatternthird(int n)
    {   
    	System.out.println();
    	System.out.print("3)");  
    	System.out.println();
        // outer loop to handle number of rows
        //  n in this case
        for (int i=1; i<=n; i++)
        {
 
            // inner loop to handle number spaces
        	System.out.print("  ");
            for (int j=i; j<n; j++)
            {
                // printing spaces
                System.out.print(" ");
            }
  
            //  inner loop to handle number of columns
            for (int k=1; k<(i*2); k++)
            {
                // printing spaces
                System.out.print("*");
            }
            
            // ending line after each row
           System.out.println();
        }
        System.out.print("-----------");
        System.out.println(" ");
        System.out.println();
    }
    
    public static void printPatternforth(int n) 
    {
    	System.out.print("4)");
    	System.out.println();
    	System.out.print("------------");
    	System.out.println();
        
    	for (int i=n-1; i>=0; i--)
        {
 
            // inner loop to handle number spaces
        	System.out.print(" ");
            for (int j=i; j<n; j++)
            {
                // printing spaces
                System.out.print(" ");
            }
  
            //  inner loop to handle number of columns
            for (int k=1; k<(i*2+2); k++)
            {
                // printing spaces
                System.out.print("*");
            }
            
            // ending line after each row
           System.out.println();
        }

        
    }
 
    // Printing
    public static void main(String args[])
    {

        
        printPatternfirst(4);
        printPatternsecond(4);
        printPatternthird(4);
        printPatternforth(4);
    }

}

