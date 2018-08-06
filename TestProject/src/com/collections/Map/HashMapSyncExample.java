package com.collections.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSyncExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 HashMap<Integer, String> hmap= new HashMap<Integer, String>();
		 hmap.put(2, "Anil");
         hmap.put(44, "Ajit");
         hmap.put(1, "Brad");
         hmap.put(4, "Sachin");
         hmap.put(88, "Jyothi");
         
         System.out.println("HashMap : " + hmap);
         	
         Map map= Collections.synchronizedMap(hmap);
         
         System.out.println("Map : " + map);
         
         Set set = map.entrySet();
         
         System.out.println("Set : " + set);
         
         synchronized(map){
        	 
        	 System.out.println("synchronized map: "+ map);
             Iterator i = set.iterator();
             // Display elements
             while(i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
             }
         }
         
	}

}


