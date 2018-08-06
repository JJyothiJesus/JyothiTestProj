package com.collections.Set;

import java.util.HashSet;
import java.util.TreeSet;

public class ConvertHashSettoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a HashSet
		HashSet<String> hset = new HashSet<String>();

		//add elements to HashSet
		hset.add("Steve");
		hset.add("Matt");
		hset.add("Govinda");
		hset.add("John");
		hset.add("Tommy");

		// Displaying HashSet elements
		System.out.println("HashSet contains:" + hset);

		// Creating a List of Treeset elements
		TreeSet<String> list = new TreeSet<String>(hset);

		// Displaying ArrayList elements
		System.out.println("TreeSet contains: "+ list);
		}
		
	}


