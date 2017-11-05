package com.revature.trms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface BencoDAO {
	
 	public Benco getBenco(int user_id);
 	
 	public Benco getBencoByCreds(String un, String pw) throws SQLException;
 	
 	public Benco extractBencoFromResultSet(ResultSet rs) throws SQLException;
    boolean insertUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(int ID);

}
