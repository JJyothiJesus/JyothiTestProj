package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingStudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<StudentExComparable> arraylist = new ArrayList<StudentExComparable>();
		  /* arraylist.add(new StudentExComparable(223, "Chaitanya", 26));
		   arraylist.add(new StudentExComparable(245, "Rahul", 24));
		   arraylist.add(new StudentExComparable(209, "Ajeet", 32));*/

		   Collections.sort(arraylist);
		   
		   /*
		    *   Collections.sort(arraylist); I tried to call the Collections.sort() on the List of Objects
		    * Reason:I Just called the sort method on an ArrayList 
		    * of Objects which actually doesn’t work until unless we use interfaces like Comparable and Comparator.
		    * 
		    */
		   
		   /*
		    * 
		    * Let’s say we need to sort the ArrayList<StudentExComparable> based on the student Age property.
		    *  This is how it can be done – First implement Comparable interface and then Override the compareTo method.
		    */

		   for(StudentExComparable str: arraylist){
				System.out.println(str);
				
				
				
		   }

	}

}
