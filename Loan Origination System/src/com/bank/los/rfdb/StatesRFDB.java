package com.bank.los.rfdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.TreeSet;

public class StatesRFDB {

	ConnectionClassRFDB conn;
	Connection con;
	TreeSet<String> states;
	PreparedStatement pstmt;
	ResultSet rs;
	TreeSet<String> cities;
	TreeSet<String> pincodes;
	
	public TreeSet<String> getStates(){
		try{
			states=new TreeSet<String>();
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select state from states");
		rs=pstmt.executeQuery();
		while(rs.next()){
			states.add(rs.getString(1));
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return states;
	}
	public TreeSet<String> getCities(String state){
		try{
			cities=new TreeSet<String>();
			con=ConnectionClassRFDB.getObject().connectionOpen();
			pstmt=con.prepareStatement("select city from states where state=?");
			pstmt.setString(1, state);
			rs=pstmt.executeQuery();
			while(rs.next()){
				cities.add(rs.getString(1));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return cities;
	}
	public TreeSet<String> getPincodes(String city){
		try{
			pincodes=new TreeSet<String>();
			con=ConnectionClassRFDB.getObject().connectionOpen();
			pstmt=con.prepareStatement("select pincode from states where city=?");
			pstmt.setString(1, city);
			rs=pstmt.executeQuery();
			while(rs.next()){
				pincodes.add(rs.getString(1));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return pincodes;
	}
	
}
