package com.collections.Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class IterateHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a Hashtable instance
	    Hashtable<String, String> hashtable = new Hashtable<String, String>();
	 
	    /* Adding key-value pairs to Hashtable
	     * public V put(K key, V value): Maps the specified key to the 
	     * specified value in this hashtable. Neither the key nor the 
	     * value can be null. The value can be retrieved by calling the 
	     * get method with a key that is equal to the original key.
	     * 
	     * in this example how to iterate a Hashtable using Iterator.
	     *  Using Iterator we can display Hashtable key and value separately for each pair of elements.
	     * 
	     * 
	     */
	    hashtable.put("A", "Apple");
	    hashtable.put("B", "Orange");
	    hashtable.put("C", "Mango");
	    hashtable.put("D", "Banana");
	    hashtable.put("E", "Grapes");
	 
	    System.out.println("Hashtable contains:");
	 
	    /* public Set<K> keySet(): Returns a Set view of the keys 
	     * contained in this map. The set is backed by the map, 
	     * so changes to the map are reflected in the set, and 
	     * vice-versa.
	     */
		
	    Set<String> keys = hashtable.keySet();
	    
	    
	    //Obtaining iterator over set entries
	    Iterator<String> itr = keys.iterator();
	  //Displaying Key and value pairs
	    while (itr.hasNext()) { 
	       // Getting Key
	     String  str = itr.next();

	       /* public V get(Object key): Returns the value to which 
	        * the specified key is mapped, or null if this map 
	        * contains no mapping for the key.
	        */
	       System.out.println("Key: "+str+" & Value: "+hashtable.get(str));
	    } 
	    
	    
	}

}
