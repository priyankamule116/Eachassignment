package com.capgemini.collection;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// Creating an instance of stack class
		Stack<Integer> stk=new Stack<>();
		
		//Checking stack is empty or not
		boolean value=stk.empty();
		System.out.println("The stack is empty?: "+value);
		
		//pushing element in to the stack
		stk.push(10);
		stk.push(30);
		stk.push(20);
		stk.push(90);
		stk.push(40);
		stk.push(80);
		//Retrieve the element in to the stack
		System.out.println("Elements in stack: "+stk);
		
		value=stk.empty();
		System.out.println("The stack is empty?: "+value);
		
		//removing the element in to the stack
		stk.pop();
		System.out.println("After removing: "+stk);
		
		

	}

}
