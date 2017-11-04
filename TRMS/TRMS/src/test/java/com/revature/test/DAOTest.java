package com.revature.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.revature.trms.dao.User;
import com.revature.trms.dao.UserDAOImpl;
import com.revature.util.ConnFactory;

public class DAOTest {

	static UserDAOImpl dao = new UserDAOImpl();

	@Before
	public void runBeforeTest() {
		Connection connection = ConnFactory.getInstance().getConnection();
	}

	@Test
	public void getUserTest() {
		// given
		User guy = null;

		// when
		guy = dao.getUser(8);
		String expected = guy.getFirstName();
		String actual = "Diego";

		// then
		assertEquals(expected, actual);
	}

	@Test
	public void getUserByUsernameAndPasswordTest() {
		// given
		User guy = null;
		String username = "bcdh";
		String password = "pass";

		// when
		guy = dao.getUserByUserNameAndPassword(username, password);

		String expected = guy.getFirstName();
		String actual = "Joe";

		// then
		assertEquals(expected, actual);
	}

//	@Test
//	public void insertUserTest() {
//		// given
//		User guy = new User("daotester02", "password", "yul", "man", "Assistant", 1, "PEGA");
//
//		// when
//		boolean expected = true;
//		boolean actual = dao.insertUser(guy);
//
//		// then
//		assertEquals(expected, actual);
//	}



//	@Test
//	public void updateUserTest() {
//		// given
//		User guy = new User(21, "daotester00", "password01", "super super", "man", "Assistant Tester", 2, "PEGA");
//
//		// when
//		boolean expected = true;
//		boolean actual = dao.updateUser(guy);
//
//		// then
//		assertEquals(expected, actual);
//	}
	
	@Test
	public void deleteUserTest() {
		// given

		// when
		boolean expected = true;
		boolean actual = dao.deleteUser(31);

		// then
		assertEquals(expected, actual);
	}
	
}
