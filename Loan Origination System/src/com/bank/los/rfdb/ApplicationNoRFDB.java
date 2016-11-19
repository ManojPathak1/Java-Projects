package com.bank.los.rfdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.TreeSet;

public class ApplicationNoRFDB {

	int appNo;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	TreeSet<Integer> appNumber;
	boolean appNoPresent;
	
	public int getApplicationNo(){
		try{
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select max(appNo) as appNo from appNo");
		 rs = pstmt.executeQuery();
		 while(rs.next()){
			 appNo=rs.getInt(1);
		 }
		 if(appNo==0){
		appNo=1000;	 
		 }
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		return (appNo+1);
	}
	public boolean getAllApplicationNo(int appNo){
		try{
			appNoPresent=false;
			appNumber=new TreeSet<Integer>();
			con=ConnectionClassRFDB.getObject().connectionOpen();
			pstmt=con.prepareStatement("select appNo from appNo where appNo=?");
			pstmt.setInt(1, appNo);
			 rs = pstmt.executeQuery();
			 while(rs.next()){
				 appNoPresent=true;
			 }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return appNoPresent;
	}
}
