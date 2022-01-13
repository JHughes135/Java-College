package com.lab3;

public class Control {

	public static void main(String args[]) {
		Employee E1 = new Employee("James", "Hughes", 21, 85000.00);
		System.out.println(E1);

		HourlyEmployee HE1 = new HourlyEmployee("Jim", "Murphy", 48, 13.00);
		System.out.println(HE1);
	}

}
