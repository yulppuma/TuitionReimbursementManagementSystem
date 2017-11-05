package com.revature.trms.dao;

import java.sql.SQLException;

public interface BencoDAO {
	
 	public User getUser(int user_id);
 	
 	public Benco getBencoByCreds(String un, String pw) throws SQLException;
 	
    boolean insertUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(int ID);

}
