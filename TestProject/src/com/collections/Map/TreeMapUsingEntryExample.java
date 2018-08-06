package com.collections.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapUsingEntryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeMap sort the entries in ascending order of keys.
	/*	
				In this example, we have a Map collection class TreeMap and we are iterating and 
				displaying its key & value pairs using Map.Entry interfaces. 
				Here we have used getKey() and getValue() methods of 
				Map.Entry interface in order to get the key & value pairs.  
				Method of Map.Entry interface
				1) boolean equals(Object o): Compares the specified object with this entry for equality.
				2) Key getKey(): Returns the key corresponding to this entry.
				3) Value getValue(): Returns the value corresponding to this entry.
				4) int hashCode(): Returns the hash code value for this map entry.
				5) Value setValue(V value): Replaces the value corresponding to this entry with the specified value (optional operation).
			
		*/

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
	     // Adding elements to the Map
	     tm.put("Chaitanya", 27);
	     tm.put("Raghu", 35);
	     tm.put("Rajeev", 37);
	     tm.put("Syed", 28);
	     tm.put("Hugo", 32);
	 
	     // Getting a set of the entries
	     Set set = tm.entrySet();
	     System.out.println(" Set values :"+ set);
	     // Get an iterator
	     Iterator it = set.iterator();
	     
	     System.out.println(" iteratr values :"+ it);
	     // Display elements
	     while(it.hasNext()) {
	    	 
	        Map.Entry me = (Map.Entry)it.next();
	       
	        System.out.print("Key: "+me.getKey() + " & Value: ");
	        System.out.println(me.getValue());
	     }
	}

}
