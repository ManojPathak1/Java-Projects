package com.bank.los.ui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.bank.los.dto.ApplicationNoDTO;
import com.bank.los.dto.CustomerDTO;
import com.bank.los.rfdb.ApplicationNoRFDB;

import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppNoGenerationFrame extends JFrame {

	
	private static final long serialVersionUID = 1L;
	ApplicationNoRFDB application;
	int appNo;
	ApplicationNoDTO app;
	String applicationNo;
	
	public AppNoGenerationFrame(CustomerDTO cust) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 489);
		new JPanel();
		this.getContentPane().setLayout(null);
		
		JLabel lblYourApplicationNo = new JLabel("Your Application No. is :");
		lblYourApplicationNo.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		lblYourApplicationNo.setBounds(10, 126, 178, 55);
		getContentPane().add(lblYourApplicationNo);
		
		
		
		
		appNo=cust.getApplication().getAppNo();
		applicationNo=Integer.toString(appNo);
				
		Label label = new Label(applicationNo);
		label.setBounds(194, 126, 286, 55);
		getContentPane().add(label);
		
		Button button = new Button("OK, Proceed");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				QDEFrame frame=new QDEFrame(cust);
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setVisible(true);
				dispose();
			}
		});
		button.setBounds(194, 295, 70, 22);
		getContentPane().add(button);
		
		Button button_1 = new Button("Quit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

				
			}
		});
		button_1.setBounds(410, 295, 70, 22);
		getContentPane().add(button_1);
	}

}
