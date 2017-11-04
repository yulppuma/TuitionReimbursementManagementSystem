package com.revature.trms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface TRDAO {
	
	public void updateTR(TuitionReimbursement tr) throws SQLException;
	
	public void createAccount(User u) throws SQLException;
	
	public TuitionReimbursement getTR(int id) throws SQLException;
	
	public void insertTR(TuitionReimbursement tr) throws SQLException;
	
	public List<TuitionReimbursement> getMyTR(User u) throws SQLException;
	
	public TuitionReimbursement extractTRFromResultSet(ResultSet rs) throws SQLException;
}
