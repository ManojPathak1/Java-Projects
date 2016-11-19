package com.bank.los.ui;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminFrame extends JFrame {
	

	
	private static final long serialVersionUID = 1L;
	
	public AdminFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 493);
		new JPanel();
		this.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Locked Clerks");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String status="";
				if(rdbtnNewRadioButton.getText().equals("Locked Clerks")){
					status="Locked";
					
					
					
						ULClerksFrame frame = new ULClerksFrame(status);
						frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
									frame.setVisible(true);
									dispose();
			}
			}
		});
		
		rdbtnNewRadioButton.setBounds(129, 36, 109, 23);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Unlocked Clerks");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String status="";
				if(rdbtnNewRadioButton_1.getText().equals("Unlocked Clerks")){
					status="Unlocked";
					
					
					
						ULClerksFrame frame = new ULClerksFrame(status);
						frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
									frame.setVisible(true);
									dispose();
			}
			}
		});
		rdbtnNewRadioButton_1.setBounds(280, 36, 140, 23);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		
		
		ButtonGroup group=new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
	}

	

}

