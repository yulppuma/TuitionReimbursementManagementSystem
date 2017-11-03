package com.revature.trms.dao;

public class User {

	private int userID;
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;
	private String title;
	private int seniorityLevel;
	private String department;
	
	
	
	//default constructor
	public User() {}
	
	
	//constructor without ID
	public User(String user_name, String pass_word, String first_name, String last_name, String title_var, int seniority_level, String department_var) {
		
		userName = user_name;
		passWord = pass_word;
		firstName = first_name;
		lastName = last_name;
		title = title_var;
		seniorityLevel = seniority_level;
		department = department_var;
	}
	
	//constructor with ID
	public User(int user_id, String user_name, String pass_word, String first_name, String last_name, String title_var, int seniority_level, String department_var) {
		
		userID = user_id;
		firstName = first_name;
		lastName = last_name;
		userName = user_name;
		passWord = pass_word;
		title = title_var;
		seniorityLevel = seniority_level;
		department = department_var;
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
	public int getSeniorityLevel() {
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
	public void setSeniorityLevel(int seniorityLevel) {
		this.seniorityLevel = seniorityLevel;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
