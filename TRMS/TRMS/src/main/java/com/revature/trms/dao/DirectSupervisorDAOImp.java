package com.revature.trms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.util.ConnFactory;

public class DirectSupervisorDAOImp implements DirectSupervisorDAO {

	Connection connection = ConnFactory.getInstance().getConnection();
	
	public DirectSupervisor getDirectSupervisor(int uid) throws SQLException {
		// TODO Auto-generated method stub
		try{
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Supervisors WHERE USERID = " + uid);
			
			if(rs.next()){
				return extractDirectSupervisorFromResultSet(rs);
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}

	public DirectSupervisor extractDirectSupervisorFromResultSet(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		DirectSupervisor ds = new DirectSupervisor();
		try{
			ds.setUsername(rs.getString(1));
			ds.setPassword(rs.getString(2));
			ds.setUid(rs.getInt(3));
		} catch (SQLException e){
			e.printStackTrace();
		}
		return ds;
	}

}
