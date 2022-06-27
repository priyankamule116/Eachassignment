package com.capgemini.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class FirstLetter_Ques5 {

    public static void main(String[] args) {
        List<String> Names=new ArrayList<>();
        Names.add("Subrat");
        Names.add("Saroj");
        Names.add("Krishna");
        Names.add("Kedar");
        Names.add("Pravin");

        StringBuilder result=new StringBuilder();
        Names.forEach(s ->result.append(s.charAt(0)));
        System.out.println(result+" ");
        
    }

}
