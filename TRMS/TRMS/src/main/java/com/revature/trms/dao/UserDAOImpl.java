package com.revature.trms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.util.ConnFactory;

public class UserDAOImpl implements UserDAO {

	Connection connection = ConnFactory.getInstance().getConnection();
	
	@Override
	public User getUser(int user_id) {
		try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE USERID=" + user_id);
            if(rs.next())
            {
                User user = new User();
                user.setUserID(rs.getInt("USERID") );
                user.setFirstName(rs.getString("FNAME") );
                user.setLastName(rs.getString("LNAME") );
                user.setPassWord(rs.getString("PSWD") );
                user.setTitle(rs.getString("TITLE"));
                user.setSeniorityLevel(rs.getString("SLEVEL"));
                user.setDepartment(rs.getString("DEPARTMENT"));
                
                return user;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    return null;
	}

	
	
	public boolean insertUser() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateUser() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}	

}
