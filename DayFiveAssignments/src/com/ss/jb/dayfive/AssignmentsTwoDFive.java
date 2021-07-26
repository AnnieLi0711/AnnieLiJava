/**
 * 
 */
package com.ss.jb.dayfive;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author Li
 *
 */
public class AssignmentsTwoDFive {

	/**
	 * 
	 * @param args
	 */
	//Create a method to meet the requirements,add o for odd number, add e for even numbers, and separate it with common 
	public ArrayList<String> generateString(ArrayList<Integer> list)
	
	{
		ArrayList<String> lists = new ArrayList<>(Arrays.asList(list.stream().map(i->i%2==0?"e"+i:"o"+i).collect(Collectors.joining(","))));
		return lists;
	}
	public static void main(String[] args) {
		//Create a array list with integer
		ArrayList<Integer> list= new ArrayList<>(Arrays.asList(23,24,54,67,12,1,0));
		//Instance a object and call method to work on the list of numbers
		AssignmentsTwoDFive obj=new AssignmentsTwoDFive();
		obj.generateString(list).forEach(System.out::println);
	}

}
