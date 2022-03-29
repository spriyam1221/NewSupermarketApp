package com.supermarketTest.daoTest;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.supermarketTest.modelTest.UserTest;
import com.supermarketapp.dao.ItemDAO;

public class AllItemsDAOTest {
	private static Logger log = LogManager.getLogger(UserTest.class);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ItemDAO.allitems();
	}
}
