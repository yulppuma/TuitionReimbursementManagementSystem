package com.revature.trms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface EmployeeDAO {
	
	public Employee getEmployee(int uid) throws SQLException;
	
	public Employee getEmployeeByCreds(String un, String pw) throws SQLException;
	
	public Employee extractEmployeeFromResultSet(ResultSet rs) throws SQLException;
}
