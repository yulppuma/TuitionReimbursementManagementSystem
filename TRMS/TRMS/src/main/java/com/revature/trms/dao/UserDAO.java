package com.revature.trms.dao;

public interface UserDAO {
	
	 	public User getUser(int user_id);
	 	
	    boolean insertUser(User user);
	    boolean updateUser(User user);
	    boolean deleteUser(int ID);
}
