package com.capgemini.controller;

public class Employee {
	
	int EmployeeNumber;
	String Name;
	double salary;
	String NameOfDepartment;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeNumber, String name, double salary, String nameOfDepartment) {
		super();
		EmployeeNumber = employeeNumber;
		Name = name;
		this.salary = salary;
		NameOfDepartment = nameOfDepartment;
	}
	public int getEmployeeNumber() {
		return EmployeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		EmployeeNumber = employeeNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getNameOfDepartment() {
		return NameOfDepartment;
	}
	public void setNameOfDepartment(String nameOfDepartment) {
		NameOfDepartment = nameOfDepartment;
	}
	

}
