package com.ss.jb.firstday;
import java.util.*;

public class Assignmentstwo {

	public static void main(String[] args) {
		Random rand = new Random();
		int upperband=99;
		//generate random value from 1-100
		int random_number=rand.nextInt(upperband)+1;
		//System.out.println(random_number);
        int i;

        
        for (i=0;i<5;i++)
        {
        	Scanner sc= new Scanner(System.in);   
            System.out.print("Please guess a Number between 1-100: ");  
            int n= sc.nextInt();
        	if ((random_number-10)<n && n<(random_number+10)) 
        	{
        	   System.out.println("Good guess,the number is: "+random_number);
        	   break;
        	}
        }
        
        if (i==5)
        {
        	System.out.println("Sorry,the number is: "+random_number);
        }

	}

}