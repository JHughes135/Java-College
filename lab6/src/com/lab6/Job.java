package com.lab6;

public class Job {
	
	double salary;
	String role; 
	int jobID;
	
	public Job(double salary, String role, int jobID) {
		
		this.salary = salary;
		this.role = role;
		this.jobID = jobID;
		
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public String toString() {
		return "salary = " + salary + " role = " + role + " JobID = " + jobID ;
	}
	
	
	
}
