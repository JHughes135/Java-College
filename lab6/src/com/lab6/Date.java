package com.lab6;

public class Date {
	
	int day;
	int month;
	int year;
	
	public Date(int day, int month, int year) {
		
		if (day < 1 | day > 31) {
			System.out.println("Day must be between 1 and 31");
		}else {
			this.day = day;
		}
		
		if (month < 1 | month > 12) {
			System.out.println("month must be between 1 and 12");
		}else {
			this.month = month;
		}
		
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return day + "-" + month + "-" + year;
	}
	
	
	
}
