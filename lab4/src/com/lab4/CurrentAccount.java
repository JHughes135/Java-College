package com.lab4;

public class CurrentAccount extends Account implements ValidatedAccount {

	double penaltyAmount;
	
	public CurrentAccount(double penamount,
						  String accountName,
						  String sortCode,
						  String branchName,
						  int accountNumber,
						  double acctBalance,
			              boolean inCredit) {
		
		super(accountName, sortCode, branchName, accountNumber, acctBalance, inCredit);
		penaltyAmount = penamount;
	}

	public double getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	
	

}
