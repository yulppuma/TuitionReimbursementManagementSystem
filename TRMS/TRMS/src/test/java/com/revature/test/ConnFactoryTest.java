package com.revature.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.revature.util.ConnFactory;

public class ConnFactoryTest {

	public static ConnFactory cf = ConnFactory.getInstance();
	@Test
	public void ConnectionTest() {
		Connection conn = cf.getConnection();
		Statement stmt;
		ResultSet rs;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM DUMMY");
			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
