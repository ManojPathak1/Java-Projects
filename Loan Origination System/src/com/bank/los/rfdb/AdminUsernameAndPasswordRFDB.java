package com.bank.los.rfdb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bank.los.dto.UserAndPassAdminDTO;

public class AdminUsernameAndPasswordRFDB {
String userName;
Connection con;
Statement stmt;
String password;
ResultSet rs;
UserAndPassAdminDTO admin;

public UserAndPassAdminDTO getUserNameAndPassword(){
	admin=new UserAndPassAdminDTO();
	try{
		con=ConnectionClassRFDB.getObject().connectionOpen();
	stmt=con.createStatement();
	rs=stmt.executeQuery("select username,password from admin");
	while(rs.next()){
		admin.setUserName(rs.getString(1));
		admin.setPassword(rs.getString(2));
	}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return admin;
}

}
