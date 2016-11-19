package com.bank.los.wtdb;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bank.los.dto.CustomerDTO;
import com.bank.los.rfdb.ConnectionClassRFDB;

public class CustomerWTDB {

	ConnectionClassRFDB conn;
	Connection con;
	PreparedStatement pstmt;
	PreparedStatement pstmt1;
	PreparedStatement pstmt2;
	PreparedStatement pstmt3;
	PreparedStatement pstmt4;
	PreparedStatement pstmt5;
	
	public void write(CustomerDTO cust){
		try{
			con=ConnectionClassRFDB.getObject().connectionOpen();
		con.setAutoCommit(false);
		pstmt=con.prepareStatement("insert into appno(appNo) values(?)");
		pstmt.setInt(1, cust.getApplication().getAppNo());
		int a=pstmt.executeUpdate();
		pstmt1=con.prepareStatement("insert into customername(appNo,firstName,middleName,lastName) values(?,?,?,?)");
		pstmt1.setInt(1, cust.getApplication().getAppNo());
		pstmt1.setString(2 ,cust.getFirstName());
		pstmt1.setString(3, cust.getMiddleName());
		pstmt1.setString(4, cust.getLastName());
		int a1=pstmt1.executeUpdate();
		pstmt2=con.prepareStatement("insert into customerbirth(appNo,date,month,year) values(?,?,?,?)");
		pstmt2.setInt(1, cust.getApplication().getAppNo());
		pstmt2.setInt(2, cust.getBirth().getDate());
		pstmt2.setString(3, cust.getBirth().getMonth());
		pstmt2.setInt(4, cust.getBirth().getYear());
		int a2=pstmt2.executeUpdate();
		pstmt3=con.prepareStatement("insert into customerinfo(appNo,gender,nationality,phone,emailId) values(?,?,?,?,?)");
		pstmt3.setInt(1, cust.getApplication().getAppNo());
		pstmt3.setString(2, cust.getGender());
		pstmt3.setString(3, cust.getNationality());
		pstmt3.setString(4, cust.getPhone());
		pstmt3.setString(5, cust.getEmailId());
		int a3=pstmt3.executeUpdate();
		pstmt4=con.prepareStatement("insert into customerloan(appNo,loanType,tenure,amount) values(?,?,?,?)");
		pstmt4.setInt(1, cust.getApplication().getAppNo());
		pstmt4.setString(2, cust.getLoan().getTypeOfLoan());
		pstmt4.setInt(3, cust.getLoan().getTenure());
		pstmt4.setDouble(4, cust.getLoan().getAmount());
		int a4=pstmt4.executeUpdate();
		
		if(a>0&&a1>0&&a2>0&&a3>0&&a4>0){
			con.commit();
		}
		else{
			con.rollback();
		}
	}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void writeQDE(CustomerDTO cust){
		try{
			con=ConnectionClassRFDB.getObject().connectionOpen();
			con.setAutoCommit(false);
			pstmt=con.prepareStatement("insert into address(appNo,firstLine,secondLine,thirdLine,state,city,pincode) values(?,?,?,?,?,?,?)");
			pstmt.setInt(1, cust.getApplication().getAppNo());
			pstmt.setString(2, cust.getAddress().getFirstAddressLine());
			pstmt.setString(3, cust.getAddress().getSecondAddressLine());
			pstmt.setString(4, cust.getAddress().getThirdAddressLine());
			pstmt.setString(5, cust.getAddress().getState());
			pstmt.setString(6, cust.getAddress().getCity());
			pstmt.setString(7, cust.getAddress().getPincode());
			int a=pstmt.executeUpdate();
			pstmt1=con.prepareStatement("insert into personalInfo(appNo,voterIdNo,licenseNo,panNo,assetValue,qualification,"
					+ "typeOfJob,incomePA) values(?,?,?,?,?,?,?,?)");
			pstmt1.setInt(1, cust.getApplication().getAppNo());
			pstmt1.setString(2 ,cust.getPersonalInfoDTO().getVoterIDNo());
			pstmt1.setString(3, cust.getPersonalInfoDTO().getLicenseNo());
			pstmt1.setString(4, cust.getPersonalInfoDTO().getPanNo());
			pstmt1.setDouble(5, cust.getPersonalInfoDTO().getAssetValue());
			pstmt1.setString(6, cust.getPersonalInfoDTO().getQualification());
			pstmt1.setString(7, cust.getPersonalInfoDTO().getTypeOfJob());
			pstmt1.setDouble(8, cust.getPersonalInfoDTO().getIncomePA());
			int a1=pstmt1.executeUpdate();
			
			pstmt2=con.prepareStatement("insert into companyinfo(appNo,name,address,contactNo) values(?,?,?,?)");
			pstmt2.setInt(1, cust.getApplication().getAppNo());
			pstmt2.setString(2, cust.getCompanyDTO().getCompanyName());
			pstmt2.setString(3, cust.getCompanyDTO().getAddress());
			pstmt2.setString(4, cust.getCompanyDTO().getContactNo());
			int a2=pstmt2.executeUpdate();
			
			pstmt3=con.prepareStatement("update stage set stage=? where appNo=?");
			pstmt3.setString(1, cust.getStage());
			pstmt3.setInt(2, cust.getApplication().getAppNo());
			int a3=pstmt3.executeUpdate();
			
			if(a>0&&a1>0&&a2>0&&a3>0){
				con.commit();
			}
			else{
				con.rollback();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
