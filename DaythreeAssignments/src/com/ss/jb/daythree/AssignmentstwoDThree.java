/**
 * 
 */
package com.ss.jb.daythree;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.Paths;

/**
 * @author Li
 *
 */
public class AssignmentstwoDThree {

	/**
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {
		AssignmentstwoDThree obj=new AssignmentstwoDThree();
		obj.appendToExistingFile();
	}
	
	public void appendToExistingFile()
	
	throws IOException
	{   //Define the text want to append with a line separator at the beginning
		String s = System.lineSeparator() + "This is what I want to append";
		//Write the text in new line in the given exiting file
		Files.write(Paths.get("C:\\Users\\Li\\eclipse-workspace\\DaythreeAssignments\\Notes.txt"), s.getBytes(), StandardOpenOption.APPEND);
	}
}
