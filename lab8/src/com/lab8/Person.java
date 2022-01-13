package com.lab8;

public class Person {
	
	String firstName;
	String surName;
	String city;
	
	public Person(String firstName, String surName, String city)
	{
		this.firstName = firstName;
		this.surName = surName;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", surName=" + surName + ", city=" + city + "]";
	}

	
	
}
