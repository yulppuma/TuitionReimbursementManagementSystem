package com.revature.trms.dao;

public class User {

	private int userID;
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;
	private String title;
	private String seniorityLevel;
	private String department;
	
	
	
	//default constructor
	public User() {}
	
	
	//constructor without ID
	public User(String first_name, String last_name, String user_name, String pass_word, String title_var, String seniority_level, String department_var) {
		
		firstName = first_name;
		lastName = last_name;
		userName = user_name;
		passWord = pass_word;
		title = title_var;
		seniorityLevel = seniority_level;
		department = department_var;
	}
	
	//constructor with ID
	public User(int user_id, String first_name, String last_name, String user_name, String pass_word, String title, String seniority_level, String department) {
		
		userID = user_id;
		firstName = first_name;
		lastName = last_name;
		userName = user_name;
		passWord = pass_word;
		title = title;
		seniorityLevel = seniority_level;
		department = department;
	}
	

	//getters
	public int getUserID() {
		return userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public String getTitle() {
		return title;
	}
	public String getSeniorityLevel() {
		return seniorityLevel;
	}
	public String getDepartment() {
		return department;
	}
	
	
	//setters
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSeniorityLevel(String seniorityLevel) {
		this.seniorityLevel = seniorityLevel;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
