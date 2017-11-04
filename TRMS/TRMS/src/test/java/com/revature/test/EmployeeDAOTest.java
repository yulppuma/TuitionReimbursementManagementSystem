package com.revature.test;

import java.sql.SQLException;

import org.junit.Test;

import com.revature.trms.dao.Employee;
import com.revature.trms.dao.EmployeeDAOImp;

public class EmployeeDAOTest {
	static EmployeeDAOImp edi = new EmployeeDAOImp();
	@Test
	public void getEmployeetest() {
		Employee emp = null;
		try {
			emp = edi.getEmployee(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(emp.getUsername() + " " + emp.getPassword());
	}

}
