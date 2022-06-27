package com.capgemini.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class OddLength_Ques4 {

	 public static void main(String[] args) {
	        List<String> Names=new ArrayList<>();
	        Names.add("Subrat");
	        Names.add("Saroj");
	        Names.add("Krishna");
	        Names.add("Kedar");
	        Names.add("Pravin");
	        
	        
	        Names.removeIf(s ->(s.length())%2!=0);

	        for (String n : Names) {
	            System.out.println(n);
	        }

	}

}
