package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* Array Declaration and initialization*/
		String citynamesofarray[]= {"Agra","Bangalore","Hyderabad","Vijayawada","Chennai"} ;
		
		
		/*Array to ArrayList conversion*/
		ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynamesofarray));
		
		  /*Adding new elements to the converted List*/
		  citylist.add("New Hyderabad");
		  citylist.add("New Vijayawada");
		  
		  /*Final ArrayList content display using for*/
		  for (String str: citylist)
		  {
			System.out.println(str);
	       	 }


	}

	}
