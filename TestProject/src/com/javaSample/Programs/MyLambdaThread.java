package com.javaSample.Programs;

public class MyLambdaThread {
	
	
	/* Lambda Expression
	 * new Thread(() -> {//code}).start(): Here i am using the Thread(Runnable obj) constructor. 
	 * This constructor takes a Runnable object and the Runnable interface
	 *  contains only one method that is public void run() which takes no parameters.
	 *  The body of the thread is written here.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Child thread

	    new Thread(() -> {

	        for(int i=1;i<=5;i++)

	        {

	        System.out.println("Child Thread "+i);

	            try
	       
	            {

	            Thread.sleep(100);
	   
	            }catch(Exception e){}

	        }

	    }).start();

	    // Main Thead

	        for(int i=1;i<5;i++)

	        {

	        System.out.println("Main Thread "+i);

	            try
	       
	            {

	            Thread.sleep(100);

	            }catch(Exception e){}
	   
	        }

		
	}

}
