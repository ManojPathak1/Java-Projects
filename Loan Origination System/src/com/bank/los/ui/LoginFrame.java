package com.bank.los.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.bank.los.helper.ValidityHelper;

import java.awt.Label;
import java.awt.Choice;
import java.awt.Button;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Cursor;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private String userName;
    private String password;
   static LoginFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LoginFrame() {
		getContentPane().setForeground(Color.GRAY);
		getContentPane().setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 415);
		new JPanel();
		
		Label label = new Label("Username");
		label.setBounds(35, 139, 86, 27);
		
		JTextField txtMan = new JTextField();
		txtMan.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtMan.setHorizontalAlignment(SwingConstants.CENTER);
		txtMan.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		txtMan.setForeground(Color.BLACK);
		txtMan.setSelectionColor(Color.BLUE);
		txtMan.setBorder(new LineBorder(new Color(171, 173, 179)));
		txtMan.setBounds(136, 139, 181, 27);
		txtMan.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				userName=txtMan.getText();
			}
		});
		
		Label label_1 = new Label("Password");
		label_1.setBounds(35, 188, 86, 27);
		
	JPasswordField textField_2 = new JPasswordField();
	textField_2.setHorizontalAlignment(SwingConstants.CENTER);
	textField_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
	textField_2.setBounds(136, 188, 181, 27);
		textField_2.addFocusListener(new FocusAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				password=textField_2.getText();
			}
		});
		
		Label label_2 = new Label("Role");
		label_2.setBounds(35, 235, 52, 27);
		
		Choice choice = new Choice();
		choice.setBounds(136, 235, 181, 27);
		
		Button button = new Button("Submit");
		button.setBounds(136, 306, 70, 22);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ValidityHelper valid=new ValidityHelper();
				if(valid.validityForClerk(userName, password)){
				if(choice.getSelectedItem().equalsIgnoreCase("Clerk")){
					
					AppNoEnterFrame frame1=new AppNoEnterFrame();
					frame1.setVisible(true);
					dispose();
				}
				}
				else if(valid.validityForAdmin(userName,password))
				{
					
					if(choice.getSelectedItem().equalsIgnoreCase("Admin"))
				{
						
										AdminFrame frame1 = new AdminFrame();
										frame1.setVisible(true);
										frame.dispose();
										
										
									} 
								}
				else{
					
				}
			}
		});
		
		Button button_1 = new Button("Reset");
		button_1.setBounds(247, 306, 70, 22);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginFrame frame=new LoginFrame();
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				frame.setVisible(true);
				dispose();
				
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(label);
		getContentPane().add(txtMan);
		getContentPane().add(label_1);
		getContentPane().add(textField_2);
		getContentPane().add(label_2);
		getContentPane().add(choice);
		getContentPane().add(button);
		getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("Login Here");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 29));
		lblNewLabel.setBounds(35, 32, 293, 69);
		getContentPane().add(lblNewLabel);
		choice.add("Admin");
		choice.add("Clerk");
		
		
		
	}
}
