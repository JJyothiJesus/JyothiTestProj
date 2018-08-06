package com.collections.arraylist;

import java.util.Comparator;

public class StudentComparatorEx {
	
	//StudentcompArraylist
	/* Sorting ArrayList<Object> multiple properties with Comparator
	* We are overriding compare method of Comparator for sorting
	* if we want to sort the objects based on any of the data member then we can use Comparable but what 
	* if we want to have multiple sort choices and we can sort objects based on any choice
	*/
	
	 private String studentname;
	    private int rollno;
	    private int studentage;
	    
	    public StudentComparatorEx(int rollno, String studentname, int studentage) {
	        this.rollno = rollno;
	        this.studentname = studentname;
	        this.studentage = studentage;
	    }
	    
		public String getStudentname() {
			return studentname;
		}
		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public int getStudentage() {
			return studentage;
		}
		public void setStudentage(int studentage) {
			this.studentage = studentage;
		}
	    
		 public static Comparator<StudentComparatorEx> StuNameComparator = new Comparator<StudentComparatorEx>() {

				public int compare(StudentComparatorEx s1, StudentComparatorEx s2) {
				   String StudentName1 = s1.getStudentname().toUpperCase();
				   String StudentName2 = s2.getStudentname().toUpperCase();

				   //ascending order
				   return StudentName1.compareTo(StudentName2);

				   //descending order
				   //return StudentName2.compareTo(StudentName1);
			    }};

			    /*Comparator for sorting the list by roll no*/
			    public static Comparator<StudentComparatorEx> StuRollno = new Comparator<StudentComparatorEx>() {

				public int compare(StudentComparatorEx s1, StudentComparatorEx s2) {

				   int rollno1 = s1.getRollno();
				   int rollno2 = s2.getRollno();

				   /*For ascending order*/
				   return rollno1-rollno2;

				   /*For descending order*/
				   //rollno2-rollno1;
			   }};
			    @Override
			    public String toString() {
			        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
			    }    
	
	

}
