package com.collections.Set;

import java.util.HashSet;

public class ConvertHashSettoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a HashSet
	     HashSet<String> hset = new HashSet<String>();
	 
	     //add elements to HashSet
	     hset.add("Element1");
	     hset.add("Element2");
	     hset.add("Element3");
	     hset.add("Element4");
	 
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating an Array
	     String[] array = new String[hset.size()];
	     
	 /*    The toArray() method is used to get an array which contains 
	     all the elements in ArrayList object in proper sequence (from first to last element).*/
	     
	     hset.toArray(array);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	     for(String temp : array){
	        System.out.println(temp);
	     }
		
	}

}
