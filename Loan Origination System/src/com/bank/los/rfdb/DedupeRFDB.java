package com.bank.los.rfdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bank.los.dto.CustomerDTO;

public class DedupeRFDB {

	ConnectionClassRFDB conn;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	boolean nameMatched;
	boolean birthMatched;
	boolean phoneMatched;
	boolean emailMatched;
	boolean voterIdMatched;
	boolean panMatched;
	boolean nationalityMatched;
	boolean licenseMatched;
	
	
	public boolean readNameDedupe(CustomerDTO cust){
		try{
			nameMatched=false;
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select firstName,middleName,lastName from dedupename where firstName=? and "
				+ "middleName=? and lastName=?");
		pstmt.setString(1, cust.getFirstName());
		pstmt.setString(2, cust.getMiddleName());
		pstmt.setString(3, cust.getLastName());
		rs=pstmt.executeQuery();
		while(rs.next()){
			nameMatched=true;
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return nameMatched;
	}
	
	public boolean readBirthDedupe(CustomerDTO cust){
		try{
			birthMatched=false;
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select date,month,year from dedupedob where date=? and "
				+ "month=? and year=?");
		pstmt.setInt(1, cust.getBirth().getDate());
		pstmt.setString(2, cust.getBirth().getMonth());
		pstmt.setInt(3, cust.getBirth().getYear());
		rs=pstmt.executeQuery();
		while(rs.next()){
			birthMatched=true;
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return birthMatched;
	}
	
	public boolean readPhoneDedupe(CustomerDTO cust){
		try{
			phoneMatched=false;
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select phone from dedupecontact where phone=?");
		pstmt.setString(1, cust.getPhone());
		rs=pstmt.executeQuery();
		while(rs.next()){
			phoneMatched=true;
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return phoneMatched;
	}
	
	public boolean readEmailDedupe(CustomerDTO cust){
		try{
			emailMatched=false;
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select emailId from dedupecontact where emailId=?");
		pstmt.setString(1, cust.getEmailId());
		rs=pstmt.executeQuery();
		while(rs.next()){
			emailMatched=true;
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return emailMatched;
	}
	
	public boolean readVoterIdDedupe(CustomerDTO cust){
		try{
			voterIdMatched=false;
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select voterIdNo from dedupepersonalinfo where voterIdNo=?");
		pstmt.setString(1, cust.getPersonalInfoDTO().getVoterIDNo());
		rs=pstmt.executeQuery();
		while(rs.next()){
			voterIdMatched=true;
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return voterIdMatched;
	}
	
	
	public boolean readNationalityDedupe(CustomerDTO cust){
		try{
			nationalityMatched=false;
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select nationality from dedupepersonalinfo where nationality=?");
		pstmt.setString(1, cust.getNationality());
		rs=pstmt.executeQuery();
		while(rs.next()){
			nationalityMatched=true;
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return nationalityMatched;
	}
	
	public boolean readLicenseDedupe(CustomerDTO cust){
		try{
			licenseMatched=false;
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select licenseNo from dedupepersonalinfo where licenseNo=?");
		pstmt.setString(1, cust.getPersonalInfoDTO().getLicenseNo());
		rs=pstmt.executeQuery();
		while(rs.next()){
			licenseMatched=true;
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return licenseMatched;
	}
	
	public boolean readPanDedupe(CustomerDTO cust){
		try{
			panMatched=false;
			con=ConnectionClassRFDB.getObject().connectionOpen();
		pstmt=con.prepareStatement("select panNo from dedupepersonalinfo where panNo=?");
		pstmt.setString(1, cust.getPersonalInfoDTO().getPanNo());
		rs=pstmt.executeQuery();
		while(rs.next()){
			panMatched=true;
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return panMatched;
	}
}
