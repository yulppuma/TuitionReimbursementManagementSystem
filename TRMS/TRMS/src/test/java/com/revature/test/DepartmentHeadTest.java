package com.revature.test;

import java.sql.SQLException;

import org.junit.Test;

import com.revature.trms.dao.DepartmentHead;
import com.revature.trms.dao.DepartmentHeadDAOImp;
import com.revature.trms.dao.Employee;

public class DepartmentHeadTest {
	static DepartmentHeadDAOImp dhdi = new DepartmentHeadDAOImp();
	@Test
	public void DepartmentHeadTest() {
		DepartmentHead dp = null;
		try{
			dp = dhdi.getDepartmentHead(9);
		} catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println(dp.getUsername() + " " + dp.getPassword());
	}

	@Test
	public void getEmployeeByCredTest(){
		DepartmentHead dh = null;
		try{
			dh = dhdi.getDepartmentHeadByCreds("jimmy", "jimn");
		} catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println(dh.getUid());
	}
}
