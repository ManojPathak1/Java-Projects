package com.bank.los.helper;

import java.util.Calendar;

import com.bank.los.dto.CustomerDTO;

public class LoanCalculationHelper {

	double loan;
	int tenure;
	CustomerDTO cust;
	double income;
	double assetValue;
	
	public LoanCalculationHelper(CustomerDTO cust) {
		this.cust=cust;
	}
	public double getLoanValue(){
		
		income=cust.getPersonalInfoDTO().getIncomePA();
		assetValue=cust.getPersonalInfoDTO().getAssetValue();
		loan=0.25*income;
		int tenureTime=this.getTenure();
		loan=loan*tenureTime*12;
		loan=loan+0.50*assetValue;
		return loan;
	}
	
	public int getTenure(){
		
		int age = Calendar.getInstance().get(Calendar.YEAR)-cust.getBirth().getYear();
		if(age>=60){
		tenure=4;	
		}
		else if(age<60&&age>=50){
			tenure=5;
		}
		else if(age<50&&age>=40){
			tenure=7;
		}
		else if(age>=30&&age<40){
			tenure=10;
		}
		else if(age>=20&&age<30){
			tenure=15;
		}
		
		return tenure;
	}
	
}
