package com.logic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.ConnectionUtil;
import com.dao.FindAllItems;
import com.model.Items;

public class BuyItems {
	static Scanner sc=new Scanner(System.in);
	static List<Integer> totalItems=null;
	public static void allitems() throws Exception
	{
		totalItems=new ArrayList<Integer>();
		List<Items> prod=FindAllItems.allitems();
		for(Items items:prod)
		{
			System.out.println(items.getId()+"  "+items.getCategory()+"  "+items.getitemsName()+"  "+items.getBrandName()+"  "+items.getPrice());
		}
		buyitems();
	}
	public static void buyitems() throws Exception
	{
		System.out.println("Select the product you want by choosing the id");
		System.out.println("Enter 0 to exit and enter 1 continue to payment");
		int id;
		while(sc.hasNext())
		{
			id=sc.nextInt();
			if(id==1)
			{
				break;
			}
			else
			{
			  totalItems.add(id);
			}


		}
		int total=0;
	    for(Integer user:totalItems)
		{

			String query="select price from SuperMarket_product where id='"+user+"'";
			int price=ConnectionUtil.runQueryforPrice(query);
			total=total+price;	
		}
		System.out.println("Your total price is: "+total);
		System.out.println("1) Continue payment");
		System.out.println("2)select more items");
		int choice=sc.nextInt();
		if(choice==1)
		{
			int payment=paymentMethod(total);
			if(payment==1)
			{
				for(Integer productId:totalItems)
				{
					LocalDate date=LocalDate.now();
					String query="insert into grocery_transaction(user_id,product_id,purchased_on)values('"+2+"','"+productId+"','"+date+"')";
					ConnectionUtil.runQueryForInsertion(query);
					System.out.println("Payment Completed...");
				}
			}
		}
		else if(choice==2)
		{
			buyitems();
		}

	}
	public static int paymentMethod(int total)
	{
		System.out.println("Enter upi id");
		String upiId=sc.next();
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		if(amount<total || amount>total)
		{
			System.out.println("please enter only requird amount");
			paymentMethod(total);
		}
		else if(amount==total)
		{
			return 1;

		}
		return 1;



	}

}


 
	


