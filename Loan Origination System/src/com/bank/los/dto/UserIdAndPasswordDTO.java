package com.bank.los.dto;

import java.util.ArrayList;

public class UserIdAndPasswordDTO {
private ArrayList<String> userName=new ArrayList<>();
private ArrayList<String> password=new ArrayList<>();
private ArrayList<String> status=new ArrayList<>();
public ArrayList<String> getUserName() {
	return userName;
}
public void setUserName(ArrayList<String> userName) {
	this.userName = userName;
}
public ArrayList<String> getPassword() {
	return password;
}
public void setPassword(ArrayList<String> password) {
	this.password = password;
}
public ArrayList<String> getStatus() {
	return status;
}
public void setStatus(ArrayList<String> status) {
	this.status = status;
}



}
