package com.revature.trms.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.util.ConnFactory;

public class UserDAOImpl implements UserDAO {

	Connection connection = ConnFactory.getInstance().getConnection();

	public User getUser(int user_id) {
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM USERS WHERE USERID=" + user_id);

			if (rs.next()) {
				return extractUserFromResultSet(rs);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public User extractUserFromResultSet(ResultSet rs) throws SQLException {

		User user = new User();

		user.setUserID(rs.getInt("USERID"));
		user.setFirstName(rs.getString("FNAME"));
		user.setLastName(rs.getString("LNAME"));
		user.setUserName(rs.getString("USERNAME"));
		user.setPassWord(rs.getString("PSWD"));
		user.setTitle(rs.getString("TITLE"));
		user.setSeniorityLevel(rs.getInt("SLEVEL"));
		user.setDepartment(rs.getString("DEPARTMENT"));

		return user;
	}

	public User getUserByUserNameAndPassword(String user, String pass) {

		Connection connection = ConnFactory.getInstance().getConnection();

		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM USERS WHERE USERNAME=? AND PSWD=?");
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return extractUserFromResultSet(rs);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	
	
	public boolean insertUser(User user) {

		Connection connection = ConnFactory.getInstance().getConnection();

		try {
			CallableStatement cs = connection.prepareCall(
					"{call ADD_USER(?,?,?,?,?,?,?)}");

			cs.setString(1, user.getUserName());
			cs.setString(2, user.getPassWord());
			cs.setString(3, user.getFirstName());
			cs.setString(4, user.getLastName());
			cs.setString(5, user.getTitle());
			cs.setInt(6, user.getSeniorityLevel());
			cs.setString(7, user.getDepartment());

			cs.executeQuery();
			return true;
//			if (i == 1) {
//				return true;
			} catch (SQLException ex) {
			ex.printStackTrace();
			return false;
			}
	}


	//updates users by username
	public boolean updateUser(User user) {
		
		Connection connection = ConnFactory.getInstance().getConnection();

	    try {
	        PreparedStatement ps = connection.prepareStatement("UPDATE USERS SET PSWD=?, FNAME=?, LNAME=?, TITLE=?, SLEVEL=?, DEPARTMENT=? WHERE USERID=?");
	        
			ps.setString(1, user.getPassWord());
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setString(4, user.getTitle());
			ps.setInt(5, user.getSeniorityLevel());
			ps.setString(6, user.getDepartment());
			ps.setInt(7, user.getUserID());
			
	        int i = ps.executeUpdate();
	      if(i == 1) {
	    return true;
	      }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	    return false;
	}

	
	
	
	public boolean deleteUser(int ID) {
		
		Connection connection = ConnFactory.getInstance().getConnection();

	    try {
	    	PreparedStatement ps = connection.prepareStatement("DELETE FROM USERS WHERE USERID=" + ID);
	    	int i = ps.executeUpdate();
	      if(i == 1) {
	    return true;
	      }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	    return false;
	}
}
