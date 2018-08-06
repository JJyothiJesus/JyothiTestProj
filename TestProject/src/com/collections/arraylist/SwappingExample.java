package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<String> al = new ArrayList<String>();
		 
		    al.add("Sachin"); //0
		    al.add("Rahul"); //1
		    al.add("Saurav"); //2
		    al.add("Sunil");//3
		    al.add("Kapil"); //4
		    al.add("Vinod"); //5

		    System.out.println("ArrayList before Swap:");
		    for(String temp: al){
		        System.out.println(temp);
		    }

		    //Swapping 2nd(index 1) element with the 5th(index 4) element
		    Collections.swap(al, 1, 4);

		    System.out.println("ArrayList after swap:");
		    for(String temp: al){
		       System.out.println(temp);
		    }

	}

}
