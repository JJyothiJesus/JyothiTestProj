package com.javaSample.Programs;

class Hi extends Thread{
	
	public void run() {
		
		for(int i=0;i<=5; i++)
		{
			System.out.println("Hi");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
	
}

class Hello extends Thread{
public void run() {
		
		for(int i=0;i<=5; i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
		// Main thread will call both sobjects show method

		Hi hiobj = new Hi();
		
		Hello helloobj = new Hello();
		
		hiobj.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		
		}
		
		helloobj.start();
	}


}