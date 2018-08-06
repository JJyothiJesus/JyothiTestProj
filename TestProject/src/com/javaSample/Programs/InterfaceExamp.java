package com.javaSample.Programs;


//A simple interface by  default it is public and abstract 
interface interfac
{
	 // public, static and final
    final int a = 10;
    
    // public and abstract 
    void display();
	
}


//A class that implements interface.
public class InterfaceExamp  implements interfac {
	
	// Implementing the capabilities of
    // interface.
    public void display()
    {
        System.out.println("Geek");
    }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceExamp ife = new InterfaceExamp();
		ife.display();
		
		System.out.println(" interfac  " + a );
		
	}

}
