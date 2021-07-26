/**
 * 
 */
package com.ss.jb.wkonetest;
import com.ss.jb.wkone.AssignmentsFiveWk1;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Li
 *
 */
public class AssginmentsFiveWk1Test {
	@Test
	public void groupSumClump()
	{
		//Test Case 1:Return true,no numbers that are adjacent and identical value in the array
		int start=0;
		int target=10;
		int[] num=new int[]{2,4,8};
		assertTrue(new AssignmentsFiveWk1().groupSumClump(start, num, target));
		//Test Case 2:Return false,no numbers that are adjacent and identical value in the array
		start=0;
		target=10;
		num=new int[]{2,4,9};
		assertTrue(!(new AssignmentsFiveWk1().groupSumClump(start, num, target)));
		//Test Case 3:Return true,there are numbers that are adjacent and identical value in the array and start at the beginning of the array,they have to be selected to hit the target
		start=0;
		target=10;
		num=new int[]{2,2,2,4,9};
		assertTrue(new AssignmentsFiveWk1().groupSumClump(start, num, target));
		//Test Case 4:Return true,there are numbers that are adjacent and identical value in the array,they have to be unselected to hit the target
		start=0;
		target=10;
		num=new int[]{2,2,2,5,5};
		assertTrue(new AssignmentsFiveWk1().groupSumClump(start, num, target));
		//Test Case 5:Return false,there are numbers that are adjacent and identical value in the array
		start=0;
		target=10;
		num=new int[]{2,2,2,2,5};
		assertTrue(!(new AssignmentsFiveWk1().groupSumClump(start, num, target)));
		//Test Case 6:Return true,there are numbers that are adjacent and identical value in the array and not start at the beginning of the array,they have to be selected to hit the target
		start=0;
		target=10;
		num=new int[]{4,2,2,2,9};
		assertTrue(new AssignmentsFiveWk1().groupSumClump(start, num, target));
		//Test Case 7:Return false,there are numbers that are adjacent and identical value in the array,select some of them will hit the target,but not all or none
		start=0;
		target=10;
		num=new int[]{4,2,2,2,2,9};
		assertTrue(!(new AssignmentsFiveWk1().groupSumClump(start, num, target)));
	}

}
