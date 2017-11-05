package com.revature.trms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DirectSupervisorDAO {
	
	public DirectSupervisor getDirectSupervisor(int uid) throws SQLException;
	
	public DirectSupervisor getDirectSupervisorByCreds(String un, String pw) throws SQLException;
	
	public DirectSupervisor extractDirectSupervisorFromResultSet(ResultSet rs) throws SQLException;
}
