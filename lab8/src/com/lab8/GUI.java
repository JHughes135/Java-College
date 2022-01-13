package com.lab8;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


public class GUI extends javax.swing.JFrame {
	
	JFrame frame;
	JTextField fnText, snText, cityText;
	JButton button, button2;
	String firstName, surName, city;
	JPanel panel;
	JTextArea text;
	ArrayList<Person> people = new ArrayList<Person>();
	
	public GUI() {
		super("lab 8");
			
		frame = new JFrame("Lab 8");
		fnText = new JTextField("FirstName");
		snText = new JTextField("SurName");
		cityText = new JTextField("City");
	
		button = new JButton("Save");
		button2 = new JButton("Show all");
		
		button.addActionListener((e)-> {
			saveInput();
		});
		
		
		button2.addActionListener((e) -> {
			displayText();
		});
	
		panel = new JPanel();
	
		panel.add(fnText);
		panel.add(snText);
		panel.add(cityText);
		panel.add(button);
		panel.add(button2);
	
		frame.setSize(1200, 600);
		frame.add(panel);
		frame.setVisible(true);
		
		
	
	}
	
	private void saveInput()
	{
		firstName = fnText.getText();
		surName = snText.getText();
		city = cityText.getText();
		
		Person p1 = new Person(firstName, surName, city);
		
		people.add(p1);
		
		String output = "You added a new Person called " + firstName + " " + surName + " from " + city;
		
		
		JOptionPane.showMessageDialog(frame, output);
	
	}
	
	private void displayText() {
		
		text = new JTextArea(
				
				for (Person element : people) {
					System.out.println(element);
					
				});	
		
		panel.add(text);
		
	}

}
