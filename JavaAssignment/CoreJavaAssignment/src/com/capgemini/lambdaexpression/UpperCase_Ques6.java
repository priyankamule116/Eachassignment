package com.capgemini.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class MyOperator implements UnaryOperator<String>{

	@Override
	public String apply(String t) {
		// TODO Auto-generated method stub
		return t.toUpperCase();
	}
	
}
public class UpperCase_Ques6 {

	 public static void main(String[] args) {
	        List<String> li = new ArrayList<>();
	        li.add("Subrat");
	        li.add("saroj");
	        li.add("nilanchal");
	        li.add("namita");
	        System.out.println("Elements in list are:");
	        System.out.println(li);
	        System.out.println();

	        li.replaceAll(new MyOperator());
	        System.out.println("Elements in list after replacing with upper case letters are:");
	        System.out.println(li);
	    }

}
