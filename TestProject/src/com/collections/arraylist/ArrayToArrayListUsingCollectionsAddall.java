package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayToArrayListUsingCollectionsAddall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*It does the same as Arrays.asList method however 
		it is much faster than it so performance wise this is a best way to get the array converted to ArrayList.*/
		
		   String array[]={"Hi", "Hello", "Howdy", "Bye"};
		   
		   ArrayList<String> arraylist= new ArrayList<String>();
		   
		   /*Conversion*/
		    Collections.addAll(arraylist, array);
		    
		    /*Adding new elements to the converted List*/
		    arraylist.add("where");
		    arraylist.add("when");
		    
		    /*Display array list*/
		    for (String str: arraylist)
		    {
		 	System.out.println(str);
		    }
		    
		
	}
	

}
