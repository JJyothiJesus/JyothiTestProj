package com.collections.Set;

import java.util.HashSet;

public class CopySetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create a HashSet
	     HashSet<String> hset = new HashSet<String>();
	 
	     //add elements to HashSet
	     hset.add("Element1");
	     hset.add("Element2");
	     hset.add("Element3");
	     System.out.println("Set before addAll:"+ hset);
	 
	     // Create another HashSet
	     HashSet<String> hset2 = new HashSet<String>();
	     hset2.add("Item1");
	     hset2.add("Item2");
	 
	     // Copying one Set to another
	     hset.addAll(hset2);
	 
	     System.out.println("Set after addAll:"+ hset);
	}

}
