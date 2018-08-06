package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorSortingPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<AuthorComp> al=new ArrayList<AuthorComp>();
		   
		   
		   	al.add(new AuthorComp("Henry", "Tropic of Cancer",  45));
		     al.add(new AuthorComp("Nalo", "Brown Girl in the Ring", 56));
		     al.add(new AuthorComp("Frank", "300", 65));
		     al.add(new AuthorComp("Deborah", "Sky Boys", 51));
		     al.add(new AuthorComp("George R. R.", "A Song of Ice and Fire", 62));
		     
		     /*       
		      * Sorting the list using Collections.sort() method, we       
		      * can use this method because we have implemented the        
		      * Comparable interface in our user defined class Author       
		      */      
		   
		     System.out.println("Sorting by Author First Name:");      
		     Collections.sort(al);        
		     for(AuthorComp au: al){       
		       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
		           au.getAuAge());        
		     }     
		     /*Sorting using AuthorAgeComparator*/      
		     System.out.println("Sorting by Author Age:");
		     Collections.sort(al, new AuthorAgeComparator());
		     for(AuthorComp au: al){       
		       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
		          au.getAuAge());        
		     }             
		     /*Sorting using BookNameComparator*/      
		     System.out.println("Sorting by Book Name:");      
		     Collections.sort(al, new BookNameComparator());      
		     for(AuthorComp au: al){       
		        System.out.println(au.getFirstName()+", "+au.getBookName()+", "+ 
		           au.getAuAge());       
		     }         
		     
	}

}
