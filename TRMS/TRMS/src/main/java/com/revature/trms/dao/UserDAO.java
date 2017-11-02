package com.revature.trms.dao;

public interface UserDAO {
	
	 	public User getUser(int user_id);
	    boolean insertUser();
	    boolean updateUser();
	    boolean deleteUser();
}
