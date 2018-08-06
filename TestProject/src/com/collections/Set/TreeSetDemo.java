package com.collections.Set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*TreeSet Class implements Set, dosen't allow duplicates , it maintains ascending order, 
		 * is it not synchronized, we should synchronize explicitly, time cost for operations log(n)
		 */		
		
		TreeSet <String> tset= new TreeSet<String>();
		
		 //add elements to TreeSet
	     tset.add("Abhijeet");
	     tset.add("Ram");
	     tset.add("Kevin");
	     tset.add("Singh");
	     tset.add("Rick");
	     // Duplicate removed
	     tset.add("Ram"); 
	  
	     // Displaying TreeSet elements
	     System.out.println("TreeSet contains: ");
	     for(String temp : tset){
	        System.out.println(temp);
	     }
	     
	     
	     // TreeSet of Integer Type
         TreeSet<Integer> tset2 = new TreeSet<Integer>();

         // Adding elements to TreeSet<Integer>
         tset2.add(88);
         tset2.add(7);
         tset2.add(101);
         tset2.add(0);
         tset2.add(3);
         tset2.add(222);
         System.out.println(tset2);
	  }
		
		
	}

