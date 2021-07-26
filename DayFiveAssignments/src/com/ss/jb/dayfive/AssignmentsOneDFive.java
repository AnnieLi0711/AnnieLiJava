/**
 * 
 */
package com.ss.jb.dayfive;
import java.util.Arrays;

/**
 * @author Li
 *
 */
public class AssignmentsOneDFive {

	/**
	 * @param args
	 */
	public static int helper(String s1,String s2) {
		if (s1.contains("e") && s2.contains("e")) 
	      {
	        return 0;
	      } else if (s1.contains("e")) 
	      {
	        return -1;
	      } else 
	      {
	        return 1;
	      }	
	}
	  public static void main(String[] args) {
		    String[] array = { "Hello", "Wonderful", "Great", "Job", "Hi", "I" };
		    //Sort string from shortest to longest
		    System.out.println("Sort String from Shortest to longest: ");
		    Arrays.sort(array, (s1, s2) -> s1.length() - s2.length());
		    Arrays.stream(array).forEach(System.out::println);

		   //Sort string from longest to shortest
		    System.out.println("\nSort String from Longest to shortest: ");
		    Arrays.sort(array, (s1, s2) -> (s2.length() - s1.length()));
		    Arrays.stream(array).forEach(System.out::println);

		    //Sort string Alphabetically by the first character only
		    System.out.println("\nSort String from Alphabetically by the first character only: ");
		    Arrays.sort(array, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		    Arrays.stream(array).forEach(System.out::println);
		    
		    //Sort string that strings contains "e" first,everything else second
		    System.out.println("\nSort String that strings contains \"e\" first,everything else second: ");
		    Arrays.sort(array, (s1, s2) -> 
		    {if (s1.contains("e") && s2.contains("e")) 
		      {
		        return 0;
		      } else if (s1.contains("e")) 
		      {
		        return -1;
		        
		      } else 
		      {
		        return 1;
		      }
		    });
		    Arrays.stream(array).forEach(System.out::println);
		    
		    //Sort string that strings contains "e" first,everything else second with my own helper method
		    System.out.println("\nSort String that strings contains \"e\" first,everything else second with my own helper method: ");
		    Arrays.sort(array, (s1, s2) -> helper(s1,s2));
		    Arrays.stream(array).forEach(System.out::println);
		  }

}
