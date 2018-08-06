package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class StudentCompArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ArrayList<StudentComparatorEx> arraylist = new ArrayList<StudentComparatorEx>();
		   arraylist.add(new StudentComparatorEx(101, "Zues", 26));
		   arraylist.add(new StudentComparatorEx(505, "Abey", 24));
		   arraylist.add(new StudentComparatorEx(809, "Vignesh", 32));

		   /*Sorting based on Student Name*/
		   System.out.println("Student Name Sorting:");
		   Collections.sort(arraylist, StudentComparatorEx.StuNameComparator);

		   for(StudentComparatorEx str: arraylist){
				System.out.println(str);
		   }

		   /* Sorting on Rollno property*/
		   System.out.println("RollNum Sorting:");
		   Collections.sort(arraylist, StudentComparatorEx.StuRollno);
		   for(StudentComparatorEx str: arraylist){
				System.out.println(str);
		   }
		}
	}

