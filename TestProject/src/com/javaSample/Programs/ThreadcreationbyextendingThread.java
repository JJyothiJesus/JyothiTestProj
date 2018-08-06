
package com.javaSample.Programs;

public class ThreadcreationbyextendingThread extends Thread {
	
	public void run(){  
	    System.out.println("My thread is in running state.");  
	  }   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadcreationbyextendingThread obj  = new ThreadcreationbyextendingThread();
		
		obj.start();
		
		
	}

}
