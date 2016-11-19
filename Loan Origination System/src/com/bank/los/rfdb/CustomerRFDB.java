package com.bank.los.rfdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bank.los.dto.AddressDTO;
import com.bank.los.dto.ApplicationNoDTO;
import com.bank.los.dto.BirthDTO;
import com.bank.los.dto.CompanyDTO;
import com.bank.los.dto.CustomerDTO;
import com.bank.los.dto.LoanDTO;
import com.bank.los.dto.PersonalInfoDTO;

public class CustomerRFDB {

	ConnectionClassRFDB conn;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	CustomerDTO customerDTO;
	ApplicationNoDTO applicationNoDTO;
	BirthDTO birthDTO;
	PreparedStatement pstmt1;
	PreparedStatement pstmt2;
	PreparedStatement pstmt3;
	PreparedStatement pstmt4;
	PreparedStatement pstmt5;
	PreparedStatement pstmt6;
	LoanDTO loanDTO;
	AddressDTO addressDTO;
	CompanyDTO companyDTO;
	PersonalInfoDTO personalDTO;
	
	
	
	public CustomerDTO readQDE(int appNo){
		try{
		personalDTO=new PersonalInfoDTO();
		addressDTO=new AddressDTO();
		birthDTO=new BirthDTO();
		applicationNoDTO=new ApplicationNoDTO();
	customerDTO=new CustomerDTO();
	loanDTO=new LoanDTO();
	companyDTO=new CompanyDTO();
	
	con=ConnectionClassRFDB.getObject().connectionOpen();
	applicationNoDTO.setAppNo(appNo);
	customerDTO.setApplication(applicationNoDTO);
	pstmt=con.prepareStatement("select firstName,middleName,lastName from customername where appNo=?");
	pstmt.setInt(1, appNo);
	rs=pstmt.executeQuery();
	while(rs.next()){
		customerDTO.setFirstName(rs.getString(1));
		customerDTO.setMiddleName(rs.getString(2));
		customerDTO.setLastName(rs.getString(3));
	}
	
	pstmt1=con.prepareStatement("select date,month,year from customerbirth where appNo=?");
	pstmt1.setInt(1, appNo);
	rs=pstmt1.executeQuery();
	while(rs.next()){
		birthDTO.setDate(rs.getInt(1));
		birthDTO.setMonth(rs.getString(2));
		birthDTO.setYear(rs.getInt(3));
	}
	customerDTO.setBirth(birthDTO);
	
	pstmt2=con.prepareStatement("select loanType,tenure,amount from customerloan where appNo=?");
	pstmt2.setInt(1, appNo);
	rs=pstmt2.executeQuery();
	while(rs.next()){
		loanDTO.setTypeOfLoan(rs.getString(1));
		loanDTO.setTenure(rs.getInt(2));
		loanDTO.setAmount(rs.getDouble(3));
	}
	customerDTO.setLoan(loanDTO);
	
	pstmt3=con.prepareStatement("select gender,nationality,phone,emailId from customerinfo where appNo=?");
	pstmt3.setInt(1, appNo);
	rs=pstmt3.executeQuery();
	while(rs.next()){
		customerDTO.setGender(rs.getString(1));
		customerDTO.setNationality(rs.getString(2));
		customerDTO.setPhone(rs.getString(3));
		customerDTO.setEmailId(rs.getString(4));
	}
		}
	catch(Exception e){
		e.printStackTrace();
	}
		return customerDTO;
	}
	
	public CustomerDTO read(int appNo){
		try{
			personalDTO=new PersonalInfoDTO();
			addressDTO=new AddressDTO();
			birthDTO=new BirthDTO();
			applicationNoDTO=new ApplicationNoDTO();
		customerDTO=new CustomerDTO();
		loanDTO=new LoanDTO();
		companyDTO=new CompanyDTO();
		
		con=ConnectionClassRFDB.getObject().connectionOpen();
		applicationNoDTO.setAppNo(appNo);
		customerDTO.setApplication(applicationNoDTO);
		pstmt=con.prepareStatement("select firstName,middleName,lastName from customername where appNo=?");
		pstmt.setInt(1, appNo);
		rs=pstmt.executeQuery();
		while(rs.next()){
			customerDTO.setFirstName(rs.getString(1));
			customerDTO.setMiddleName(rs.getString(2));
			customerDTO.setLastName(rs.getString(3));
		}
		
		pstmt1=con.prepareStatement("select date,month,year from customerbirth where appNo=?");
		pstmt1.setInt(1, appNo);
		rs=pstmt1.executeQuery();
		while(rs.next()){
			birthDTO.setDate(rs.getInt(1));
			birthDTO.setMonth(rs.getString(2));
			birthDTO.setYear(rs.getInt(3));
		}
		customerDTO.setBirth(birthDTO);
		
		pstmt2=con.prepareStatement("select loanType,tenure,amount from customerloan where appNo=?");
		pstmt2.setInt(1, appNo);
		rs=pstmt2.executeQuery();
		while(rs.next()){
			loanDTO.setTypeOfLoan(rs.getString(1));
			loanDTO.setTenure(rs.getInt(2));
			loanDTO.setAmount(rs.getDouble(3));
		}
		customerDTO.setLoan(loanDTO);
		
		pstmt3=con.prepareStatement("select gender,nationality,phone,emailId from customerinfo where appNo=?");
		pstmt3.setInt(1, appNo);
		rs=pstmt3.executeQuery();
		while(rs.next()){
			customerDTO.setGender(rs.getString(1));
			customerDTO.setNationality(rs.getString(2));
			customerDTO.setPhone(rs.getString(3));
			customerDTO.setEmailId(rs.getString(4));
		}
		
		pstmt4=con.prepareStatement("select firstLine,secondLine,thirdLine,state,city,pincode from address where appNo=?");
		pstmt4.setInt(1, appNo);
		rs=pstmt4.executeQuery();
		while(rs.next()){
			addressDTO.setFirstAddressLine(rs.getString(1));
			addressDTO.setSecondAddressLine(rs.getString(2));
			addressDTO.setThirdAddressLine(rs.getString(3));
			addressDTO.setState(rs.getString(4));
			addressDTO.setCity(rs.getString(5));
			addressDTO.setPincode(rs.getString(6));
		}
		customerDTO.setAddress(addressDTO);
		
		pstmt5=con.prepareStatement("select name,address,contactNo from companyinfo where appNo=?");
		pstmt5.setInt(1, appNo);
		rs=pstmt5.executeQuery();
		while(rs.next()){
			companyDTO.setCompanyName(rs.getString(1));
			companyDTO.setAddress(rs.getString(2));
			companyDTO.setContactNo(rs.getString(3));
		}
		customerDTO.setCompanyDTO(companyDTO);
		
		pstmt6=con.prepareStatement("select voterIdNo,licenseNo,panNo,assetValue,qualification,typeOfJob,incomePA "
				+ "from personalinfo where appNo=?");
		pstmt6.setInt(1, appNo);
		rs=pstmt6.executeQuery();
		while(rs.next()){
		personalDTO.setVoterIDNo(rs.getString(1));
		personalDTO.setLicenseNo(rs.getString(2));
		personalDTO.setPanNo(rs.getString(3));
		personalDTO.setAssetValue(rs.getDouble(4));
		personalDTO.setQualification(rs.getString(5));
		personalDTO.setTypeOfJob(rs.getString(6));
		personalDTO.setIncomePA(rs.getDouble(7));
		
		}
		customerDTO.setPersonalInfoDTO(personalDTO);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return customerDTO;
	}
	
}
