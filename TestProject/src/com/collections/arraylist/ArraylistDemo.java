package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	List list = new ArrayList();
		
		list.add("Array1");
		list.add("Array2");
		list.add("Array3");
		
		String value=(String) list.get(0);
		System.out.println("value Position"+ value); // it displays value of the index

		System.out.println(list.contains("Array1")); // It returns boolean value
		
		Iterator iterator= list.iterator(); // Iterator traverses through the list 
		
		// While checks for the condition
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		} */
		
		List list = new ArrayList();
		
		Employee empl = new Employee(1, "Jyothi");
		Employee emp2 = new Employee(2, "Mom");
		
		list.add(empl);
		list.add(emp2);
		 System.out.println("Is ArrayList Empty: "+list.isEmpty());// returns true or fase
		
		Iterator iterator= list.iterator();
		while(iterator.hasNext()) {
			Employee emp = (Employee) iterator.next();
			emp.display();
		}

	}

}
