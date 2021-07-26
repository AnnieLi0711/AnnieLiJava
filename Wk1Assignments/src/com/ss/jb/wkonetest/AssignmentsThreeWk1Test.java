/**
 * 
 */
package com.ss.jb.wkonetest;
import com.ss.jb.wkone.AssignmentsThreeWk1;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
 * @author Li
 *
 */
public class AssignmentsThreeWk1Test {
	@Test
	public void multipledIntTest()
	{
		//The test data list covers below test cases:
		//Test Case 1: One digit integer
		//Test Case 2: Two digits integer
		//Test Case 4: data 0
		ArrayList<Integer> list=new ArrayList<> (Arrays.asList(23,24,54,67,12,1,0));
		ArrayList<Integer> expect=new ArrayList<> (Arrays.asList(46,48,108,134,24,2,0));
		assertTrue(expect.containsAll(new AssignmentsThreeWk1().multipledInt(list)));
	}

}
