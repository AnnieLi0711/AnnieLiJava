/**
 * 
 */
package com.ss.jb.dayfivetest;
import org.junit.Test;
import com.ss.jb.dayfive.AssignmentsOneDFive;
import static org.junit.Assert.assertEquals;

/**
 * @author Li
 *
 */
public class AssignmentsOneDFiveTests {
	@Test
	public void  helperTest()
	{
		//Test Case1,both strings contain e
		assertEquals(0,new AssignmentsOneDFive().helper("eada","dael"));
		
		//Test Case2,string1 contain e, string2 does not
		assertEquals(-1,new AssignmentsOneDFive().helper("eada","dal"));
		
		//Test Case3,string1 does not contain e, string2 contain e
		assertEquals(1,new AssignmentsOneDFive().helper("ada","edal"));
		
		//Test Case4,string1 is empty,string2 contains e
		assertEquals(1,new AssignmentsOneDFive().helper("","dael"));
	}

}
