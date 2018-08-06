package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//iterate arraylist elements using Enumeration interface
		
		  //create an ArrayList object
	      ArrayList<String> arrayList = new ArrayList<String>();
	 
	      //Add elements to ArrayList
	      arrayList.add("C");
	      arrayList.add("C++");
	      arrayList.add("Java");
	      arrayList.add("DotNet");
	      arrayList.add("Perl");
	      
	      // Get the Enumeration object
	      Enumeration<String> e = Collections.enumeration(arrayList);
	 
	      // Enumerate through the ArrayList elements
	      System.out.println("ArrayList elements: ");
	      while(e.hasMoreElements())
	      System.out.println(e.nextElement());
		
		
	}

}
