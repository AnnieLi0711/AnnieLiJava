/**
 * 
 */
package com.ss.jb.wkonetest;
import com.ss.jb.wkone.AssginmentsTwoWk1;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
 * @author Li
 *
 */
public class AssginmentsTwoWk1Test {
	@Test
	public void rightMostDigitTest()
	{
		//The test data list covers below test cases:
		//Test Case 1: One digit integer
		//Test Case 2: Two digits integer
		//Test Case 3: Three digits integer
		//Test Case 4: data 0
		ArrayList<Integer> list=new ArrayList<> (Arrays.asList(234,24,54,67,12,1,0,90));
		ArrayList<Integer> expect=new ArrayList<> (Arrays.asList(4,4,4,7,2,1,0,0));
		assertTrue(expect.containsAll(new AssginmentsTwoWk1().rightMostDigit(list)));
	}

}
