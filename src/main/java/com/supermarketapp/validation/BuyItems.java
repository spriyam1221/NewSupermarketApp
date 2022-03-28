package com.supermarketapp.validation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.supermarketapp.dao.ItemDAO;
import com.supermarketapp.model.Item;
import com.supermarketapp.util.ConnectionUtil;

public class BuyItems {
	static Scanner sc=new Scanner(System.in);
	static List<Integer> totalItems=null;
	public static void allitems() throws Exception
	{
		totalItems=new ArrayList<Integer>();
		List<Item> prod=ItemDAO.allitems();
		for(Item items:prod)
		{
			System.out.println(items.getId()+"  "+items.getSection()+"  "+items.getitemsName()+"  "+items.getBrandName()+"  "+items.getPrice());
		}
		buyitems();
	}
	public static void buyitems() throws Exception
	{
		System.out.println("Select the product you want by choosing the id");
		System.out.println("Enter 0  continue to payment");
		int id;
		while(sc.hasNext())
		{
			id=sc.nextInt();
			if(id==0)
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

			String query="select price from SuperMarket_items where id='"+user+"'";
			int price=ConnectionUtil.runQueryforPrice(query);
			total=total+price;	
		}
		System.out.println("Your total price is: "+total);
		System.out.println("1) Continue payment");
		System.out.println("2)select more items");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("1-->online  transaction");
			System.out.println("2-->Cash on delivery");
		}
		else if(choice==2)
		{
			buyitems();
		}
			int  num= sc. nextInt();
			if(num==1) {
			
			
				System.out.println("1-->goole pay");
				System.out.println("2-->credit card");
				
			}
			else if(num==2) {
				System.out.println("order is successfully placed");
			}
				int num1 = sc. nextInt();
				if(num1==1)
				{
			
							googlepayPaymentMethod(total);
							System.out.println("payment successfull");
				}
				
					else if (num1==2)
					{
						
								creditCardPaymentMethod(total);
					             System.out.println("payment sucessfull");
			}
				
		}
	
			

	
	public static int googlepayPaymentMethod(int total)
	{
		System.out.println("Enter upi id");
		String upiId=sc.next();
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		if(amount<total || amount>total)
		{
			System.out.println("please enter only requird amount");
			
		}
		else if(amount==total)
		{
			return 1;
		}
		return 1;



	}
	public static int creditCardPaymentMethod(int total)
	{
		System.out.println("Enter your bank name");
		String n=sc.next();
		System.out.println("Enter your 4 digit ccv number");
		int n1=sc.nextInt();
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		
		
		System.out.println(amount +"---"+ total);
		if(amount<total || amount>total)
		{
			System.out.println("please enter only requird amount");
			}
		else if(amount==total)
		{
			return 1;

		}
		return 1;



}
}


 
	


