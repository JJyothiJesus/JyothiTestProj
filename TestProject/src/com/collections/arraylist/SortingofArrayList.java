package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingofArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("US");
		   listofcountries.add("China");
		   listofcountries.add("Denmark");
		   
		   /*Unsorted List*/
		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

		   /* Sort statement*/
		   Collections.sort(listofcountries);

		   /* Sorted List*/
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		   		   
		   ArrayList<Integer> arraylist = new ArrayList<Integer>();
		   arraylist.add(11);
		   arraylist.add(2);
		   arraylist.add(7);
		   arraylist.add(3);
		   /* ArrayList before the sorting*/
		   System.out.println("Before Sorting:");
		   for(int counter: arraylist){
				System.out.println(counter);
			}

		   /* Sorting of arraylist using Collections.sort*/
		   Collections.sort(arraylist);

		   /* ArrayList after sorting*/
		   System.out.println("After Sorting:");
		   for(int counter: arraylist){
				System.out.println(counter);
			}
		   
		   
		   /* Sorting in decreasing order*/
		   Collections.sort(listofcountries, Collections.reverseOrder());

		   /* Sorted List in reverse order*/
		   System.out.println("listofcountries in descending order:");
		   for(String str: listofcountries){
				System.out.println(str);
			}
		   
	}

}
