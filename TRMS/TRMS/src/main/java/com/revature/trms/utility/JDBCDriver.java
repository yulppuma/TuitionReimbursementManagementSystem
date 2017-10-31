package com.revature.trms.utility;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDriver {
	public static void main(String[] args) {
		try(Connection conn = ConnectionFactory.getInstance().getConnection()){
			System.out.println(conn);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

