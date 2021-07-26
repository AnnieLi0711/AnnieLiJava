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
//Given a list of strings, return a list where each string has all its "x" removed.
public class AssginmentsFourWk1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>(Arrays.asList("asdd","Xms","xasdf","asdxild","asdfx","HelloMyFriend x","x","xxkasdxldx"));
		AssginmentsFourWk1 obj=new AssginmentsFourWk1();
		obj.removeX(list).forEach(System.out::println);
	}
	
	public ArrayList<String> removeX(ArrayList<String> list)
	{
		ArrayList<String> lists =new ArrayList<>(list.stream().map(i->i.contains("x")? i=i.replace("x",""):i).collect(Collectors.toList()));
		return lists;
	}

}
