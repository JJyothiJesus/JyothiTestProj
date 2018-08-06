package com.javaSample.Programs;

/// not executed need to solve this programs
class Sample implements Runnable
{
	Sample()
   {
     super();
     System.out.println("my thread created" + this);
    // start();
     
   }

public void run()
   {
     try
     {
        for (int i=0 ;i<10;i++)
        {
           System.out.println("Printing the count " + i);
           Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("my thread interrupted");
     }
     System.out.println("My thread run is over" );
   }

public boolean isAlive() {
	// TODO Auto-generated method stub
	return false;
}


}

public class ExtendingExample {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Sample cnt = new Sample();
	      boolean b = cnt.isAlive();
		  System.out.println("Thread is alive:" + b);
	      System.out.println("Main thread's run is over" );
	}

}
