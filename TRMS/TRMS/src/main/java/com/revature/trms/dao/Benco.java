package com.revature.trms.dao;

public class Benco {

	private int userID;
	private String userName;
	private String passWord;
	
	
	public Benco() {}
	
	public Benco(String user_name, String pass_word) {
		userName = user_name;
		passWord = pass_word;
	}
	
	//constructor with userID
	public Benco(int user_id, String user_name, String pass_word) {
		userID = user_id;
		userName = user_name;
		passWord = pass_word;
	}
	
	
	//getters
	public int getUserID() {
		return userID;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	
	//setters
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
}
