/**
 * 
 */
package com.ss.jb.wkone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/**
 * @author Li
 *
 */
//Write the following methods that return a lambda expression performing a specified action:
//PerformOperation isOdd(): The lambda expression must return  if a number is odd or  if it is even.
//PerformOperation isPrime(): The lambda expression must return  if a number is prime or  if it is composite.
//PerformOperation isPalindrome(): The lambda expression must return  if a number is a palindrome or  if it is not.
public class AssignmentsOneWk1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		AssignmentsOneWk1 obj = new AssignmentsOneWk1();
		System.out.println("Please enter your input:\n");
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int T = Integer.parseInt(br.readLine());
		  PerformOperation op;
		  boolean returnValue = false;
		  String[] answerValue=new String[T];
		  int i=0;
		  while (T-->0) {
		   String s = br.readLine().trim();
		   StringTokenizer st = new StringTokenizer(s);
		   int ch = Integer.parseInt(st.nextToken());
		   int num = Integer.parseInt(st.nextToken());
		   if (ch == 1) {
		    op = obj.isOdd();
		    returnValue=op.check(num);
		    answerValue[i] = (returnValue) ? "ODD" : "EVEN";
		    i++;
		   } else if (ch == 2) {
		    op = obj.isPrime();
		    returnValue=op.check(num);
		    answerValue[i] = (returnValue) ? "PRIME" : "COMPOSITE";
		    i++;
		   } else if (ch == 3) {
		    op = obj.isPalindrome();
		    returnValue=op.check(num);
		    answerValue[i] = (returnValue) ? "PALINDROME" : "NOT PALINDROME";
            i++;
		   }
		  }
		  for (int k=0;k<answerValue.length;k++)
		  {
			  System.out.println(answerValue[k]);
		  }
		  Arrays.stream(answerValue).forEach(System.out::println);
	}
	
		   public PerformOperation isOdd()
		   {
		       PerformOperation po = (int a)-> a%2 == 0 ? false : true;
		       return po;
		   }
		   public PerformOperation isPrime()
		   {
		       PerformOperation po = (int a)->  
		       {
		           if(a == 1) return true;
		           else
		           {
		               for (int i =  2; i < Math.sqrt(a); i++)
		                    if(a%i == 0) return false;
		                return true;
		           }
		       };
		       return po;
		   }
		   public PerformOperation isPalindrome()
		   {
		       PerformOperation po = (int a)->
		       {
		            String str = Integer.toString(a);
		           String reverse = "";
		           for(int i = str.length()-1; i >= 0; i--)
		           {
		               reverse = reverse + str.charAt(i);
		           }
		           if(reverse.equals(str)) return true;
		           return false;
		       };
		       return po;
		   }
     public interface PerformOperation {
				 boolean check(int a);
				}
				
		}


