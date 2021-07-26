/**
 * 
 */
package com.ss.jb.wkonetest;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.ss.jb.wkone.AssignmentsOneWk1;

/**
 * @author Li
 *
 */
public class AssignmentsOneWk1Test {
	@Test
	public void isOddTest()
	{
		//Test Case 1: Odd Number
		assertTrue(new AssignmentsOneWk1().isOdd().check(3));
		//Test Case 2: Even Number
		assertTrue(!(new AssignmentsOneWk1().isOdd().check(14)));
		//Test Case 3: Number 0
		assertTrue(!(new AssignmentsOneWk1().isOdd().check(0)));
	}
	
	@Test
	public void isPrimeTest()
	{
		//Test Case 1: Prime Number
		assertTrue(new AssignmentsOneWk1().isPrime().check(13));
		//Test Case 2: Composite Number
		assertTrue(!(new AssignmentsOneWk1().isPrime().check(15)));
		//Test Case 3: Number 0
		assertTrue(new AssignmentsOneWk1().isPrime().check(0));
	}
	
	@Test
	public void isPalindromeTest()
	{
		//Test Case 1: Palindrome Number
		assertTrue(new AssignmentsOneWk1().isPalindrome().check(1331));
		//Test Case 2: Non-Palindrome Number
		assertTrue(!(new AssignmentsOneWk1().isPalindrome().check(1515)));
		//Test Case 3: Number 0
		assertTrue(new AssignmentsOneWk1().isPalindrome().check(0));
	}

}
