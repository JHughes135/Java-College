package com.lab6;

import java.util.Scanner;

public class Person {

	
	String firstName, surName, gender;
	Date dateOfBirth;
	Scanner scan = new Scanner(System.in);
	
	public Person(String firstName, String surName, String gender) {
		
		this.gender = gender;
		this.firstName = firstName;
		this.surName = surName;
		
		System.out.println("Date of Birth");

		System.out.println("Day: ");
		int day = scan.nextInt();
		
		System.out.println("Month: ");
		int month = scan.nextInt();
		
		System.out.println("Year: ");
		int year = scan.nextInt();
		
		dateOfBirth = new Date(day, month, year);
		
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return firstName + " " + surName + " " + gender + " " + dateOfBirth;
	}
	
	
	
	
}
