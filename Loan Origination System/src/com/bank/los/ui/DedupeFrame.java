package com.bank.los.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.bank.los.dto.CustomerDTO;
import com.bank.los.wtdb.AppNoWTDB;

import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DedupeFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DedupeFrame(boolean arr[],CustomerDTO cust) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 489);
		new JPanel();
		this.getContentPane().setLayout(null);
		
		Label label = new Label("Record Matched");
		label.setBounds(328, 10, 93, 22);
		getContentPane().add(label);
		
		Label label_2;
		if(arr[0]){
		 label_2 = new Label("Name Matched");
		}
		else{
			 label_2 = new Label("Name not Matched");
		}
		label_2.setBounds(328, 66, 62, 22);
		getContentPane().add(label_2);
		
		Label label_3;
		if(arr[1]){
		 label_3 = new Label("Birth date Matched.");
		}
		else{
			label_3 = new Label("Birth date not matched.");
		}
		label_3.setBounds(328, 94, 62, 22);
		getContentPane().add(label_3);
		
		Label label_4;
		if(arr[2]){
		 label_4 = new Label("Phone number matched.");
		}
		else{
			label_4 = new Label("Phone number not matched.");
		}
		label_4.setBounds(328, 122, 62, 22);
		getContentPane().add(label_4);
		
		Label label_1;
		if(arr[3]){
		 label_1 = new Label("Voter id matched.");
		}
		else{
			label_1 = new Label("Voter id not matched.");
		}
		label_1.setBounds(328, 38, 62, 22);
		getContentPane().add(label_1);
		
		Label label_5;
		if(arr[4]){
		 label_5 = new Label("License matched.");
		}
		else{
			label_5 = new Label("License not matched.");
		}
		label_5.setBounds(328, 150, 62, 22);
		getContentPane().add(label_5);
		
		Label label_6;
		if(arr[5]){
		 label_6 = new Label("Pan number matched.");
		}
		else{
			label_6 = new Label("Pan number not matched.");
		}
		label_6.setBounds(328, 178, 62, 22);
		getContentPane().add(label_6);
		
		Label label_7;
		if(arr[6]){
		 label_7 = new Label("Nationality matched.");
		}
		else{
			label_7 = new Label("Nationality not matched.");
		}
		label_7.setBounds(328, 206, 62, 22);
		getContentPane().add(label_7);
		
		Label label_8;
		if(arr[7]){
		 label_8 = new Label("Email matched.");
		}
		else{
			label_8 = new Label("Email not matched.");
		}
		label_8.setBounds(328, 234, 62, 22);
		getContentPane().add(label_8);
		
		Button button = new Button("Proceed Request");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cust.setStage("Scoring");
				AppNoWTDB appNoWTDB=new AppNoWTDB(cust);
				appNoWTDB.writeStage();
				ScoringFrame scoringFrame = new ScoringFrame(cust);
				scoringFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				scoringFrame.setVisible(true);
				dispose();
			}
		});
		button.setBounds(105, 418, 93, 22);
		getContentPane().add(button);
		
		Button button_1 = new Button("Cancel Loan Request");
		button_1.setBounds(543, 418, 151, 22);
		getContentPane().add(button_1);
	}
}
