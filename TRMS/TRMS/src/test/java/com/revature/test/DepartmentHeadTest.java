package com.revature.test;

import java.sql.SQLException;

import org.junit.Test;

import com.revature.trms.dao.DepartmentHead;
import com.revature.trms.dao.DepartmentHeadDAOImp;

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

}
