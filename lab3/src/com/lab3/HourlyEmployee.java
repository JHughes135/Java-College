package com.lab3;

public class HourlyEmployee extends Employee {

	double hourlyRate = 13.00;
	double hoursWorked = 28;

	public HourlyEmployee(String firstName, String surName, int staffNumber, double hourlyRate) {
		super(firstName, surName, staffNumber, hourlyRate);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		double pay = (hourlyRate * hoursWorked);

		String sentence = "This Employee is called " + firstName + " " + surName + ", he will get paid €" + pay
				+ " this week,  and is staff number " + staffNumber;

		return sentence;
	}

}
