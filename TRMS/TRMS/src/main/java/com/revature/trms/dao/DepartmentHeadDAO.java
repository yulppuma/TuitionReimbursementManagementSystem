package com.revature.trms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DepartmentHeadDAO {
	
	public DepartmentHead getDepartmentHead(int uid) throws SQLException;
	
	public DepartmentHead getDepartmentHeadByCreds(String un, String pw) throws SQLException;
	
	public DepartmentHead extractDepartmentHeadFromResultSet(ResultSet rs) throws SQLException;
}
