package com.bank.los.rfdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StageRFDB {

	String stage;
	ConnectionClassRFDB conn;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public String readStage(int appNo){
		try{
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select stage from stage where appNo=?");
		pstmt.setInt(1, appNo);
		rs=pstmt.executeQuery();
		while(rs.next()){
			stage=rs.getString(1);
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return stage;
	}
}
