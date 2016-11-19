package com.bank.los.wtdb;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bank.los.dto.CustomerDTO;
import com.bank.los.rfdb.ConnectionClassRFDB;

public class AppNoWTDB {

	CustomerDTO cust;
	PreparedStatement pstmt;
	Connection con;
	
	public AppNoWTDB(CustomerDTO cust){
		this.cust=cust;
		
	}
	public void writeStage(){
		try{
		con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("update stage set stage=? where appNo=?");
		pstmt.setString(1, cust.getStage());
		pstmt.setInt(2, cust.getApplication().getAppNo());
		pstmt.executeUpdate();
		
	}
		catch(Exception e){
			e.printStackTrace();
		}
}
	
	public void writeStageFirst(){
		try{
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("insert into stage(appNo,stage) values(?,?)");
		pstmt.setInt(1, cust.getApplication().getAppNo());
		pstmt.setString(2, cust.getStage());
		pstmt.executeUpdate();
		
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
