package com.lab3;

public class Employee {
	String firstName, surName;
	int staffNumber;
	double annualSalary;

	public Employee(String firstName, String surName, int staffNumber, double annualSalary) {
		this.firstName = firstName;
		this.surName = surName;
		this.staffNumber = staffNumber;
		this.annualSalary = annualSalary;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double calculatePay() {
		double monthlyPay = (annualSalary / 12);

		return monthlyPay;
	}

	public String toString() {
		String sentence = "This Employee is called " + firstName + " " + surName + ", has a salary of €" + annualSalary
				+ " and is staff number " + staffNumber;

		return sentence;
	}
}
