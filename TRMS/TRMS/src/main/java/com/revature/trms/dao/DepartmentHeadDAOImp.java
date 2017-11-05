package com.revature.trms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.util.ConnFactory;

public class DepartmentHeadDAOImp implements DepartmentHeadDAO {

	Connection connection = ConnFactory.getInstance().getConnection();
	
	public DepartmentHead getDepartmentHead(int uid) throws SQLException {
		// TODO Auto-generated method stub
		try{
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM DEPARTMENTHEADS WHERE USERID = " + uid);
			
			if(rs.next()){
				return extractDepartmentHeadFromResultSet(rs);
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}

	public DepartmentHead getDepartmentHeadByCreds(String un, String pw) throws SQLException {
		// TODO Auto-generated method stub
		try{
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM DEPARTMENTHEADS WHERE USERNAME = '" + un + "' AND PSWD = '" + pw + "'");
			
			if(rs.next()){
				return extractDepartmentHeadFromResultSet(rs);
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public DepartmentHead extractDepartmentHeadFromResultSet(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		DepartmentHead dp = new DepartmentHead();
		try{
			dp.setUsername(rs.getString(1));
			dp.setPassword(rs.getString(2));
			dp.setUid(rs.getInt(3));
		} catch(SQLException e){
			e.printStackTrace();
		}
		return dp;
	}

}
