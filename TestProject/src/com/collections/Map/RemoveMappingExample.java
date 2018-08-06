package com.collections.Map;

import java.util.Hashtable;

public class RemoveMappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Creating a Hashtable
	    Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
	 
	    // Adding Key and Value pairs to Hashtable
	    hashtable.put(11,"AA");
	    hashtable.put(22,"BB");
	    hashtable.put(33,"CC");
	    hashtable.put(44,"DD");
	    hashtable.put(55,"EE");
	 
	    //Before remove
	    System.out.println("Hashtable contains:" + hashtable);
	 
	    hashtable.remove(44);
	    // Removing key-value pairs for key 44
/*	    Object removedValue = hashtable.remove(44);*/
	 
	    //After remove
	    System.out.println("After remove:");
	    System.out.println("Hashtable Key-value pairs: " + hashtable);
				
	    /*In the above program we have provided the key 44 while calling remove(key) method so 
	     * the key-value mapping corresponding to key 44 has been removed from
	     *  Hashtable and the method returned the value mapped to the key 44.*/
	    
	}

}
