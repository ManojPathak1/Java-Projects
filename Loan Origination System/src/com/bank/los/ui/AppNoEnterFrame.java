package com.bank.los.ui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.bank.los.dto.CustomerDTO;
import com.bank.los.rfdb.ApplicationNoRFDB;
import com.bank.los.rfdb.CustomerRFDB;
import com.bank.los.rfdb.StageRFDB;

import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;

public class AppNoEnterFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ApplicationNoRFDB application;
	String appNo;
	int appNoInt;
	boolean flag;
	String appNoEnter;
	String stage;
	StageRFDB stageRFDB;
	CustomerRFDB customerRFDB;
	CustomerDTO customerDTO;

	public AppNoEnterFrame() {
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 491);
		new JPanel();
		this.getContentPane().setLayout(null);
		
		stageRFDB=new StageRFDB();
		customerRFDB=new CustomerRFDB();
		
		JLabel lblEnterApplicationNumber = new JLabel("Enter Application Number:");
		lblEnterApplicationNumber.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEnterApplicationNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterApplicationNumber.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 16));
		lblEnterApplicationNumber.setBounds(152, 48, 295, 51);
		getContentPane().add(lblEnterApplicationNumber);
		
		TextField textField = new TextField();
		textField.setCursor(Cursor.getPredefinedCursor(Cursor.SW_RESIZE_CURSOR));
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				 appNoEnter=textField.getText();
				
			}
		});
		textField.setBounds(152, 127, 295, 66);
		getContentPane().add(textField);
		
		Button button = new Button("Submit");
		button.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appNoInt=Integer.parseInt(appNoEnter);
				
				stage=stageRFDB.readStage(appNoInt);
				if(stage.equalsIgnoreCase("QDE")){
					customerDTO=customerRFDB.readQDE(appNoInt);
					QDEFrame qdeFrame=new QDEFrame(customerDTO);
					qdeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					qdeFrame.setVisible(true);
					dispose();
				}
				else if(stage.equalsIgnoreCase("SummaryInfo")){
					customerDTO=customerRFDB.read(appNoInt);
					SummaryFrame summaryFrame=new SummaryFrame(customerDTO);
					summaryFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					summaryFrame.setVisible(true);
					dispose();
				}
				else if(stage.equalsIgnoreCase("Scoring")){
					customerDTO=customerRFDB.read(appNoInt);
					ScoringFrame scoringFrame=new ScoringFrame(customerDTO);
					scoringFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					scoringFrame.setVisible(true);
					dispose();
				}
				else{
					
				}
			}
		});
		button.setBounds(152, 229, 103, 22);
		getContentPane().add(button);
		
		Button button_1 = new Button("Reset");
		button_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(377, 229, 70, 22);
		getContentPane().add(button_1);
		
		Button button_2 = new Button("New Customer");
		button_2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SourcingFrame frame=new SourcingFrame();
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				frame.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(231, 338, 178, 22);
		getContentPane().add(button_2);
	}
	}
	

