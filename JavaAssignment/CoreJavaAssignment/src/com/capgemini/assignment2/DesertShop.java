package com.capgemini.assignment2;

import java.util.Scanner;

abstract class Desertitem {
	abstract int getCost(int cost);
}

class CandyItem extends Desertitem {
	int dollarCurrency = 60;

	@Override
	int getCost(int cost) {
		return cost * dollarCurrency;
	}
}

class Cookie extends Desertitem {
	int euroCurrency = 70;

	@Override
	int getCost(int cost) {
		return cost * euroCurrency;
	}

}

class IceCream extends Desertitem {
	@Override
	int getCost(int cost) {
		return cost;
	}
}

class DesertItems {
	public String addItemsToStorage(String item1, String item2, String item3) {
		return item1 + item2 + item3 + " : 3 Deserts added succesfully";
	}

}

public class DesertShop extends DesertItems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the role : customer(OR)owner ");
		String role = sc.next();
		if (role.equals("owner")) {
			owner();
//			DesertShop ds = new DesertShop();
//			System.out.println(ds.addItemsToStorage("Candy ", " Cookie ", " IceCream "));
		} else if (role.equals("customer")) {
//			System.out.println("Candies available ");
//			System.out.println("------------------");
//			Desertitem desertitem1 = new CandyItem();
//			System.out.println("Candy : " + desertitem1.getCost(1) + " in rupees");
//			Desertitem desertitem2 = new Cookie();
//			System.out.println("Cookie : " + desertitem2.getCost(1) + " in rupees");
//			Desertitem desertitem3 = new IceCream();
//			System.out.println("IceCream : " + desertitem3.getCost(1) + " in rupees");
//			System.out.println("Please select products");
		} else {
			System.out.println("Please enter valid input");}
		}
		
		 public static void owner()
		    {
		        Scanner sc = new Scanner(System.in);
		        String add ="";
		        System.out.println("Welcome Owner");
		        System.out.println("What do u want to add");
		        System.out.println("1.Candy\n 2.Cookie\n 3.Icecream");
		        add = sc.nextLine();
		        if(add.equals("candy"))
		        {
		            System.out.println("candy added to shop");
		        }
		        else if (add.equals("cookie"))
		        {
		            System.out.println("Cookie added to shop");
		        }
		        else if (add.equals("icecream"))
		        {
		            System.out.println("Icecream added to shop");
		        }
		        
		        sc.close();
		    }   
//		        public static void customer()
//		        {
//		            Scanner sc = new Scanner(System.in);
//		            String input = "";
//		            System.out.println("Welcome to our Dessert shop");
//		            System.out.println("What u want to buy");
//		            DessertItem dessertItem = new Icecream(400,12);
//		            dessertItem.getCost();
//		            new Candy(3,12).getCost();
//		            new Cookie(3,8).getCost();
//		            System.out.println("1.Candy\n 2.Cookie\n 3.Icecream");
//		            input = sc.nextLine();
//		            if(input.equals("candy"))
//		            {
//		                System.out.println("Order placed for candy");
//		            }
//		            else if (input.equals("cookie"))
//		            {
//		                System.out.println("Order placed for Cookie");
//		            }
//		            else if (input.equals("icecream"))
//		            {
//		                System.out.println("order placed for icecream");
//		            }
//		        }
		    
		
	

}