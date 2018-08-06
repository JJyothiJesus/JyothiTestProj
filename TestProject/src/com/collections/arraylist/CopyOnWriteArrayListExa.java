package com.collections.arraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * CopyOnWriteArrayList is a thread-safe (not synchronized) variant of ArrayList.
 */
		   CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();

		    //Adding elements to synchronized ArrayList
		    al.add("Pen");
		    al.add("NoteBook");
		    al.add("Ink");

		    System.out.println("Displaying synchronized ArrayList Elements:");
		    //Synchronized block is not required in this method
		    Iterator<String> iterator = al.iterator(); 
		    while (iterator.hasNext())
		       System.out.println(iterator.next());
		  }
		
	}

