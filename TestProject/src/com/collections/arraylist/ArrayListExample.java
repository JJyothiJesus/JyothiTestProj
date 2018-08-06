package com.collections.arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		/*Creation of ArrayList: I'm going to add String elements so I made it of string type */
		
		ArrayList<String> obj = new ArrayList<String>();	
		 System.out.println("Initial size: "+obj.size());
		
		obj.add("Jyothi");
		obj.add("Jeeva");
		obj.add("Aditya");
		obj.add("Suresh");
		obj.add("Tom");
		
		System.out.println("Size after few additions: "+obj.size());
		System.out.println("Currently the array list has following elements:" +obj);
		
		/*Add element at the given index*/
		  obj.add(0, "Jyothi");
		  obj.add(1, "Jeeva");
		  
		  /*Remove elements from array list like this*/
		  obj.remove("Tom");
		  obj.remove("Jeeva");
		  
		  System.out.println("Size after remove operations: "+obj.size());
		  System.out.println("Current array list is:"+obj);
		  
		  /*Remove element from the given index*/
		  obj.remove(1);

		  System.out.println("Current array list is:"+obj);  

	}

}
