/**
 * 
 */
package com.ss.jb.dayfivetest;
import org.junit.Test;
import com.ss.jb.dayfive.AssignmentsThreeDFive;
import java.util.List;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Li
 *
 */
public class AssignmentsThreeDFiveTests {
	@Test
	public void filteStringTest()
	{
		//The test data list covers below test cases:
		//Test Case 1: Strings without a and more than 3 letter
		//Test Case 2: String without a and 3 letters
		//Test Case 3: String start with a and only 3 letters
		//Test Case 4: String start with a and more than 3 letters
		//Test Case 5: String does not contain any letters
		ArrayList<String> list= new ArrayList<>(Arrays.asList("Hello","add","wad","ade","Ade","Welcome","adeo","aaa"," "));
		List<String> expect= new ArrayList<String>();
		expect.add("add");
		expect.add("ade");
		expect.add("aaa");
		assertTrue(expect.containsAll(new AssignmentsThreeDFive().filteString(list)));
	}

}
