package com.revature.trms.dao;

public class User {

	private int userID;
	private String fName;
	private String lName;
	private String userName;
	private String passWord;
	
	
	public int getUserID() {
		return userID;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
