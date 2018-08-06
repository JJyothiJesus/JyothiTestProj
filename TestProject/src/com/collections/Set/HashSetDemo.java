package com.collections.Set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*HashSet Class implements Set, dosen't allow duplicates , no insertion order, 
		 * is it not synchronized, we should synchronize explicitly, maintains constant time
		 */		
		  // Create a HashSet
	     HashSet<String> hset = new HashSet<String>();
	  
	     //add elements to HashSet
	     hset.add("Abhijeet");
	     hset.add("Ram");
	     hset.add("Kevin");
	     hset.add("Singh");
	     hset.add("Rick");
	     
	     // Duplicate to be removed
	     hset.add("Ram"); 
	/*      public void clear(): It removes all the elements
	      * from HashSet. The set becomes empty after this
	      * method gets called.
	      
	     hset.clear();
	 */
	     
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: " + hset );
	     
	     for(String temp : hset){
	        System.out.println(temp);
	     } 
		
	}

}
