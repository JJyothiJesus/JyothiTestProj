package com.collections.arraylist;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<AuthorComp> {

	public int compare(AuthorComp a1,AuthorComp a2){
	     if(a1.auAge==a2.auAge)
	       return 0;
	   else if(a1.auAge>a2.auAge)
	       return 1;
	   else
	       return -1;
	  }
	
}
