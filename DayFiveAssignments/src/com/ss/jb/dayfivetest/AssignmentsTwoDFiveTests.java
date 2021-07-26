/**
 * 
 */
package com.ss.jb.dayfivetest;
import org.junit.Test;
import com.ss.jb.dayfive.AssignmentsTwoDFive;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Li
 *
 */
public class AssignmentsTwoDFiveTests {
	@Test
	public void generateStringTest(){
		//The test data list covers below test cases:
		//Test Case 1: odd number
		//Test Case 2: even number
		ArrayList<Integer> list= new ArrayList<>(Arrays.asList(23,24,54,67,12,1,0));
		ArrayList<String> expect= new ArrayList<>(Arrays.asList("o23,e24,e54,o67,e12,o1,e0"));
		assertTrue(expect.containsAll(new AssignmentsTwoDFive().generateString(list)));
}

}
