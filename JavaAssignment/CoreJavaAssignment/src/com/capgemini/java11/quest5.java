package com.capgemini.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

//public class quest5 {
//public static void main(String args[])
//{
//	int total=0,option,price,count=1;
//	var path= "C:\\Users\\THYAGC\\Documents\\price.txt";
//	var path1="C:\\Users\\THYAGC\\Documents\\total.txt";
//	String response="yes";
//	
//	Scanner sc=new Scanner(System.in);
//	
//	do {
//		System.out.println("select option \n 1:insert price \n 2:view purchase 3:exit");
//		option=sc.nextInt();
//		
//		if(option==1) {
//			while(response.equals("yes")) {
//				System.out.println("insert price"+count);
//				count++;
//				price=sc.nextInt();
//				total=+price;
//				
//				try {
//					Files.writeString(Path.of(path),csq:price+"\n",StandardOpenOption.APPEND);
//					
//				}
//				catch(IOException e) {}
//				
//				sc.nextLine();
//				System.out.println("do u want to add more items? (yes\no)");
//				response.equals("no");
//				break;
//			}
//			if(option==2) {
//				System.out.println(price+" "+total);
//			}
//		}
//	