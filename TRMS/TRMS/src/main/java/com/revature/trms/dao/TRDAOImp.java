package com.revature.trms.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.util.ConnFactory;

public class TRDAOImp implements TRDAO {

	Connection connection = ConnFactory.getInstance().getConnection();
	
	public void updateTR(TuitionReimbursement tr) throws SQLException {
		// TODO Auto-generated method stub

	}

	public TuitionReimbursement getTR(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertTR(TuitionReimbursement tr) throws SQLException {
		// TODO Auto-generated method stub

		try {
			CallableStatement cs = connection.prepareCall(
					"{call ADD_TR(?,?,?,?,?,?,?, ?, ?, ?)}");

			cs.setDouble(1, tr.getTcost());
			cs.setString(2, tr.getLoc());
			cs.setString(3, tr.getDetails());
			cs.setString(4, tr.getJustification());
			cs.setString(5, tr.getEventtype());
			cs.setInt(9, tr.getUid());
			cs.executeQuery();
//			if (i == 1) {
//				return true;
			} catch (SQLException ex) {
			ex.printStackTrace();
			}
	}

	public List<TuitionReimbursement> getMyTR(User u) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public TuitionReimbursement extractTRFromResultSet(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
