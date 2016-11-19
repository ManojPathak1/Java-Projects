package com.bank.los.rfdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.TreeSet;

public class LoanRFDB {

	Connection con;
	ConnectionClassRFDB conn;
	ResultSet rs;
	TreeSet<String> typeOfLoan;
	TreeSet<Integer> tenure;
	PreparedStatement pstmt;
	
	public TreeSet<String> getTypeOfLoan(){
		try
		{
			typeOfLoan=new TreeSet<String>();
			con=ConnectionClassRFDB.getObject().connectionOpen();
		 pstmt=con.prepareStatement("select typeOfLoan from loanTypeTenure");
		rs=pstmt.executeQuery();
		while(rs.next()){
			typeOfLoan.add(rs.getString(1));
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
		return typeOfLoan;
}
	
	public TreeSet<Integer> getTenures(String choiceType){
		try{
			tenure=new TreeSet<Integer>();
			con=ConnectionClassRFDB.getObject().connectionOpen();
		    pstmt=con.prepareStatement("select tenure from loanTypeTenure where typeOfLoan=?");
		    pstmt.setString(1, choiceType);
		    rs=pstmt.executeQuery();
		    while(rs.next()){
		    	tenure.add(rs.getInt(1));
		    }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return tenure;
	}
}
