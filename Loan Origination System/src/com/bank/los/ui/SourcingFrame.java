package com.bank.los.ui;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.TreeSet;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.bank.los.dto.ApplicationNoDTO;
import com.bank.los.dto.BirthDTO;
import com.bank.los.dto.CustomerDTO;
import com.bank.los.dto.LoanDTO;
import com.bank.los.helper.ValidityHelper;
import com.bank.los.rfdb.ApplicationNoRFDB;
import com.bank.los.rfdb.GetValuesRFDB;
import com.bank.los.rfdb.LoanRFDB;
import com.bank.los.wtdb.AppNoWTDB;
import com.bank.los.wtdb.CustomerWTDB;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class SourcingFrame extends JFrame {
	
	TreeSet<Integer> year;
	GetValuesRFDB values;
	CustomerDTO cust;
    ValidityHelper validity;
    boolean isLeapYear;
    int noOfDays;
    String yearSelected;
    BirthDTO birth;
    LoanDTO loan;
    LoanRFDB read;
    TreeSet<String> typeOfLoan;
    TreeSet<Integer> tenures;
    CustomerWTDB customer;
    ApplicationNoRFDB application;
	
	private static final long serialVersionUID = 1L;
	public SourcingFrame() {
		setForeground(Color.WHITE);
		getContentPane().setBackground(SystemColor.inactiveCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 599);
		new JPanel();
		this.getContentPane().setLayout(null);
		
		Label label = new Label("First Name");
		label.setFont(new Font("AR JULIAN", Font.BOLD, 14));
		label.setBounds(10, 113, 84, 22);
		getContentPane().add(label);
		
		cust=new CustomerDTO();
		TextField textField = new TextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				cust.setFirstName(textField.getText());
			}
		});
		textField.setBounds(118, 113, 109, 28);
		getContentPane().add(textField);
		
		Label label_1 = new Label("Middle Name");
		label_1.setFont(new Font("AR JULIAN", Font.BOLD, 14));
		label_1.setBounds(272, 113, 97, 22);
		getContentPane().add(label_1);
		
		TextField textField_1 = new TextField();
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				cust.setMiddleName(textField_1.getText());
			}
		});
		textField_1.setBounds(387, 113, 109, 28);
		getContentPane().add(textField_1);
		
		Label label_2 = new Label("Last Name");
		label_2.setFont(new Font("AR JULIAN", Font.BOLD, 14));
		label_2.setBounds(552, 113, 86, 22);
		getContentPane().add(label_2);
		
		TextField textField_2 = new TextField();
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				cust.setLastName(textField_2.getText());
			}
		});
		textField_2.setBounds(665, 113, 109, 28);
		getContentPane().add(textField_2);
		
		Label label_3 = new Label("Date Of Birth");
		label_3.setFont(new Font("AR JULIAN", Font.BOLD, 14));
		label_3.setBounds(10, 166, 98, 22);
		getContentPane().add(label_3);
		
		values=new GetValuesRFDB();
		validity=new ValidityHelper();

		birth=new BirthDTO();
		year=values.yearsAdded();
		
		Choice choice_1 = new Choice();
		choice_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		choice_1.setBounds(231, 166, 97, 20);
		getContentPane().add(choice_1);
		choice_1.add("January");
		choice_1.add("Febuary");
		choice_1.add("March");
		choice_1.add("April");
		choice_1.add("May");
		choice_1.add("June");
		choice_1.add("July");
		choice_1.add("August");
		choice_1.add("September");
		choice_1.add("October");
		choice_1.add("November");
		choice_1.add("December");
		birth.setMonth(choice_1.getSelectedItem());
		
		Choice choice_2 = new Choice();
		choice_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		choice_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				birth.setDate(Integer.parseInt(choice_2.getSelectedItem()));
			}
		});
		
		Choice yearChoice = new Choice();
		yearChoice.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		for(int singleYear:year){
			yearChoice.add(Integer.toString(singleYear));
		}
		yearSelected=yearChoice.getSelectedItem();
		noOfDays=validity.numberOfDays(choice_1.getSelectedItem());
        for(int i=1;i<=noOfDays;i++){
        	choice_2.add(Integer.toString(i));
        }

		birth.setDate(Integer.parseInt(choice_2.getSelectedItem()));
		
			if(validity.isleapYear(Integer.parseInt(yearSelected))){
				choice_2.removeAll();
				for(int i=1;i<=noOfDays+1;i++){
					choice_2.add(Integer.toString(i));
			}
		}
			else if(validity.isleapYear(Integer.parseInt(yearSelected)))
			{
				choice_2.removeAll();
				for(int i=1;i<=noOfDays;i++){
					choice_2.add(Integer.toString(i));
			}
			}
			
			birth.setYear(Integer.parseInt(yearChoice.getSelectedItem()));
		yearChoice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				yearSelected=yearChoice.getSelectedItem();
			noOfDays=validity.numberOfDays(choice_1.getSelectedItem());
				if(validity.isleapYear(Integer.parseInt(yearSelected))){
					for(int i=1;i<=noOfDays+1;i++){
						choice_2.add(Integer.toString(i));
					}
				}
				else if(!validity.isleapYear(Integer.parseInt(yearSelected))){
					choice_2.removeAll();
					for(int i=1;i<=noOfDays;i++){
						choice_2.add(Integer.toString(i));
					}
				}
				birth.setYear(Integer.parseInt(yearChoice.getSelectedItem()));
			}
		});
		yearChoice.setBounds(122, 166, 84, 28);
		getContentPane().add(yearChoice);
		
		
		
		
		

		
		choice_2.setBounds(352, 166, 42, 20);
		getContentPane().add(choice_2);
		
		choice_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				noOfDays=validity.numberOfDays(choice_1.getSelectedItem());
				isLeapYear=validity.isleapYear(Integer.parseInt(yearChoice.getSelectedItem()));
				if(noOfDays>=30){
					choice_2.removeAll();
				for(int i=1;i<=noOfDays;i++){
					choice_2.add(Integer.toString(i));
				}
				}
				else if(isLeapYear){
					choice_2.removeAll();
					for(int i=1;i<=noOfDays+1;i++){
						choice_2.add(Integer.toString(i));
					}
				}
					else if(!isLeapYear)
					{
						choice_2.removeAll();
						for(int i=1;i<=noOfDays;i++){
							choice_2.add(Integer.toString(i));
						}
					}
				birth.setMonth(choice_1.getSelectedItem());
			}	
		});
		
		
	
		
	
		
		
		
		
		
		
		Label label_4 = new Label("Gender");
		label_4.setFont(new Font("AR JULIAN", Font.BOLD, 14));
		label_4.setBounds(10, 221, 62, 22);
		getContentPane().add(label_4);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		rdbtnMale.setBackground(SystemColor.inactiveCaption);
		rdbtnMale.setForeground(Color.BLACK);
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cust.setGender(rdbtnMale.getText());
			}
		});
		rdbtnMale.setBounds(109, 220, 67, 23);
		getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		rdbtnFemale.setBackground(SystemColor.inactiveCaption);
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cust.setGender(rdbtnFemale.getText());
			}
		});
		rdbtnFemale.setBounds(193, 221, 109, 23);
		getContentPane().add(rdbtnFemale);
		
		ButtonGroup group=new ButtonGroup();
		group.add(rdbtnMale);
		group.add(rdbtnFemale);
		
		Label label_5 = new Label("Nationality");
		label_5.setFont(new Font("AR JULIAN", Font.BOLD, 14));
		label_5.setBounds(10, 277, 84, 22);
		getContentPane().add(label_5);
		
		Choice choiceNationality = new Choice();
		choiceNationality.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		cust.setNationality(choiceNationality.getSelectedItem());
		TreeSet<String> nationalities=values.getNationalities();
		for(String singleNationality:nationalities){
			choiceNationality.add(singleNationality);
		}
		cust.setNationality(choiceNationality.getSelectedItem());
		choiceNationality.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				cust.setNationality(choiceNationality.getSelectedItem());
			}
		});
		choiceNationality.setBounds(113, 279, 130, 28);
		getContentPane().add(choiceNationality);
		
		Label label_6 = new Label("Phone");
		label_6.setFont(new Font("AR JULIAN", Font.BOLD, 14));
		label_6.setBounds(370, 336, 62, 22);
		getContentPane().add(label_6);
		
		TextField textField_3 = new TextField();
		textField_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				cust.setPhone(textField_3.getText());
			}
		});
		textField_3.setBounds(451, 336, 139, 28);
		getContentPane().add(textField_3);
		
		Label label_7 = new Label("Email ID");
		label_7.setFont(new Font("AR JULIAN", Font.BOLD, 14));
		label_7.setBounds(10, 336, 62, 22);
		getContentPane().add(label_7);
		
		TextField textField_4 = new TextField();
		textField_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				cust.setEmailId(textField_4.getText());
			}
		});
		
		textField_4.setBounds(92, 336, 212, 28);
		getContentPane().add(textField_4);
		
		Label label_8 = new Label("Type Of Loan");
		label_8.setFont(new Font("AR JULIAN", Font.BOLD, 14));
		label_8.setBounds(10, 392, 98, 22);
		getContentPane().add(label_8);
		
		 loan=new LoanDTO();
		 read=new LoanRFDB();
		 typeOfLoan=read.getTypeOfLoan();
		 
		 Choice choiceTenure = new Choice();
		 choiceTenure.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			choiceTenure.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					loan.setTenure(Integer.parseInt(choiceTenure.getSelectedItem()));
				}
			});
			choiceTenure.setBounds(441, 394, 42, 20);
			getContentPane().add(choiceTenure);
		 
		Choice choiceTypeOfLoan = new Choice();
		choiceTypeOfLoan.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		for(String singleTypeOfLoan:typeOfLoan){
			choiceTypeOfLoan.add(singleTypeOfLoan);
		}
		
		tenures=read.getTenures(choiceTypeOfLoan.getSelectedItem());
		for(int singleTenure:tenures){
			choiceTenure.add(Integer.toString(singleTenure));
		}
		
		loan.setTypeOfLoan(choiceTypeOfLoan.getSelectedItem());
		choiceTypeOfLoan.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String choiceType=choiceTypeOfLoan.getSelectedItem();
				loan.setTypeOfLoan(choiceType);
				tenures=read.getTenures(choiceType);
				choiceTenure.removeAll();
				for(int choice:tenures){
					choiceTenure.add(Integer.toString(choice));
				}
			}
		});
		
		choiceTypeOfLoan.setBounds(141, 394, 161, 28);
		getContentPane().add(choiceTypeOfLoan);
		
		loan.setTenure(Integer.parseInt(choiceTenure.getSelectedItem()));
		
		Label label_9 = new Label("Tenure");
		label_9.setFont(new Font("AR JULIAN", Font.BOLD, 14));
		label_9.setBounds(355, 392, 62, 22);
		getContentPane().add(label_9);
		
		
		
		Label label_10 = new Label("Amount");
		label_10.setFont(new Font("AR JULIAN", Font.BOLD, 14));
		label_10.setBounds(528, 392, 62, 22);
		getContentPane().add(label_10);
		
		TextField textField_5 = new TextField();
		textField_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				loan.setAmount(Double.parseDouble(textField_5.getText()));
			}
		});
		textField_5.setBounds(617, 392, 113, 28);
		getContentPane().add(textField_5);
		
		Button buttonSubmit = new Button("Submit");
		buttonSubmit.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 15));
		buttonSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cust.setBirth(birth);
				cust.setLoan(loan);
				cust.setStage("QDE");
				application=new ApplicationNoRFDB();
				int appNo=application.getApplicationNo();
				ApplicationNoDTO app=new ApplicationNoDTO();
				app.setAppNo(appNo);
				cust.setApplication(app);
				AppNoWTDB appNoWTDB=new AppNoWTDB(cust);
				appNoWTDB.writeStageFirst();
				customer=new CustomerWTDB();
				customer.write(cust);
				
				
				AppNoGenerationFrame frame=new AppNoGenerationFrame(cust);
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				frame.setVisible(true);
				dispose();
			}
		});
		buttonSubmit.setBounds(92, 496, 97, 28);
		getContentPane().add(buttonSubmit);
		
		Button button_1 = new Button("Reset");
		button_1.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 15));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SourcingFrame frame=new SourcingFrame();
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				frame.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(299, 496, 95, 28);
		getContentPane().add(button_1);
		
		JLabel lblSourcing = new JLabel("SOURCING");
		lblSourcing.setFont(new Font("Segoe UI", Font.BOLD, 43));
		lblSourcing.setHorizontalAlignment(SwingConstants.CENTER);
		lblSourcing.setBounds(208, 11, 400, 65);
		getContentPane().add(lblSourcing);
	}
}
