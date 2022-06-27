package com.capgemini.lambdaexpression;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValue_Ques7 {

	public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(33,"Subrat");
        map.put(10,"Krishna");
        map.put(28,"Pravin");


        StringBuilder result=new StringBuilder();

        map.forEach((k, v) -> result.append(k).append(v));
        System.out.println("Result String is : "+result);
        
    }

}
