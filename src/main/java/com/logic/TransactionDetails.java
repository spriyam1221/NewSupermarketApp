package com.logic;

import java.util.List;

import com.dao.TransactionDetailsDAO;
import com.model.Items;

public class TransactionDetails {
	public static void myTransactionDetails() throws Exception
	{
		List<Items> products=TransactionDetailsDAO.allTransactions();
		for(Items prod:products)
		{
			System.out.println(prod.getProductName()+" "+prod.getPrice()+" "+prod.getDate());
		}

	}


}
