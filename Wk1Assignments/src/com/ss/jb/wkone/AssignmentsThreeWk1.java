/**
 * 
 */
package com.ss.jb.wkone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Li
 *
 */
//Given a list of integers, return a list where each integer is multiplied by 2.
public class AssignmentsThreeWk1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<> (Arrays.asList(23,24,54,67,12,1,0));
		AssignmentsThreeWk1 obj=new AssignmentsThreeWk1();
		obj.multipledInt(list).forEach(System.out::println);
	}
	
	public ArrayList<Integer> multipledInt(ArrayList<Integer> list)
	{
		ArrayList<Integer> lists= new ArrayList<>(list.stream().map(i->i*2).collect(Collectors.toList()));
		return lists;
	}

}
