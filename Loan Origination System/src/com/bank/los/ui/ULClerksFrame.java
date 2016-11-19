package com.bank.los.ui;

import java.util.TreeSet;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.bank.los.rfdb.GetValuesRFDB;

import java.awt.Checkbox;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ULClerksFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public ULClerksFrame(String status) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 493);
		new JPanel();
		this.getContentPane().setLayout(null);
		
		Button button_1 = new Button("Back");
		button_1.setBounds(484, 396, 70, 22);
		getContentPane().add(button_1);
		
		
		
		
		
		
		GetValuesRFDB values=new GetValuesRFDB();
		TreeSet<String> locked=values.getLockedClerks();
		TreeSet<String> unlocked=values.getUnlockedClerks();
		int i=62;
		if(status.equalsIgnoreCase("Locked")){
			
			for(String locked1:locked){
			Checkbox checkbox = new Checkbox(locked1);
			checkbox.setBounds(256, i, 95, 22);
			getContentPane().add(checkbox);
			i=i+40;
		}
			Button button = new Button("Unlock");
			button.setBounds(232, 389, 70, 22);
			getContentPane().add(button);
			
		}
		else {
			for(String unlocked1:unlocked){
				Checkbox checkbox = new Checkbox(unlocked1);
				checkbox.setBounds(256, i, 95, 22);
				getContentPane().add(checkbox);
				i=i+40;
			
		}
			Button button = new Button("Lock");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
				});
			button.setBounds(232, 389, 70, 22);
			getContentPane().add(button);
	}
	}
}

