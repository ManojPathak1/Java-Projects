package com.bank.los.dto;

public class AddressDTO {
	private String firstAddressLine;
	private String secondAddressLine;
	private String thirdAddressLine;
	private String state;
	private String city;
	private String pincode;
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFirstAddressLine() {
		return firstAddressLine;
	}
	public void setFirstAddressLine(String firstAddressLine) {
		this.firstAddressLine = firstAddressLine;
	}
	public String getSecondAddressLine() {
		return secondAddressLine;
	}
	public void setSecondAddressLine(String secondAddressLine) {
		this.secondAddressLine = secondAddressLine;
	}
	public String getThirdAddressLine() {
		return thirdAddressLine;
	}
	public void setThirdAddressLine(String thirdAddressLine) {
		this.thirdAddressLine = thirdAddressLine;
	}
}
