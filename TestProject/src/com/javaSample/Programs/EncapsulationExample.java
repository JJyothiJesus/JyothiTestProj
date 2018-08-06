package com.javaSample.Programs;

class EmployeeCount
{
	
	//Make the instance variables private so that they cannot be accessed directly from outside the class.
	 private int numOfEmployees = 0;
	 
	 //You can only set and get values of these variables through the methods of the class.
	 //Have getter and setter methods in the class to set and get the values of the fields.
	 
	 public void setNoOfEmployees (int count)
	   {
	       numOfEmployees = count;
	   }
	   public double getNoOfEmployees () 
	   {
	       return numOfEmployees;
	   }
}

public class EncapsulationExample {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeCount obj = new EmployeeCount ();
	      obj.setNoOfEmployees(5613);
	      System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
		
	/*	
	      So what is the benefit of encapsulation in java programming
	      Well, at some point of time, if you want to change the implementation details of the class EmployeeCount,
	      you can freely do so without affecting the classes that are using it.*/
	      
	}

}
