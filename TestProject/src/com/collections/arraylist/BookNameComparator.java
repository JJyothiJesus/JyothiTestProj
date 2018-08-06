package com.collections.arraylist;

import java.util.Comparator;

public class BookNameComparator implements Comparator<AuthorComp> {

	public int compare(AuthorComp a1,AuthorComp a2){   
	     return a1.bookName.compareTo(a2.bookName); 
	  }  
	
	
}
