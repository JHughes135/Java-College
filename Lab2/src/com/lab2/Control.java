package com.lab2;

import java.util.Scanner;

public class Control 
{
	public static void main(String args[])
	{
		Animal A1 = new Animal("Spot","Dog","brown",8, 4,true, true);
		Animal A2 = new Animal("Leo","Horse","white",5, 3,false, false);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the animals name: ");
		String inputString = input.nextLine();
		System.out.print("You entered : ");
		System.out.println(inputString);
		
		A2.setName("Sam");
		A2.setBreed("Cat");
		
		A1.makeNoise();
		System.out.println(A1);
		A2.makeNoise();
		System.out.println(A2);
		
		System.out.println(A2.getColour());
	}
	
	
}
