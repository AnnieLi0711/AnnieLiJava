package com.ss.jb.firstday;
import java.util.*;

//User is asked to guess a number 1-100. (Program chooses randomly.)
//If the guess is within 10 of the correct answer, plus or minus, output the correct answer and exit. (If the answer is 63, user must guess 53-73.)
//If the number is not within 10 of the correct answer, ask the user to keep guessing.
//If the user does not succeed within 5 attempts, display, "Sorry," along with the answer and exit.
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