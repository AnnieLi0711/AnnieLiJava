/**
 * 
 */
package com.ss.jb.daythree;
import java.io.File;


/**
 * @author Li
 *
 */
//Write a Java program to get a list of all file/directory names (including in subdirectories) under a given directory.
public class AssignmentsoneDThree {

	/**
	 * @param args
	 */
	public void printFileNames(File[] a,int index) {
		
        //when it reaches the end,exit
        if (index==a.length)
        {
        	return;
        }
        
        
        // Print the file names if it is a file
        if(a[index].isFile())
        {
        	System.out.println(a[index].getName());
        }
            
		//If it is a directory,call the method to do it again
        else if(a[index].isDirectory())
        {   
        	//Print out the directory name
        	System.out.println(a[index].getName());
        	//And recursion for the sub-directory
        	
        	printFileNames(a[index].listFiles(),0);
        }
         
        printFileNames(a,++index); 
        
	}    

		
    public static void main(String[] args)
    {
        // Provide path for directory  
        String directoryName = "C:\\Users\\Li\\Desktop\\Test";
                  
        // Create File object
        File file1 = new File(directoryName);
           
        if(file1.exists() && file1.isDirectory())
        {
            // Get the names for files and sub-directories in the path and store it in array a 
            File a[] = file1.listFiles();
            //Print out header text  
            System.out.println("Files/Directories in the directory : " + file1 + "are as below:");
   
          AssignmentsoneDThree obj= new AssignmentsoneDThree();
          obj.printFileNames(a, 0);
       } 
        //When the file path is not existing,print out a message to user
        else 
        {
        	System.out.println("Please provide a valid path");
        }
    }

}