package com.revature.trms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.util.ConnFactory;

public class BencoDAOImp implements BencoDAO {

	Connection connection = ConnFactory.getInstance().getConnection();
	
	public Benco getBenco(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Benco getBencoByCreds(String un, String pw) throws SQLException {
		// TODO Auto-generated method stub
		try{
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM BENCO WHERE USERNAME = '" + un + "' AND PSWD = '" + pw + "'");
			if(rs.next()){
				return extractBencoFromResultSet(rs);
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}

	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(int ID) {
		// TODO Auto-generated method stub
		return false;
	}

	public Benco extractBencoFromResultSet(ResultSet rs){
		// TODO Auto-generated method stub
		Benco bc = new Benco();
		try{
			bc.setUserName(rs.getString(1));
			bc.setPassWord(rs.getString(2));
			bc.setUserID(rs.getInt(3));
		} catch(SQLException e){
			e.printStackTrace();
		}
		return bc;
	}

}
