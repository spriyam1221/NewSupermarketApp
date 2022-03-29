package com.supermarketTest.daoTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.supermarketTest.modelTest.UserTest;
import com.supermarketapp.validation.BuyItems;

public class BuyItemsTest {
	private static Logger log = LogManager.getLogger(UserTest.class);
	public static void main(String[] args) throws Exception {
		
		BuyItems.allitems();

	}
	
}
