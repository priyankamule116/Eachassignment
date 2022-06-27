package com.capgemini.assignment1;

import java.util.Scanner;

public class CUIBasedApplication {

		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			
			int attempts;
			for(attempts=1;attempts<=3;attempts++)
			{
				System.out.println("Enter user");
				String user=sc.next();
				System.out.println("Enter password =>should  only numeric");
				int password=sc.nextInt();
			System.out.println("User :"+ user);
			System.out.println("Password :"+password);
			System.out.println("Succesfully logged");
			//attempts++;
			}
			if(attempts>=3) {
			System.out.println("Contact Admin");
			}
			sc.close();
		}
		
	
}
