package com.capgemini.assignment3;

public class StringBuilderAssignment {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("StringBuilder");
		System.out.println(sb1.append("is a peer class of String "));
		System.out.println(sb1.append("that provides much of "));
		System.out.println(	sb1.append("the functionality of strings"));
		//2)
		StringBuilder sb2=new StringBuilder("it is used to  at the specified index position");
		System.out.println(sb2.insert(13, " insert text "));
		StringBuilder sb3=new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(sb3.reverse());
		//StringBuilder is much faster than stringbuffer since this is non-shyncronized.
		//And not thread safe.
	}

}
