package com.lab8;

import java.util.ArrayList;

public class Control 
{
	
	public static void main(String[] args)
	{
	ArrayList<Person> people = new ArrayList<Person>();
	
	Person p1 = new Person("James", "Hughes", "Dublin");
	Person p2 = new Person("Tom", "Murphy", "Paris");
	Person p3 = new Person("Mary", "Walsh", "Cork");
	
	people.add(p1);
	people.add(p2);
	people.add(p3);

	
	for (Person element: people)
	{
		System.out.println(element);
	}
	
	GUI screen = new GUI();
	
	
	}
	
}

