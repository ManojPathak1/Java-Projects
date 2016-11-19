package com.bank.los.rfdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.TreeSet;

import com.bank.los.dto.UserIdAndPasswordDTO;

public class GetValuesRFDB {
	 int startingYear;
	 int endingYear;
	UserIdAndPasswordDTO userpass;
	ArrayList<String> userName;
	ArrayList<String> password;
	ArrayList<String> status;
	TreeSet<String> unlocked;
	TreeSet<String> locked;
	 int i;
	 int j;
	 UserIdAndPasswordDTO user;
	 ArrayList<String> userName1;
	 ArrayList<String> status2;
	 ConnectionClassRFDB conn=null;
	 Connection con;
	 Statement stmt;
	 ResultSet rs;
	 PreparedStatement pstmt;
	 TreeSet<Integer> year;
	 TreeSet<String> nationalities;
	 
public UserIdAndPasswordDTO getUserNamePasswordAndStatus(){
	try{
		userName=new ArrayList<>();
		password=new ArrayList<>();
		userpass=new UserIdAndPasswordDTO();
		con=ConnectionClassRFDB.getObject().connectionOpen();
		status=new ArrayList<String>();
	stmt=con.createStatement();
	rs=stmt.executeQuery("select userId,password,status from userpass");
	while(rs.next()){
		userName.add(rs.getString(1));
		password.add(rs.getString(2));
		status.add(rs.getString(3));
	}
	userpass.setUserName(userName);
	userpass.setPassword(password);
	userpass.setStatus(status);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	return userpass;
	
}
public TreeSet<String> getLockedClerks(){
	status2=new ArrayList<>();
	userName1=new ArrayList<>();
	unlocked=new TreeSet<String>();
	locked=new TreeSet<String>();
 user=getUserNamePasswordAndStatus();
userName1=user.getUserName();
j=0;
status2=user.getStatus();
for(String userName2:userName1){
	i=userName1.indexOf(userName2);
	if(status2.get(i).equalsIgnoreCase("A")){
		unlocked.add(userName1.get(i));
	}
	else{
		locked.add(userName1.get(i));
	}
	}
return locked;
}
public TreeSet<String> getUnlockedClerks(){
	
	return unlocked;
	
}

public TreeSet<Integer> yearsAdded(){
	year=new TreeSet<Integer>();
	try{
		con=ConnectionClassRFDB.getObject().connectionOpen();
	pstmt=con.prepareStatement("select startingYear,endingYear from years");
	rs=pstmt.executeQuery();
	while(rs.next()){
	startingYear=rs.getInt(1);
	endingYear=rs.getInt(2);
	}
	for(i=startingYear;i<=endingYear;i++){
		year.add(i);
	}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return year;
}

public TreeSet<String> getNationalities(){
	try{
		con=ConnectionClassRFDB.getObject().connectionOpen();
	nationalities=new TreeSet<String>();
	pstmt=con.prepareStatement("select nationality from nationalities");
	rs=pstmt.executeQuery();
	while(rs.next()){
		nationalities.add(rs.getString(1));
	}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return nationalities;
}
}
