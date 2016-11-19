package com.bank.los.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.bank.los.dto.CustomerDTO;
import com.bank.los.helper.LoanCalculationHelper;
import com.bank.los.wtdb.AppNoWTDB;

import javax.swing.JLabel;

import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoringFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoanCalculationHelper loanCalculationHelper;

	
	
	/**
	 * Launch the application.
	 */
	
	public ScoringFrame(CustomerDTO cust) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 485);
		new JPanel();
		this.getContentPane().setLayout(null);
		
	    loanCalculationHelper=new LoanCalculationHelper(cust);
		
		JLabel lblAmountOfLoan = new JLabel("Amount of Loan Approved");
		lblAmountOfLoan.setBounds(356, 11, 138, 14);
		getContentPane().add(lblAmountOfLoan);
		
		JLabel label = new JLabel(Double.toString(loanCalculationHelper.getLoanValue()));
		label.setBounds(356, 51, 138, 14);
		getContentPane().add(label);
		
		Label label_1 = new Label("Eligible for tenure");
		label_1.setBounds(356, 71, 97, 22);
		getContentPane().add(label_1);
		
		Label label_2 = new Label(Integer.toString(loanCalculationHelper.getTenure()));
		label_2.setBounds(356, 99, 62, 22);
		getContentPane().add(label_2);
		
		Button button = new Button("Proceed with approved loan");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cust.setStage("Loan Approved");
				AppNoWTDB appNoWTDB=new AppNoWTDB(cust);
				appNoWTDB.writeStage();
				dispose();
			}
		});
		button.setBounds(642, 43, 163, 22);
		getContentPane().add(button);
		
		Label label_3 = new Label("Approved");
		label_3.setBounds(50, 43, 62, 22);
		getContentPane().add(label_3);
		
		Label label_4 = new Label("Loan Application");
		label_4.setBounds(50, 315, 87, 22);
		getContentPane().add(label_4);
		
		Label label_5 = new Label("Amount of loan");
		label_5.setBounds(356, 274, 87, 22);
		getContentPane().add(label_5);
		
		Label label_6 = new Label(Double.toString(cust.getLoan().getAmount()));
		label_6.setBounds(465, 274, 62, 22);
		getContentPane().add(label_6);
		
		Label label_7 = new Label("Tenure");
		label_7.setBounds(356, 329, 62, 22);
		getContentPane().add(label_7);
		
		Label label_8 = new Label(Integer.toString(cust.getLoan().getTenure()));
		label_8.setBounds(465, 329, 62, 22);
		getContentPane().add(label_8);
		
		Button button_1 = new Button("Proceed with application");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cust.setStage("Loan Approved");
				AppNoWTDB appNoWTDB=new AppNoWTDB(cust);
				appNoWTDB.writeStage();
				dispose();
			}
		});
		button_1.setBounds(642, 304, 163, 22);
		getContentPane().add(button_1);
	}
}
