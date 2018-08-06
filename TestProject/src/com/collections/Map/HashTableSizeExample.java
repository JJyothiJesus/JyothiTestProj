package com.collections.Map;

import java.util.Hashtable;

public class HashTableSizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating a Hash table instance
	    Hashtable<String, String> hashtable = new Hashtable<String, String>();
	 
	    // Adding key-value pairs to Hash table
	    hashtable.put("A", "Apple");
	    hashtable.put("B", "Orange");
	    hashtable.put("C", "Mango");
	    hashtable.put("D", "Banana");
	    hashtable.put("E", "Grapes");
	 
	    /* int size(): method returns number of key value pairs present
	     * in this hash table. 
	     */
	    System.out.println("Size of Hashtable: " + hashtable.size()); 
	 }

	}

