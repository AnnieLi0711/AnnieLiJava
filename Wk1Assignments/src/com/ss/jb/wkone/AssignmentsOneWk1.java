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
		MyMath ob = new MyMath();
		System.out.println("Please enter your input:\n");
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int T = Integer.parseInt(br.readLine());
		  PerformOperation op;
		  boolean ret = false;
		  String[] ans=new String[T];
		  int i=0;
		  while (T-->0) {
		   String s = br.readLine().trim();
		   StringTokenizer st = new StringTokenizer(s);
		   int ch = Integer.parseInt(st.nextToken());
		   int num = Integer.parseInt(st.nextToken());
		   if (ch == 1) {
		    op = ob.isOdd();
		    ret = ob.checker(op, num);
		    ans[i] = (ret) ? "ODD" : "EVEN";
		   } else if (ch == 2) {
		    op = ob.isPrime();
		    ret = ob.checker(op, num);
		    ans[i] = (ret) ? "PRIME" : "COMPOSITE";
		   } else if (ch == 3) {
		    op = ob.isPalindrome();
		    ret = ob.checker(op, num);
		    ans[i] = (ret) ? "PALINDROME" : "NOT PALINDROME";
            i++;
		   }
		  }
		  Arrays.stream(ans).forEach(System.out::println);
	}

}

interface PerformOperation {
	 boolean check(int a);
	}
	class MyMath {
	 public boolean checker (PerformOperation p, int num) {
		 return p.check(num);
	 }

	   PerformOperation isOdd()
	   {
	       PerformOperation po = (int a)-> a%2 == 0 ? false : true;
	       return po;
	   }
	   PerformOperation isPrime()
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
	   PerformOperation isPalindrome()
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
	}

