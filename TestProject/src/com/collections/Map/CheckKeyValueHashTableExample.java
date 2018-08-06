package com.collections.Map;

import java.util.Hashtable;

public class CheckKeyValueHashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a Hashtable instance
		   Hashtable<String, String> hashtable = new Hashtable<String, String>();
		 
		   // Adding key-value pairs to Hashtable
		   hashtable.put("A", "Apple");
		   hashtable.put("B", "Orange");
		   hashtable.put("C", "Mango");
		   hashtable.put("D", "Banana");
		   hashtable.put("E", "Grapes");
		 
		   /* Checking Key existence using containsKey() method.
		    * boolean containsKey(Object key) method returns true if the 
		    * Hashtable contains the key, otherwise it returns false.
		    */
		   boolean keyFlag1 = hashtable.containsKey("A");
		   System.out.println("Key A exists in Hashtable?: " + keyFlag1);
		   
		   boolean keyFlag2 = hashtable.containsKey("D");
		   System.out.println("Key D exists in Hashtable?: " + keyFlag2);
		   
		   boolean keyFlag3 = hashtable.containsKey("G");
		   System.out.println("Key G exists in Hashtable?: " + keyFlag3);
		
		   /* Checking Value existence using containsValue() method.
		    * boolean containsKey(Object key) method Returns true 
		    * if this Hashtable maps one or more keys to this value..
		    */
		   boolean vFlag1 = hashtable.containsValue("Orange");
		   System.out.println("Value Orange exists in Hashtable?: "+vFlag1);
		   
		   boolean vFlag2 = hashtable.containsValue("XYZ");
		   System.out.println("Value XYZ exists in Hashtable?: "+vFlag2);
		   
		   boolean vFlag3 = hashtable.containsValue("Apple");
		   System.out.println("Value Apple exists in Hashtable?: "+vFlag3);
		
	}

}
