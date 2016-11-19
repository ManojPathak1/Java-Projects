package com.bank.los.dto;

public class LoanDTO {
private String typeOfLoan;
private int tenure;
private double amount;
public String getTypeOfLoan() {
	return typeOfLoan;
}
public void setTypeOfLoan(String typeOfLoan) {
	this.typeOfLoan = typeOfLoan;
}
public int getTenure() {
	return tenure;
}
public void setTenure(int tenure) {
	this.tenure = tenure;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}

}
