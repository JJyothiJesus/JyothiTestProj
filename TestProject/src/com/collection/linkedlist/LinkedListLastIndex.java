package com.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a LinkedList
	     LinkedList<String> list = new LinkedList<String>();

	     // Add elements
	     list.add("AA");
	     list.add("BB");
	     list.add("CC");
	     list.add("AA");
	     list.add("DD");
	     list.add("AA");
	     list.add("EE");
	 
	     // Display LinkedList elements
	     System.out.println("LinkedList elements: "+list);

	     // get the index of last occurrence of element "AA"
	     /* public int lastIndexOf(Object o): Returns the index 
	      * of the last occurrence of the specified element in 
	      * this list, or -1 if this list does not contain the 
	      * element. 
	      */
	     System.out.println("LastIndex of AA:"+list.lastIndexOf("AA"));

	     // get the index of last occurrence of element "ZZ"
	     /* Note: The element ZZ does not exist in the list so
	      * the method lastIndexOf would return -1 for it.
	      */
	     System.out.println("LastIndex of ZZ:"+list.lastIndexOf("ZZ"));
	     
	     /* pollFirst(): Retrieves and removes the first element 
	      * of this list, or returns null if this list is empty.
	      */
	     System.out.println("Element removed PollFirst: "+list.pollFirst());
	     System.out.println("Element removed pollLast: "+list.pollLast());

	     // Display after calling pollLast() method
	     System.out.println("LinkedList after: "+list);
	     
	   //peek()
	     System.out.println("peek : "+ list.peek());
	 
	     //peekFirst()
	     System.out.println("peekfirst : "+list.peekFirst());
	 
	     //peekLast()
	     System.out.println("peek last : "+ list.peekLast());

	     // Should be same as peek methods does not remove
	     System.out.println("LinkedList after: "+list);
	     
	     // push Element the list
	     list.push("NEW ELEMENT");
	     
	     // Display after push operation
	     System.out.println("LinkedList contains: "+list);
	     
	     // pop Element from list and display it
	     System.out.println("Element removed pop: "+list.pop());

	     // Display after pop operation
	     System.out.println("LinkedList after pop: "+list);
	     
	     
	}

}
