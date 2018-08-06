package com.javaSample.Programs;

public class ThreadbyimplementingRunnableInterface implements Runnable {

	public void run(){  
	    System.out.println("My thread is in running state.");  
	  }   

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThreadbyimplementingRunnableInterface obj=new ThreadbyimplementingRunnableInterface();  
	     Thread tobj =new Thread(obj);  
	     tobj.start();  	
		
		
	}

}
