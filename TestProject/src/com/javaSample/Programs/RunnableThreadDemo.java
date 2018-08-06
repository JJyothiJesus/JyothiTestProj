package com.javaSample.Programs;



class A implements Runnable 
{
	
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

class B implements Runnable{
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

public class RunnableThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable hiobj = new A();
		Runnable helloobj = new B();
		
		Thread t= new Thread(hiobj);
		
		Thread t1 = new Thread(helloobj);
		
		t.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		t1.start();
		
		
		
		
	}

}
