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
//Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
public class AssginmentsTwoWk1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<> (Arrays.asList(23,24,54,67,12,1,0));
		AssginmentsTwoWk1 obj= new AssginmentsTwoWk1();
		obj.rightMostDigit(list).forEach(System.out::println);
	}
	
	public ArrayList<Integer> rightMostDigit(ArrayList<Integer> list)
	{
		ArrayList<Integer> lists=new ArrayList<>(list.stream().map(i->i%10).collect(Collectors.toList()));
		return lists;
	}

}
