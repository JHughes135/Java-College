package com.lab6;

public class Employee extends Person {
	
	Job job;
	int personnelNumber;
	Date startDate;
	static int nextNumber;
	
	
	public Employee(String firstName, String surName, String gender, int personnelNumber) {
		
		super(firstName, surName, gender);
		this.personnelNumber = nextNumber;
		nextNumber ++;
		
		System.out.println("Enter Start Date");
		System.out.println("Day: ");
		int day = scan.nextInt();
		
		System.out.println("Month: ");
		int month = scan.nextInt();
		
		System.out.println("Year: ");
		int year = scan.nextInt();
		
		startDate = new Date(day, month, year);
		
		
		System.out.println("Salary: ");
		int salary = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Role: ");
		String role = scan.nextLine();
		
		System.out.println("JobID: ");
		int jobID = scan.nextInt();
		
		job = new Job(salary, role, jobID);
	}


	
	public String toString() {
		return "personnelNumber=" + personnelNumber + ", startDate=" + startDate
				+ ", firstName=" + firstName + ", surName=" + surName + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth;
	}


	
	

}
