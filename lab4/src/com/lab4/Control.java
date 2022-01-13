package com.lab4;
import java.util.Scanner;

public class Control {
	

	public static void main(String args[]) {
		
		Account A1 = new Account("James Hughes", "A1568d4", "DIT", 26584952, 584.52, false);
		DepositAccount DA1 = new DepositAccount(2.3, "Jim Murphy", "D15472f", "DIT", 1547854, 2406.32, false);
		CurrentAccount CA1 = new CurrentAccount(200, "Micheal", "D164dd2", "DIT", 6584256, 802.35, false);
				System.out.println(A1);
				
				A1.deposit();
				
				System.out.println(A1);
				
				A1.withdraw();
				
				System.out.println(A1);
				
				DA1.withDraw();

				
	
				
		
	}

}
