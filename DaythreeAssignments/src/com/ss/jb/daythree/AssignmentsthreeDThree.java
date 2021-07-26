/**
 * 
 */
package com.ss.jb.daythree;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Li
 *
 */
//Write a Java program that counts the number of times a particular character, such as 'e', appears in a file. The character can be specified at the command line.
public class AssignmentsthreeDThree {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		
		char a;
		
       try {
	       a=args[0].charAt(0);
       }
       catch(ArrayIndexOutOfBoundsException obe)
       {
    	   System.out.println("Please provide a character");
    	   return;
       }
		AssignmentsthreeDThree obj=new AssignmentsthreeDThree();
		obj.countNumberofTimes(a);


	}
	
	public void countNumberofTimes(char a) 
	{
		//Create a file object
		File f=new File("C:\\Users\\Li\\git\\AnnieLiJava\\DaythreeAssignments\\Notes.txt");
		
		//Create file reader object
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader(f);
		
		
		//Create buffered reader object
		    br=new BufferedReader(fr);
		}
		catch (FileNotFoundException e) {
			System.out.println("Please provide a file which has content");
			return;
		}
		
		int c = 0;
		int num=0;
		//read the character in the file and compare it to the input character
		try {
			while((c = br.read()) != -1)
			  {
				    
			        char character = (char) c;
			        if (a==character)
			        {
			        	num++;
			        }
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Total number of times the character appears in the file is "+ num);
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
