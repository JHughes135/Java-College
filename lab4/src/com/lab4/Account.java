package com.lab4;
import java.util.Scanner;


public class Account implements ValidatedAccount {

	String accountName, sortCode, branchName;
	int accountNumber;
	double acctBalance;
	boolean inCredit;
	
	public Account(String accountName,
				   String sortCode,
				   String branchName,
				   int accountNumber,
				   double acctBalance,
				   boolean inCredit) {
		
		this.accountName = accountName;
		this.sortCode = sortCode;
		this.branchName = branchName;
		this.accountNumber = accountNumber;
		this.acctBalance = acctBalance;
		this.inCredit = inCredit;
	}

	

	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public String getSortCode() {
		return sortCode;
	}



	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}



	public String getBranchName() {
		return branchName;
	}



	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}



	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public double getAcctBalance() {
		return acctBalance;
	}



	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}



	public boolean isInCredit() {
		return inCredit;
	}



	public void setInCredit(boolean inCredit) {
		this.inCredit = inCredit;
	}



	public String toString() {
		return "Account [accountName=" + accountName + ", sortCode=" + sortCode + ", branchName=" + branchName
				+ ", accountNumber=" + accountNumber + ", acctBalance=" + acctBalance + ", inCredit=" + inCredit + "]";
	}


	public double deposit()
	{
			
		double depAmount, balance;
		System.out.println("Enter ammount to deposit : ");
		Scanner scanner = new Scanner(System.in);
		depAmount = scanner.nextDouble();
		
		balance = getAcctBalance() + depAmount;
		setAcctBalance(balance);
		
		return balance;
		
	}
	
	public double withdraw()
	{
		double wdAmount, balance;
		System.out.println("Enter ammount to withdraw : ");
		Scanner scanner = new Scanner(System.in);
		wdAmount = scanner.nextDouble();
		
		balance = getAcctBalance() - wdAmount;
		setAcctBalance(balance);
		
		return balance;
		
	}
}
