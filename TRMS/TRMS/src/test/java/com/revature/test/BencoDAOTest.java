package com.revature.test;

import java.sql.SQLException;

import org.junit.Test;

import com.revature.trms.dao.Benco;
import com.revature.trms.dao.BencoDAOImp;

public class BencoDAOTest {

	static BencoDAOImp bcdi = new BencoDAOImp();
	
	@Test
	public void BencoTest() {
		Benco bc = null;
		try {
			bc = bcdi.getBencoByCreds("jimmy", "jimn");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bc.getUserID());
	}

}
