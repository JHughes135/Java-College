package com.lab4;

public class DepositAccount extends Account implements ValidatedAccount{
	
	double interestRate;

	public DepositAccount(double Rate,
						  String accountName,
						  String sortCode,
						  String branchName,
						  int accountNumber,
						  double acctBalance,
						  boolean inCredit) 
	{

		super(accountName, sortCode, branchName, accountNumber, acctBalance, inCredit);
		interestRate = Rate;
	}
	
	
	public String getDetails() {
		
		return "Account Type = " + 
	}

	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double newRate) {
		interestRate = newRate;
	
	}

	public void withDraw()
	{
		System.out.println("You cannot withdraw from a current account");
	}
	
	
	public String toString() {
		return "DepositAccount [interestRate=" + interestRate + ", accountName=" + accountName + ", sortCode="
				+ sortCode + ", branchName=" + branchName + ", accountNumber=" + accountNumber + ", acctBalance="
				+ acctBalance + ", inCredit=" + inCredit + "]";
	}
	
		
	}
