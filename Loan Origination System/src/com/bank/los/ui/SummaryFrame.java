package com.bank.los.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.bank.los.dto.CustomerDTO;
import com.bank.los.rfdb.DedupeRFDB;

import java.awt.Label;

import javax.swing.JLabel;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class SummaryFrame extends JFrame {

	/**
	 * Launch the application.
	 */


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	DedupeRFDB dedupeRFDB;

	/**
	 * Create the frame.
	 */
	public SummaryFrame(CustomerDTO cust) {
		getContentPane().setBackground(SystemColor.inactiveCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 599);
		new JPanel();
		this.getContentPane().setLayout(null);
		
		
		dedupeRFDB=new DedupeRFDB();
		
		Label label = new Label("Name");
		label.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		label.setBounds(10, 38, 55, 22);
		getContentPane().add(label);
		
		Label label_1 = new Label("Application No");
		label_1.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		label_1.setBounds(10, 10, 134, 22);
		getContentPane().add(label_1);
		
		Label label_2 = new Label("Date of Birth");
		label_2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_2.setBounds(10, 66, 121, 22);
		getContentPane().add(label_2);
		
		Label label_3 = new Label("Gender");
		label_3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_3.setBounds(10, 94, 74, 22);
		getContentPane().add(label_3);
		
		Label label_4 = new Label("Nationality");
		label_4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_4.setBounds(10, 122, 100, 22);
		getContentPane().add(label_4);
		
		Label label_5 = new Label("Phone");
		label_5.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_5.setBounds(10, 150, 62, 22);
		getContentPane().add(label_5);
		
		Label label_6 = new Label("Email ID");
		label_6.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_6.setBounds(409, 150, 86, 22);
		getContentPane().add(label_6);
		
		Label label_7 = new Label("Type of Loan");
		label_7.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_7.setBounds(10, 178, 121, 22);
		getContentPane().add(label_7);
		
		Label label_8 = new Label("Tenure");
		label_8.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_8.setBounds(294, 178, 74, 22);
		getContentPane().add(label_8);
		
		Label label_9 = new Label("Amount");
		label_9.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_9.setBounds(557, 178, 86, 22);
		getContentPane().add(label_9);
		
		Label label_10 = new Label("Address");
		label_10.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_10.setBounds(10, 206, 86, 22);
		getContentPane().add(label_10);
		
		Label label_11 = new Label("State");
		label_11.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_11.setBounds(294, 206, 55, 22);
		getContentPane().add(label_11);
		
		Label label_12 = new Label("City");
		label_12.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_12.setBounds(459, 206, 43, 22);
		getContentPane().add(label_12);
		
		Label label_13 = new Label("Pincode");
		label_13.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		label_13.setBounds(639, 206, 79, 22);
		getContentPane().add(label_13);
		
		Label label_14 = new Label("Vote ID No");
		label_14.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		label_14.setBounds(10, 315, 100, 22);
		getContentPane().add(label_14);
		
		Label label_15 = new Label("License No");
		label_15.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_15.setBounds(253, 315, 105, 22);
		getContentPane().add(label_15);
		
		Label label_16 = new Label("Pan Card No");
		label_16.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_16.setBounds(525, 315, 118, 22);
		getContentPane().add(label_16);
		
		Label label_17 = new Label("Asset Value (Rs.)");
		label_17.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_17.setBounds(10, 343, 164, 22);
		getContentPane().add(label_17);
		
		Label label_18 = new Label("Qualification");
		label_18.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_18.setBounds(10, 371, 118, 22);
		getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("Type of Job");
		label_19.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_19.setBounds(253, 371, 100, 22);
		getContentPane().add(label_19);
		
		Label label_20 = new Label("Income (PA Rs.)");
		label_20.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_20.setBounds(525, 371, 146, 22);
		getContentPane().add(label_20);
		
		Label label_21 = new Label("Name of the Company");
		label_21.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_21.setBounds(10, 399, 204, 22);
		getContentPane().add(label_21);
		
		Label label_22 = new Label("Address");
		label_22.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_22.setBounds(344, 399, 86, 22);
		getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("Contact No");
		label_23.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		label_23.setBounds(525, 407, 70, 14);
		getContentPane().add(label_23);
		
		Button button = new Button("Submit");
		button.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		button.setBackground(SystemColor.text);
		button.setForeground(SystemColor.desktop);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean isNameMatched=dedupeRFDB.readNameDedupe(cust);
				 boolean isBirthDateMatched=dedupeRFDB.readBirthDedupe(cust);
				 boolean isPhoneMatched=dedupeRFDB.readPhoneDedupe(cust);
				 boolean isVoterMatched=dedupeRFDB.readVoterIdDedupe(cust);
				 boolean isLicenseMatched=dedupeRFDB.readLicenseDedupe(cust);
				 boolean isPanMatched=dedupeRFDB.readPanDedupe(cust);
				 boolean isNationalityMatched=dedupeRFDB.readNationalityDedupe(cust);
				 boolean isEmailMatched=dedupeRFDB.readEmailDedupe(cust);
				 
				 boolean arr[]={isNameMatched,
						 isBirthDateMatched,
						 isPhoneMatched,
						 isVoterMatched,
						 isLicenseMatched,
						 isPanMatched,
						 isNationalityMatched,
						 isEmailMatched
				 };
				 
				DedupeFrame dedupeFrame=new DedupeFrame(arr,cust);
				dedupeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dedupeFrame.setVisible(true);
				dispose();
			}
		});
		button.setBounds(172, 520, 126, 30);
		getContentPane().add(button);
		
		Button button_1 = new Button("Quit Here");
		button_1.setBackground(SystemColor.text);
		button_1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(409, 520, 121, 30);
		getContentPane().add(button_1);
		
		JLabel label_24 = new JLabel(cust.getFirstName());
		label_24.setBounds(83, 46, 79, 14);
		getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel(cust.getMiddleName());
		label_25.setBounds(191, 46, 79, 14);
		getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel(cust.getLastName());
		label_26.setBounds(319, 46, 92, 14);
		getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel(Integer.toString(cust.getBirth().getDate()));
		label_27.setBounds(201, 74, 35, 14);
		getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel(cust.getBirth().getMonth());
		label_28.setBounds(228, 74, 79, 14);
		getContentPane().add(label_28);
		
		JLabel label_29 = new JLabel(Integer.toString(cust.getBirth().getYear()));
		label_29.setBounds(355, 74, 46, 14);
		getContentPane().add(label_29);
		
		JLabel label_30 = new JLabel(cust.getGender());
		label_30.setBounds(196, 102, 46, 14);
		getContentPane().add(label_30);
		
		JLabel label_31 = new JLabel(cust.getNationality());
		label_31.setBounds(168, 130, 46, 14);
		getContentPane().add(label_31);
		
		JLabel label_32 = new JLabel(cust.getPhone());
		label_32.setBounds(168, 150, 46, 14);
		getContentPane().add(label_32);
		
		JLabel label_33 = new JLabel(cust.getEmailId());
		label_33.setBounds(548, 150, 134, 14);
		getContentPane().add(label_33);
		
		JLabel label_34 = new JLabel(cust.getLoan().getTypeOfLoan());
		label_34.setBounds(149, 178, 121, 14);
		getContentPane().add(label_34);
		
		JLabel label_35 = new JLabel(Integer.toString(cust.getLoan().getTenure()));
		label_35.setBounds(419, 178, 46, 14);
		getContentPane().add(label_35);
		
		JLabel label_36 = new JLabel(Double.toString(cust.getLoan().getAmount()));
		label_36.setBounds(728, 178, 92, 14);
		getContentPane().add(label_36);
		
		JLabel label_37 = new JLabel(cust.getAddress().getFirstAddressLine());
		label_37.setBounds(149, 214, 79, 14);
		getContentPane().add(label_37);
		
		JLabel label_38 = new JLabel(cust.getAddress().getSecondAddressLine());
		label_38.setBounds(83, 239, 79, 14);
		getContentPane().add(label_38);
		
		JLabel label_39 = new JLabel(cust.getAddress().getThirdAddressLine());
		label_39.setBounds(83, 264, 79, 14);
		getContentPane().add(label_39);
		
		JLabel label_40 = new JLabel(cust.getAddress().getState());
		label_40.setBounds(374, 206, 79, 14);
		getContentPane().add(label_40);
		
		JLabel label_41 = new JLabel(cust.getAddress().getCity());
		label_41.setBounds(532, 206, 79, 14);
		getContentPane().add(label_41);
		
		JLabel label_42 = new JLabel(cust.getAddress().getPincode());
		label_42.setBounds(767, 206, 79, 14);
		getContentPane().add(label_42);
		
		JLabel label_43 = new JLabel(cust.getPersonalInfoDTO().getVoterIDNo());
		label_43.setBounds(135, 323, 79, 14);
		getContentPane().add(label_43);
		
		JLabel label_44 = new JLabel(cust.getPersonalInfoDTO().getLicenseNo());
		label_44.setBounds(391, 315, 79, 14);
		getContentPane().add(label_44);
		
		JLabel label_45 = new JLabel(cust.getPersonalInfoDTO().getPanNo());
		label_45.setBounds(663, 315, 79, 14);
		getContentPane().add(label_45);
		
		JLabel label_46 = new JLabel(Double.toString(cust.getPersonalInfoDTO().getAssetValue()));
		label_46.setBounds(201, 351, 79, 14);
		getContentPane().add(label_46);
		
		JLabel label_47 = new JLabel(cust.getPersonalInfoDTO().getQualification());
		label_47.setBounds(164, 379, 79, 14);
		getContentPane().add(label_47);
		
		JLabel label_48 = new JLabel(cust.getPersonalInfoDTO().getTypeOfJob());
		label_48.setBounds(391, 371, 79, 14);
		getContentPane().add(label_48);
		
		JLabel label_49 = new JLabel(Double.toString(cust.getPersonalInfoDTO().getIncomePA()));
		label_49.setBounds(702, 379, 79, 14);
		getContentPane().add(label_49);
		
		JLabel label_50 = new JLabel(cust.getCompanyDTO().getCompanyName());
		label_50.setBounds(228, 404, 79, 14);
		getContentPane().add(label_50);
		
		JLabel label_51 = new JLabel(cust.getCompanyDTO().getAddress());
		label_51.setBounds(436, 407, 79, 14);
		getContentPane().add(label_51);
		
		JLabel label_52 = new JLabel(cust.getCompanyDTO().getContactNo());
		label_52.setBounds(634, 407, 79, 14);
		getContentPane().add(label_52);
		
		JLabel label_53 = new JLabel(Integer.toString(cust.getApplication().getAppNo()));
		label_53.setForeground(Color.BLUE);
		label_53.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_53.setBounds(160, 10, 79, 22);
		getContentPane().add(label_53);
	}
}
