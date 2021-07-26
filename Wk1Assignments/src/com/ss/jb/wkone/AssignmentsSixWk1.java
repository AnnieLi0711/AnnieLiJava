/**
 * 
 */
package com.ss.jb.wkone;

/**
 * @author Li
 *
 */
//Fix the below Singleton class:
public class AssignmentsSixWk1 {

	/**
	 * @param args
	 */
	public static class SampleSingleton {
		private static SampleSingleton instance = null;
		private SampleSingleton() { 
		} 
	public  static  SampleSingleton GetInstance() {
			    {
					if (instance==null)
					instance =new SampleSingleton();
			    }
		    return instance;
		}
		}
}
