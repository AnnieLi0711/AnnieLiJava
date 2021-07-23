/**
 * 
 */
package com.ss.jb.dayfour;

/**
 * @author Li
 *
 */
// Implement a Singleton with double checked locking.
//Define a Singleton class
public class AssignmentsOneDFour {
	//Define private static variable of object type of the class
	private static volatile AssignmentsOneDFour instance=null;
	
	//Declare private constructor
	private  AssignmentsOneDFour() {};
	
	//Define public static method to instance the object
	public static AssignmentsOneDFour GetInstance()
	{
		//First check
		if(instance==null)
		{
			//Lock the code
			synchronized(AssignmentsOneDFour.class)
			{
				//Double check
				if(instance==null)
				{
					//Instance the object
				   instance=new AssignmentsOneDFour();
				}
			}
		}
		//Return the variable of the object type of the class
		return instance;
	}
	
	public static void main(String[] args) {
		AssignmentsOneDFour obj1=new AssignmentsOneDFour();
		System.out.println(obj1.GetInstance());
		AssignmentsOneDFour obj2=new AssignmentsOneDFour();
		System.out.println(obj2.GetInstance());
	}
}


