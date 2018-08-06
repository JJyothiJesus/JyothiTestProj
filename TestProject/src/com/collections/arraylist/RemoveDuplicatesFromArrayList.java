package com.collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to remove duplicates from ArrayList
		
	/*	1) Copying all the elements of ArrayList to LinkedHashSet. 
	 * Why we choose LinkedHashSet? Because it removes duplicates and maintains the insertion order.
	2) Emptying the ArrayList
	3) Copying all the elements of LinkedHashSet(non-duplicate elements) to the ArrayList. Please find below the complete code.
	 */
	
		 List<String> al = new ArrayList<String>();
		 /* Creating ArrayList of Generic type Strings and adding elements to it
	      */
		 al.add("Ajay");
	     al.add("Becky");
	     al.add("Chaitanya");
	     al.add("Ajay");
	     al.add("Rock");
	     al.add("Becky");

	     // Displaying ArrayList elements 
	     System.out.println("Before:");
	     System.out.println("ArrayList contains: "+al);
	     
	  // Creating LinkedHashSet
	     LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	   
	     /* Adding ArrayList elements to the LinkedHashSet
	      * in order to remove the duplicate elements and 
	      * to preserve the insertion order.
	      */
	     
	     lhs.addAll(al);

	     // Removing ArrayList elements
	     al.clear();
	     System.out.println("After Removing :" +al);
	     
	     // Adding LinkedHashSet elements to the ArrayList
	     al.addAll(lhs);
	      
	     // Displaying ArrayList elements
	     System.out.println("After:");
	     System.out.println("after adding from LHS : "+ al);
	     
	     
	}

}
