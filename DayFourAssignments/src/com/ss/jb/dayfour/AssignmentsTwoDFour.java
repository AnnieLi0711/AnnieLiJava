/**
 * 
 */
package com.ss.jb.dayfour;

/**
 * @author Li
 *
 */
//Write a program to create a deadlock between two threads.
public class AssignmentsTwoDFour {

	/**
	 * @param args
	 */
	//Create two objects
	public static Object l1 = new Object();
	public static Object l2 = new Object();
	
	//Create first thread
	static class ThreadCreatorOne extends Thread
	{
		public void run()
		{
			//Lock object l1 in thread1
			synchronized(l1)
			{
				System.out.println("Thread1 is holding lock 1");
				
				try{Thread.sleep(20);}

				catch(Exception e)
					{}
				System.out.println("Thread1 is Waiting for lock 2");
				//Lock object l2 in thread1
				synchronized (l2) 
				{
		            System.out.println("Thread 1 is holding lock 1 and lock 2");
		        }
			}
		}
	}
	
	//Create another thread
	static class ThreadCreatorTwo extends Thread
	{
		public void run()
		{
			//Lock object l2 in Thread2
			synchronized(l2)
			{
				System.out.println("Thread2 is holding lock 2");
				
				try{Thread.sleep(20);}

				catch(Exception e)
					{}
				System.out.println("Thread2 is Waiting for lock 1");
				//Lock object l1 in Thread2
				synchronized (l1) 
				{
		            System.out.println("Thread 2 is holding lock 1 and lock 2");
		        }
			}
		}
	};
	
	public static void main(String[] args) {
		ThreadCreatorOne Thread1=new ThreadCreatorOne();
		ThreadCreatorTwo Thread2=new ThreadCreatorTwo();
		Thread1.start();
		Thread2.start();

	}

}
