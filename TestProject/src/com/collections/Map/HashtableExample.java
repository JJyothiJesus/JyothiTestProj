package com.collections.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Enumeration names;
		   String key;*/
		 
		   // Creating a Hashtable---  dosent maintain insertion order
		   
		   Hashtable<String, String> hashtable =  new Hashtable<String, String>();
		 
		   // Adding Key and Value pairs to Hashtable
		   hashtable.put("Key1","Chaitanya");
		   hashtable.put("Key2","Jyothi");
		   hashtable.put("Key3","Obaid");
		   hashtable.put("Key4","Chotu");
		   hashtable.put("Key5","Rasheeda");
		 
		   Enumeration  names = hashtable.keys();
		   
		   while(names.hasMoreElements()) {
			   String  key = (String) names.nextElement();
		      System.out.println("Key: " +key+ " & Value: " +
		      hashtable.get(key));
		   }
	}

}
