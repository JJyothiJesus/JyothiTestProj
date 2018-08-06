package com.javaSample.Programs;


/*
 * Multithreading in java is a process of executing multiple activities can proceed concurrently in the same program.
Thread is basically a lightweight sub-process, a smallest unit of processing.
In multithreading threads share a common memory area. 
They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.

Multiple threads can exist within the same process and share resources such as memory, 
while different processes do not share these resources.
Using two different task at the same time means multi-tasking. Thread is unit of a process.
 *  Java 8 has a feature called lamba expression-- which reduces code, By creating anonymous class
 */
public class MultiThreadusinglamba {
	public static void main(String[] args) {	
		Thread t=  new Thread(() -> {
	        for(int i=1;i<=5;i++)
	        {
	        System.out.println("Hi ");
	            try
	            {
	            Thread.sleep(500);
	            }catch(Exception e){}
	        }
		});
	    Thread t1 =  new Thread(() -> {
	        for(int i=1;i<=5;i++)
	        {
	        System.out.println("Hello" );
	            try    
	            {
	            Thread.sleep(500);
	            }catch(Exception e){}
	        }   
	    });
	    t.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		t1.start();
}
}