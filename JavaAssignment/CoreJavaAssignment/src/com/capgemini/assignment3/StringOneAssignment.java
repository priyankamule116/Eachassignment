package com.capgemini.assignment3;

public class StringOneAssignment {

	public static void main(String[] args) {
		// Declaration of String
		String str = "Hello World";
		// length method will print the length of the string including space
		System.out.println("The length of String is: " + str.length());

		String str1 = "Hello";
		String str2 = "How are you?";
		// 2)There are two ways to we can join two string
		System.out.println(str1.concat(str2));
		System.out.println(str1 + str2);
		// 3)
		String string = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("LowerCase: " + string.toLowerCase());
		System.out.println("UpperCase: " + string.toUpperCase());
		System.out.println("After Replacing a: " + string.replace('a', '$'));
		System.out.println("Checking for word collection: " + string.contains("collection"));
		System.out.println(
				string.equals("java string pool refers to collection of strings which are stored in heap memory"));

	}

}
