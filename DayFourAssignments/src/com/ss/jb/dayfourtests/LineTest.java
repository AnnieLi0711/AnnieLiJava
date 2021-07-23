/**
 * 
 */
package com.ss.jb.dayfourtests;
import com.ss.jb.dayfour.Line;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * @author Li
 *
 */
public class LineTest {

	@Test
	public void getSlopeTest()
	{
		//Result is greater than 0
		assertEquals(24.747,new Line(1.20,4.30,5.00,98.34).getSlope(),0.001);
		//Result is 0
		assertEquals(0,new Line(1.20,123.440,5.00,123.44).getSlope(),0.001);
		//Result is less than 0
	    assertEquals(-0.789,new Line(1.20,123.440,5.00,120.44).getSlope(),0.001);
	}
	
	@Test
	public void getDistanceTest()
	{
		//Result is 0
		assertEquals(0,new Line(19.20,46.30,19.20,46.30).getDistance(),0.001);
		//Result is greater than 0
		assertEquals(4.000,new Line(1.00,123.440,5.00,123.44).getDistance(),0.001);
	}
	
	@Test
	public void parallelToTest()
	{
		//Return true
		assertTrue(new Line(17.20,46.30,19.20,49.30).parallelTo(new Line(17.20,46.30,19.20,49.30)));
		//Return false
		assertFalse(new Line(6.00,127.440,5.00,123.44).parallelTo(new Line(1.00,123.440,5.00,523.44)));
	}
}