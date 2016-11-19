package com.bank.los.helper;

import java.util.ArrayList;

import com.bank.los.dto.UserAndPassAdminDTO;
import com.bank.los.dto.UserIdAndPasswordDTO;
import com.bank.los.rfdb.AdminUsernameAndPasswordRFDB;
import com.bank.los.rfdb.GetValuesRFDB;

public class ValidityHelper {
	GetValuesRFDB values;
	UserIdAndPasswordDTO userpass;
	boolean isLogin;
	boolean isAdminLogin;
	ArrayList<String> userNam;
	ArrayList<String> pass;
	AdminUsernameAndPasswordRFDB admin;
	boolean isLeapYear;
	int noOfDays;
public boolean validityForClerk(String userName,String password){
	values=new GetValuesRFDB();
	userpass=values.getUserNamePasswordAndStatus();
    isLogin=false;
	userNam=new ArrayList<>();
	userNam=userpass.getUserName();
	pass=new ArrayList<>();
	pass=userpass.getPassword();
	ArrayList<String> status=new ArrayList<>();
	 status=userpass.getStatus();
	for(int i=0;i<status.size();i++){
		for(String user:userNam){
			int index=userNam.indexOf(user);
		if((user.equalsIgnoreCase(userName))&&(pass.get(index).equalsIgnoreCase(password))
				&&(status.get(index).equalsIgnoreCase("A"))){
			isLogin=true;
			break;
		}
			
		
	}
	
}
	return isLogin;
}
public boolean validityForAdmin(String userName,String password){
	AdminUsernameAndPasswordRFDB admin2=new AdminUsernameAndPasswordRFDB();
	UserAndPassAdminDTO admin=admin2.getUserNameAndPassword();
	isAdminLogin=false;
	if(userName.equalsIgnoreCase(admin.getUserName())&&(password.equalsIgnoreCase(admin.getPassword()))){
		isAdminLogin=true;
	}
	return isAdminLogin;
	
}

public boolean isleapYear(int year){
	isLeapYear=false;
	isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	return isLeapYear;
}

public int numberOfDays(String month){
	if(month.substring(0, 3).equalsIgnoreCase("Jan")||month.substring(0, 3).equalsIgnoreCase("Mar")||
			month.substring(0, 3).equalsIgnoreCase("May")||month.substring(0, 3).equalsIgnoreCase("Jul")||
			month.substring(0, 3).equalsIgnoreCase("Aug")||month.substring(0, 3).equalsIgnoreCase("Oct")||
			month.substring(0, 3).equalsIgnoreCase("dec")){
		noOfDays=31;
	}
	else if(month.substring(0, 3).equalsIgnoreCase("Apr")||month.substring(0, 3).equalsIgnoreCase("Jun")||
			month.substring(0, 3).equalsIgnoreCase("Sep")||month.substring(0, 3).equalsIgnoreCase("Nov")){
		noOfDays=30;
	}
	else if(month.substring(0, 3).equalsIgnoreCase("Feb")){
		noOfDays=28;
	}
	return noOfDays;
}
}
