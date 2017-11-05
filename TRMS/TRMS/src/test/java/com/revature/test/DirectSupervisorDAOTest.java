package com.revature.test;

import java.sql.SQLException;

import org.junit.Test;

import com.revature.trms.dao.DirectSupervisor;
import com.revature.trms.dao.DirectSupervisorDAOImp;
import com.revature.trms.dao.Employee;

public class DirectSupervisorDAOTest {
	static DirectSupervisorDAOImp dsdi = new DirectSupervisorDAOImp();
	@Test
	public void DirectSupervisortest() {
		DirectSupervisor ds = null;
		try{
			ds = dsdi.getDirectSupervisor(3);
		} catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println(ds.getUsername() + " " + ds.getPassword());
	}

	@Test
	public void getDirectSupervisorByCredTest(){
		DirectSupervisor ds = null;
		try{
			ds = dsdi.getDirectSupervisorByCreds("joe1", "joe");
		} catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println(ds.getUid());
	}
}
