package com.bank.los.dto;

public class CustomerDTO {
	
	ApplicationNoDTO application;
private String firstName;
private String middleName;
private String lastName;
private String gender;
private String phone;
private String emailId;
private String nationality;
private LoanDTO loan;
private BirthDTO birth;
private AddressDTO address;
private String stage;
CompanyDTO companyDTO;
PersonalInfoDTO personalInfoDTO;
public CompanyDTO getCompanyDTO() {
	return companyDTO;
}
public void setCompanyDTO(CompanyDTO companyDTO) {
	this.companyDTO = companyDTO;
}
public PersonalInfoDTO getPersonalInfoDTO() {
	return personalInfoDTO;
}
public void setPersonalInfoDTO(PersonalInfoDTO personalInfoDTO) {
	this.personalInfoDTO = personalInfoDTO;
}
public String getStage() {
	return stage;
}
public void setStage(String stage) {
	this.stage = stage;
}
public AddressDTO getAddress() {
	return address;
}
public void setAddress(AddressDTO address) {
	this.address = address;
}
public BirthDTO getBirth() {
	return birth;
}
public void setBirth(BirthDTO birth) {
	this.birth = birth;
}
public LoanDTO getLoan() {
	return loan;
}
public void setLoan(LoanDTO loan) {
	this.loan = loan;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}

public ApplicationNoDTO getApplication() {
		return application;
	}
	public void setApplication(ApplicationNoDTO application) {
		this.application = application;
	}

}
