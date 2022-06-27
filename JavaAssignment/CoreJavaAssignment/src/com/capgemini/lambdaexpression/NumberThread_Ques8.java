package com.capgemini.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class NumberThread_Ques8 {

	 public static void main(String[] args) {
	        List<Integer> Numbers=new ArrayList<>();
	        Numbers.add(1);
	        Numbers.add(2);
	        Numbers.add(3);
	        Numbers.add(4);
	        Numbers.add(5);

	        Thread t1=new Thread(()-> Numbers.forEach(i -> System.out.println(i)));
	        t1.start();
	    }
}
