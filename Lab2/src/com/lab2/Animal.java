package com.lab2;

public class Animal 
{
	private String name, breed, colour;
	private int age,no_of_legs;
	private boolean domestic;
	private boolean old;
	
	public Animal(String name)
	{
		this.name = name;
	}
	
	public String getBreed() 
	{
		return breed;
	}

	public void setBreed(String breed) 
	{
		this.breed = breed;
	}

	public String getColour() 
	{
		return colour;
	}

	public void setColour(String colour) 
	{
		this.colour = colour;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public int getNo_of_legs() 
	{
		return no_of_legs;
	}

	public void setNo_of_legs(int no_of_legs) 
	{
		this.no_of_legs = no_of_legs;
	}

	public boolean isDomestic() 
	{
		return domestic;
	}

	public void setDomestic(boolean domestic) 
	{
		this.domestic = domestic;
	}

	public String getName() 
	{
		return name;
	}

	public Animal(String name, String breed, String colour, int age, int no_of_legs, boolean domestic, boolean old)
	{
		this.name = name;
		this.breed = breed;
		this.colour = colour;
		this.age = age;
		this.no_of_legs = no_of_legs;
		this.domestic = domestic;
		this.old = old;
				
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	
	public void makeNoise()
	{
		
		if (old == true)
		{
			System.out.println("Quiet Animal");
		}
		else if (old == false)
		{
			if (breed.equals("Dog"))
			{
				System.out.println("Bark");
			}
			else if (breed.equals("Cat"))
			{
				System.out.println("Miaow");
			}
		}
	}
			
	
	
	public String toString()
	{
		String sentence = "The Animal is called " + name + ", it is a " + breed + " that is " + colour + ", has " + no_of_legs + " legs" +  " and ";
				
		if (domestic == true)
			{
				sentence += "is domestic";
			}
		else if(domestic == false)
			{
				sentence += "is not domestic";
			}
		
	return sentence;
	}
}
