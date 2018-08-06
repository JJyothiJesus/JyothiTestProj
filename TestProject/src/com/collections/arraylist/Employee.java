package com.collections.arraylist;

public class Employee {
	private int empId;
	private String empName;
	
	
	public Employee(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void display() {
		
		System.out.println("EmpId : "+ empId + "EmpName :" + empName);
	}
	
}
