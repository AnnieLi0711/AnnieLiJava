/**
 * 
 */
package com.ss.jb.dayfive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Li
 *
 */
public class AssignmentsThreeDFive {

	/**
	 * @param args
	 */
	//Create a method to meet the requirements,filter strings only start with a and have exactly 3 letters
		public List<String> filteString(ArrayList<String> list)
		{
			List<String> lists = list.stream().filter(i->(i.charAt(0)=='a'&&i.length()==3)).collect(Collectors.toList());
			return lists;
		}
		public static void main(String[] args) {
			//Create a array list with string
			ArrayList<String> list= new ArrayList<>(Arrays.asList("Hello","add","wad","ade","Ade","Welcome","adeo"," ","aaa"));
			//Instance a object and call method to work on the list of strings
			AssignmentsThreeDFive obj=new AssignmentsThreeDFive();
			obj.filteString(list).forEach(System.out::println);
		}

}
