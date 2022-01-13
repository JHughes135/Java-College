package com.lab5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Screen extends javax.swing.JFrame implements ActionListener{

	JButton button, button2;
	JTextField text;

	public Screen() {
		super("lab5");
	
		JFrame frame = new JFrame("Lab5");
		text = new JTextField("Name");
		button = new JButton("Click Here");
		button2 = new JButton("Another Button");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Label");
		JCheckBox box = new JCheckBox("Option 1");
		
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.add(panel);
		panel.setLayout(new FlowLayout());
	
		frame.setVisible(true);
		frame.setSize(600, 400);
		panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
		panel.add(box);
		panel.add(text);
		panel.add(button);
		panel.add(button2);
		panel.add(label);
		
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button)
		{
		 JOptionPane.showMessageDialog(this, "My First event!");
		}
		
		else if(e.getSource() == button2)
		{
			 JOptionPane.showMessageDialog(this, "My Second event!");
		}
		
	}
}
