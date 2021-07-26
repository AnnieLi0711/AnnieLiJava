/**
 * 
 */
package com.ss.jb.wkonetest;
import com.ss.jb.wkone.AssginmentsFourWk1;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
 * @author Li
 *
 */
public class AssginmentsFourWk1Test {
	@Test
	public void removeXTest()
	{
		//The test data list covers below test cases:
		//Test Case 1: String does not contain x
		//Test Case 2: String contains X,not x
		//Test Case 3: String contains one x
		//Test Case 4: String contains more than one x
		//Test Case 4: String contains only x
		ArrayList<String> list=new ArrayList<>(Arrays.asList("asdd","Xms","xasdf","asdxild","asdfx","HelloMyFriend x","x","xxkasdxldx"));
		ArrayList<String> expect=new ArrayList<>(Arrays.asList("asdd","Xms","asdf","asdild","asdf","HelloMyFriend ","","kasdld"));
		assertTrue(expect.containsAll(new AssginmentsFourWk1().removeX(list)));
	}

}
