package com.bank.los.rfdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeSet;

public class QualificationRFDB {

	ConnectionClassRFDB conn;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	TreeSet<String> qualifications;
	TreeSet<String> typeOfJobs;
	
	public TreeSet<String> getQualifications(){
		try{
			qualifications=new TreeSet<>();
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select qualification from qualifications");
		rs=pstmt.executeQuery();
		while(rs.next()){
			qualifications.add(rs.getString(1));
		}
		}
		
		catch(Exception e)
		{
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return qualifications;
	}
	
	public TreeSet<String> getTypeOfJobs(){
		try{
			typeOfJobs=new TreeSet<>();
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select typeOfJob from typeOfJobs");
		rs=pstmt.executeQuery();
		while(rs.next()){
			typeOfJobs.add(rs.getString(1));
		}
		}
		
		catch(Exception e)
		{
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return typeOfJobs;
	}
	
	
}
