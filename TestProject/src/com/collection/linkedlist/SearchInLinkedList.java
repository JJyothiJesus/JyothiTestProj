package com.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SearchInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // Step1: Create a LinkedList
	     LinkedList<String> linkedlist = new LinkedList<String>();
	 
	     // Step2: Add elements to LinkedList
	     linkedlist.add("Tim");
	     linkedlist.add("Rock");
	     linkedlist.add("Hulk");
	     linkedlist.add("Rock");
	     linkedlist.add("James");
	     linkedlist.add("Rock");
	 
	     //Searching first occurrence of element
	     int firstIndex = linkedlist.indexOf("Rock");
	     System.out.println("First Occurrence: " + firstIndex);
	 
	     //Searching last occurrence of element
	     int lastIndex = linkedlist.lastIndexOf("Rock");
	     System.out.println("Last Occurrence: " + lastIndex);
	     
	     // Getting First element of the List
	     Object firstElement = linkedlist.getFirst();
	     System.out.println("First Element is: "+firstElement);
	  	  
	     
	  // Displaying LinkedList elements
	     System.out.println("LinkedList elements:");
	     Iterator it= linkedlist.iterator();
	     while(it.hasNext()){
	        System.out.println(it.next());
	     }
	     
	     
	  // Obtaining Sublist from the LinkedList -- sublist of LinkedList using subList(int startIndex, int endIndex)
	     List sublist = linkedlist.subList(2,5);
	  
	     // Displaying SubList elements
	     System.out.println("\nSub List elements:");
	     Iterator subit= sublist.iterator();
	     while(subit.hasNext()){
	        System.out.println(subit.next());
	     }
	  
	     sublist.remove("Item4");
	     System.out.println("\nLinkedList elements After remove:");
	     Iterator it2= linkedlist.iterator();
	     while(it2.hasNext()){
	        System.out.println(it2.next());
	     }
	     
	     
	}

}