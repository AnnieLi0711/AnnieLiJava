/**
 * 
 */
package com.ss.jb.wkone;

/**
 * @author Li
 *
 */
public class AssignmentsFiveWk1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= new int[] {2,9,8};
		//int s=0;
		int t=11;
		int b=0;
		boolean x=false;
		AssignmentsFiveWk1 obj=new AssignmentsFiveWk1();
			x=obj.groupSumClump(b, a, t);
		    if(x)
		    {
		    	System.out.println("Hey, it is very possible");
		    }
		    else if (x==false)
		    {
		    	System.out.println("Hmmm...it is NOT possible");
		    }
	}
	public boolean groupSumClump(int start, int[] nums, int target) {
		if (target == 0)
		{return true;}
		else if(start >= nums.length)
	    return false;
	    int i = start;
	    int sum = 0;
	    while(i < nums.length && nums[start] == nums[i]) {
	        sum += nums[i];
	        i++;
	    }
	                              
	    if(groupSumClump(i, nums, target - sum))
	    	{//System.out.println(start);
	        return true;}
	                                        
	    if(groupSumClump(i, nums, target))
	    	{return true;}                                       
	    return false;
	}

}
