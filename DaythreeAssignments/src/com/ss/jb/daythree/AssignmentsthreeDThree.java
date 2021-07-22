/**
 * 
 */
package com.ss.jb.daythree;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Li
 *
 */
public class AssignmentsthreeDThree {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		
		char a=args[0].charAt(0);
		AssignmentsthreeDThree obj=new AssignmentsthreeDThree();
		try {
			obj.countNumberofTimes(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	public void countNumberofTimes(char a) throws IOException
	{
		//Create a file object
		File f=new File("C:\\Users\\Li\\eclipse-workspace\\DaythreeAssignments\\Notes.txt");
		
		//Create file reader object
		FileReader fr=new FileReader(f);
		
		//Create buffered reader object
		BufferedReader br=new BufferedReader(fr);
		
		int c = 0;
		int num=0;
		//read the character in the file and compare it to the input character
		while((c = br.read()) != -1)
	      {
			    
	            char character = (char) c;
	            if (a==character)
	            {
	            	num++;
	            }
	      }
		
		System.out.println("Total number of times the character appears in the file is "+ num);
		br.close();

	}

}
