package com.bank.los.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import com.bank.los.dto.AddressDTO;
import com.bank.los.dto.CompanyDTO;
import com.bank.los.dto.CustomerDTO;
import com.bank.los.dto.PersonalInfoDTO;
import com.bank.los.rfdb.QualificationRFDB;
import com.bank.los.rfdb.StatesRFDB;
import com.bank.los.wtdb.CustomerWTDB;

import java.awt.TextField;
import java.awt.Choice;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.TreeSet;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class QDEFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	
AddressDTO addressDTOOb;
StatesRFDB statesRFDBOb;
TreeSet<String> states;
TreeSet<String> cities;
TreeSet<String> pincodes;
PersonalInfoDTO personalInfoDTO;
QualificationRFDB qualificationRFDB;
TreeSet<String> qualifications;
TreeSet<String> typeOfJobs;
CompanyDTO companyDTO;
CustomerWTDB customerWTDB;
	
	public QDEFrame(CustomerDTO cust) {
		getContentPane().setBackground(SystemColor.inactiveCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1112, 748);
		new JPanel();
		this.getContentPane().setLayout(null);
		
		addressDTOOb=new AddressDTO();
		statesRFDBOb=new StatesRFDB();
		personalInfoDTO=new PersonalInfoDTO();
		qualificationRFDB=new QualificationRFDB();
		companyDTO=new CompanyDTO();
		customerWTDB=new CustomerWTDB();
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Aharoni", Font.BOLD, 16));
		lblName.setBounds(10, 24, 56, 22);
		getContentPane().add(lblName);
		
		JLabel lblNewLabel = new JLabel(cust.getFirstName());
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblNewLabel.setBounds(91, 18, 95, 28);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel(cust.getMiddleName());
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		label.setBounds(228, 21, 101, 22);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel(cust.getLastName());
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		label_1.setBounds(356, 22, 92, 21);
		getContentPane().add(label_1);
		
		JLabel lblDateOfBirth = new JLabel("Date of birth");
		lblDateOfBirth.setFont(new Font("Aharoni", Font.BOLD, 17));
		lblDateOfBirth.setBounds(10, 57, 111, 22);
		getContentPane().add(lblDateOfBirth);
		
		JLabel label_2 = new JLabel(Integer.toString(cust.getBirth().getDate()));
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		label_2.setBounds(151, 55, 35, 21);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel(cust.getBirth().getMonth());
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		label_3.setBounds(206, 55, 107, 21);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel(Integer.toString(cust.getBirth().getYear()));
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		label_4.setBounds(348, 55, 62, 21);
		getContentPane().add(label_4);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Aharoni", Font.BOLD, 17));
		lblGender.setBounds(10, 90, 79, 23);
		getContentPane().add(lblGender);
		
		JLabel label_5 = new JLabel(cust.getGender());
		label_5.setForeground(Color.BLUE);
		label_5.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		label_5.setBounds(115, 87, 96, 22);
		getContentPane().add(label_5);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setFont(new Font("Aharoni", Font.BOLD, 16));
		lblNationality.setBounds(10, 124, 95, 28);
		getContentPane().add(lblNationality);
		
		JLabel label_6 = new JLabel(cust.getNationality());
		label_6.setForeground(Color.BLUE);
		label_6.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		label_6.setBounds(115, 123, 109, 24);
		getContentPane().add(label_6);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Aharoni", Font.BOLD, 16));
		lblPhone.setBounds(10, 163, 62, 22);
		getContentPane().add(lblPhone);
		
		JLabel lblNewLabel_1 = new JLabel(cust.getPhone());
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblNewLabel_1.setBounds(99, 161, 121, 21);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setFont(new Font("Aharoni", Font.BOLD, 16));
		lblEmailId.setBounds(10, 195, 84, 29);
		getContentPane().add(lblEmailId);
		
		JLabel label_7 = new JLabel(cust.getEmailId());
		label_7.setForeground(Color.BLUE);
		label_7.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		label_7.setBounds(99, 194, 134, 25);
		getContentPane().add(label_7);
		
		JLabel lblTypeOfLoan = new JLabel("Type of Loan");
		lblTypeOfLoan.setFont(new Font("Aharoni", Font.BOLD, 16));
		lblTypeOfLoan.setBounds(10, 235, 101, 22);
		getContentPane().add(lblTypeOfLoan);
		
		JLabel label_8 = new JLabel(cust.getLoan().getTypeOfLoan());
		label_8.setForeground(Color.BLUE);
		label_8.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		label_8.setBounds(121, 229, 121, 28);
		getContentPane().add(label_8);
		
		JLabel lblTenure = new JLabel("Tenure");
		lblTenure.setFont(new Font("Aharoni", Font.BOLD, 16));
		lblTenure.setBounds(306, 235, 62, 22);
		getContentPane().add(lblTenure);
		
		JLabel label_9 = new JLabel(Integer.toString(cust.getLoan().getTenure()));
		label_9.setForeground(Color.BLUE);
		label_9.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		label_9.setBounds(378, 232, 32, 22);
		getContentPane().add(label_9);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Aharoni", Font.BOLD, 16));
		lblAmount.setBounds(521, 235, 72, 22);
		getContentPane().add(lblAmount);
		
		JLabel label_10 = new JLabel(Double.toString(cust.getLoan().getAmount()));
		label_10.setForeground(Color.BLUE);
		label_10.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		label_10.setBounds(625, 233, 92, 21);
		getContentPane().add(label_10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Aharoni", Font.BOLD, 17));
		lblAddress.setBounds(10, 297, 84, 20);
		getContentPane().add(lblAddress);
		
		TextField textField = new TextField();
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				addressDTOOb.setFirstAddressLine(textField.getText());
			}
		});
		textField.setBounds(99, 297, 322, 28);
		getContentPane().add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				addressDTOOb.setSecondAddressLine(textField_1.getText());
			}
		});
		textField_1.setBounds(99, 331, 322, 28);
		getContentPane().add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				addressDTOOb.setThirdAddressLine(textField_2.getText());
			}
		});
		textField_2.setBounds(99, 365, 322, 28);
		getContentPane().add(textField_2);
		
		Choice choice = new Choice();
		choice.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		Choice choice_1 = new Choice();
		choice_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		Choice choice_2 = new Choice();
		
		choice_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				addressDTOOb.setCity(choice_1.getSelectedItem());
				
			}
		});
		choice_1.setBounds(760, 295, 86, 20);
		getContentPane().add(choice_1);

		
		
		
		
		
		states=statesRFDBOb.getStates();
		for(String singleState:states){
			choice.add(singleState);
		}
		
		cities=statesRFDBOb.getCities(choice.getSelectedItem());
		for(String singleCity:cities){
			choice_1.add(singleCity);
		}
		addressDTOOb.setCity(choice_1.getSelectedItem());
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				choice_1.removeAll();
				addressDTOOb.setState(choice.getSelectedItem());
				cities=statesRFDBOb.getCities(choice.getSelectedItem());
				for(String singleCity:cities){
					choice_1.add(singleCity);
				}
				
				choice_2.removeAll();
				pincodes=statesRFDBOb.getPincodes(choice_1.getSelectedItem());
				for(String singlePincode:pincodes){
					choice_2.add(singlePincode);
				}
			}
		});
		choice.setBounds(540, 297, 121, 20);
		getContentPane().add(choice);
		
		addressDTOOb.setState(choice.getSelectedItem());
		
		Label label_11 = new Label("State");
		label_11.setFont(new Font("Aharoni", Font.BOLD, 17));
		label_11.setBounds(478, 297, 56, 22);
		getContentPane().add(label_11);
		
		Label label_12 = new Label("City");
		label_12.setFont(new Font("Aharoni", Font.BOLD, 17));
		label_12.setBounds(708, 295, 46, 22);
		getContentPane().add(label_12);
		
		
	
		
		
		Label label_13 = new Label("Pincode");
		label_13.setFont(new Font("Aharoni", Font.BOLD, 17));
		label_13.setBounds(896, 295, 72, 22);
		getContentPane().add(label_13);
		
		
		choice_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				addressDTOOb.setPincode(choice_2.getSelectedItem());
			}
		});
		choice_2.setBounds(974, 295, 86, 20);
		getContentPane().add(choice_2);
		pincodes=statesRFDBOb.getPincodes(choice_1.getSelectedItem());
		choice_2.getSelectedItem();
		for(String singlePincode:pincodes){
			choice_2.add(singlePincode);
		}
		addressDTOOb.setPincode(choice_2.getSelectedItem());
		
		
		
		Label label_14 = new Label("Voter ID No");
		label_14.setFont(new Font("Aharoni", Font.BOLD, 17));
		label_14.setBounds(10, 421, 101, 22);
		getContentPane().add(label_14);
		
		TextField textField_3 = new TextField();
		textField_3.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		textField_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				personalInfoDTO.setVoterIDNo(textField_3.getText());
				
			}
		});
		textField_3.setBounds(121, 415, 192, 28);
		getContentPane().add(textField_3);
		
		Label label_15 = new Label("License No");
		label_15.setFont(new Font("Aharoni", Font.BOLD, 17));
		label_15.setBounds(355, 415, 93, 22);
		getContentPane().add(label_15);
		
		TextField textField_4 = new TextField();
		textField_4.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		textField_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				personalInfoDTO.setLicenseNo(textField_4.getText());
			}
		});
		textField_4.setBounds(454, 409, 192, 28);
		getContentPane().add(textField_4);
		
		Label label_16 = new Label("Pan Card No");
		label_16.setFont(new Font("Aharoni", Font.BOLD, 17));
		label_16.setBounds(692, 409, 112, 22);
		getContentPane().add(label_16);
		
		TextField textField_5 = new TextField();
		textField_5.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		textField_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				personalInfoDTO.setPanNo(textField_5.getText());
			}
		});
		textField_5.setBounds(810, 403, 192, 28);
		getContentPane().add(textField_5);
		
		Label label_17 = new Label("Income (PA Rs.)");
		label_17.setFont(new Font("Aharoni", Font.BOLD, 17));
		label_17.setBounds(584, 517, 134, 22);
		getContentPane().add(label_17);
		
		TextField textField_6 = new TextField();
		textField_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				personalInfoDTO.setIncomePA(Double.parseDouble(textField_6.getText()));
			}
		});
		textField_6.setBounds(724, 510, 121, 29);
		getContentPane().add(textField_6);
		
		Label label_18 = new Label("Asset Value (Rs.)");
		label_18.setFont(new Font("Aharoni", Font.BOLD, 17));
		label_18.setBounds(10, 473, 149, 22);
		getContentPane().add(label_18);
		
		TextField textField_7 = new TextField();
		textField_7.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		textField_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				personalInfoDTO.setAssetValue(Double.parseDouble(textField_7.getText()));
			}
		});
		textField_7.setBounds(180, 467, 149, 28);
		getContentPane().add(textField_7);
		
		Label label_19 = new Label("Qualification");
		label_19.setFont(new Font("Aharoni", Font.BOLD, 17));
		label_19.setBounds(10, 524, 111, 22);
		getContentPane().add(label_19);
		
		Choice choice_3 = new Choice();
		choice_3.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		qualifications=qualificationRFDB.getQualifications();
		for(String singleQualification:qualifications){
			choice_3.add(singleQualification);
		}
		
		personalInfoDTO.setQualification(choice_3.getSelectedItem());
		
		choice_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				personalInfoDTO.setQualification(choice_3.getSelectedItem());
			}
		});
		choice_3.setBounds(121, 517, 111, 28);
		getContentPane().add(choice_3);
		
		JLabel lblTypeOfJob = new JLabel("Type of Job");
		lblTypeOfJob.setFont(new Font("Aharoni", Font.BOLD, 17));
		lblTypeOfJob.setBounds(293, 517, 101, 29);
		getContentPane().add(lblTypeOfJob);
		
		Choice choice_4 = new Choice();
		choice_4.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		typeOfJobs=qualificationRFDB.getTypeOfJobs();
		for(String singleJob:typeOfJobs){
			choice_4.add(singleJob);
		}
		
		personalInfoDTO.setTypeOfJob(choice_4.getSelectedItem());
		
		choice_4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			}
		});
		choice_4.setBounds(400, 517, 111, 20);
		getContentPane().add(choice_4);
		
		Label label_20 = new Label("Name of the Company");
		label_20.setFont(new Font("Aharoni", Font.BOLD, 17));
		label_20.setBounds(10, 572, 179, 22);
		getContentPane().add(label_20);
		
		TextField textField_8 = new TextField();
		textField_8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				companyDTO.setCompanyName(textField_8.getText());
			}
		});
		textField_8.setBounds(195, 566, 234, 28);
		getContentPane().add(textField_8);
		
		Label label_21 = new Label("Address");
		label_21.setFont(new Font("Aharoni", Font.BOLD, 17));
		label_21.setBounds(478, 566, 79, 22);
		getContentPane().add(label_21);
		
		TextArea textArea = new TextArea();
		textArea.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textArea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				companyDTO.setAddress((textArea.getText()));
			}
		});
		textArea.setBounds(563, 566, 243, 69);
		getContentPane().add(textArea);
		
		JLabel lblNewLabel_2 = new JLabel("Contact No");
		lblNewLabel_2.setFont(new Font("Aharoni", Font.BOLD, 17));
		lblNewLabel_2.setBounds(847, 566, 101, 28);
		getContentPane().add(lblNewLabel_2);
		
		TextField textField_9 = new TextField();
		textField_9.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		textField_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				companyDTO.setContactNo((textField_9.getText()));
			}
		});
		textField_9.setBounds(958, 566, 128, 28);
		getContentPane().add(textField_9);
		
		Button button = new Button("Submit");
		button.setBackground(Color.WHITE);
		button.setFont(new Font("Aharoni", Font.BOLD, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cust.setAddress(addressDTOOb);
				cust.setCompanyDTO(companyDTO);
				cust.setPersonalInfoDTO(personalInfoDTO);
				cust.setStage("SummaryInfo");
				customerWTDB.writeQDE(cust);
				SummaryFrame summaryFrame=new SummaryFrame(cust);
				summaryFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				summaryFrame.setVisible(true);
				dispose();
			}
		});
		button.setBounds(263, 670, 121, 29);
		getContentPane().add(button);
		
		Button button_1 = new Button("Reset");
		button_1.setFont(new Font("Aharoni", Font.BOLD, 15));
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		button_1.setBounds(483, 670, 95, 29);
		getContentPane().add(button_1);
		
		Label label_23 = new Label("Application No.");
		label_23.setFont(new Font("Aharoni", Font.BOLD, 20));
		label_23.setBounds(661, 11, 157, 22);
		getContentPane().add(label_23);
		
		Label label_22 = new Label(Integer.toString(cust.getApplication().getAppNo()));
		label_22.setForeground(Color.BLUE);
		label_22.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		label_22.setBounds(824, 11, 92, 22);
		getContentPane().add(label_22);
		
	}
}
