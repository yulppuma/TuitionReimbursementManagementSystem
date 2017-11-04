package com.revature.trms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.util.ConnFactory;

public class EmployeeDAOImp implements EmployeeDAO {

	Connection connection = ConnFactory.getInstance().getConnection();
	
	public Employee getEmployee(int uid) throws SQLException {
		// TODO Auto-generated method stub
		try{
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Employees WHERE USERID = " + uid);
			
			if(rs.next()){
				return extractEmployeeFromResultSet(rs);
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public Employee extractEmployeeFromResultSet(ResultSet rs){
		Employee emp = new Employee();
		
		try {
			emp.setUsername(rs.getString(1));
			emp.setPassword(rs.getString(2));
			emp.setUid(rs.getInt(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}

}
