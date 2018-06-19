package com.programming.SearchElementFromUserDefinedCollection;

public class EmployeeDetails {
	public String FName;
	private String LName;
	private int age;
	private double salary;

	public EmployeeDetails() {

	}

	public EmployeeDetails(String FName) {
		this.FName = FName;
	}

	public EmployeeDetails(int age) {
		this.age = age;
	}

	public EmployeeDetails(double salary) {
		this.salary = salary;
	}

	public EmployeeDetails(String FName, String LName, int age, double salary) {
		this.FName = FName;
		this.LName = LName;
		this.age = age;
		this.salary = salary;
	}

	public String getFName() {
		return FName;
	}

	public String getLName() {
		return LName;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public void setFName(String FName) {
		this.FName = FName;
	}

	public void setLName(String LName) {
		this.LName = LName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getSalary(double salary) {
		this.salary = salary;
	}

//	public String toString() {
	//	return "EmployeeDetails[FName :" + FName + ", age :=" + age + ", salary :" + salary + "]";
	//}
}
