package com.collections.arraylist;

import java.util.ArrayList;

public class ArrayListCloningExa {

	
	//This obj.clone() method returns a shallow copy of the ArrayList instance.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<String> al = new ArrayList<String>();

		//Adding elements to the ArrayList
		     al.add("Apple");
		     al.add("Orange");
		     al.add("Mango");
		     al.add("Grapes");
		     System.out.println("ArrayList: "+al);
		     
		     /*
		      * In this example we have an ArrayList of String type and we are cloning it to another ArrayList using clone() method.
		      * The interesting point to see here is when we added and removed few elements from original ArrayList after the clone() method
		      * the cloned ArrayList didn’t get affected
		      * It shows that clone() method just returns a shallow copy of ArrayList.
		      */		     
		     
		     ArrayList<String> al2 = (ArrayList<String>)al.clone();
		     System.out.println("Shallow copy of ArrayList: "+ al2);
		   //add and remove on original ArrayList
		     al.add("Fig");
		     al.remove("Orange");

		     //Display of both ArrayLists after add & remove
		     System.out.println("Original ArrayList:"+al);
		     System.out.println("Cloned ArrayList:"+al2);
		   
	}

}
