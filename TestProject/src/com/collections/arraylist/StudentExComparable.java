package com.collections.arraylist;

public abstract  class StudentExComparable implements Comparable{
	
	/*Since Comparable is implemented by the same class whose objects are sorted so 
	it binds you with that sorting logic which is ok in most of the
	cases but in case you want to have more than way of sorting your class objects you should use comparators */
	
	//public class StudentExComparable implements Comparable{
	
	
	private String studentname;
    private int rollno;
    private int studentage;
    
	public StudentExComparable(int rollno, String studentname, int studentage) {
		
		this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
	         
		// TODO Auto-generated constructor stub
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
    
	    @Override
	    public String toString() {
	        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	    }
	    
	    public int compareTo(StudentExComparable comparestu) {
			
			int compareage=((StudentExComparable)comparestu).getStudentage();
	        /* For Ascending order*/

			// TODO Auto-generated method stub
			return this.studentage-compareage;
		}

	
	
}
