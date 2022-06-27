package com.capgemini.collection;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
	   //Creation of object of vector
		Vector<Integer> value=new Vector<>();
	   //Adding the element inside vector using add method
	   value.add(10);
	   value.add(20);
	   value.add(30);
	   value.add(40);
	   value.add(50);
	   value.add(60);
	   value.add(70);
	   value.add(80);
	   value.add(90);
	   value.add(100);
	   //display the vector element
	   System.out.println("Elements are: "+value);
	   
	   //Remove the element  at index 4
	   System.out.println(value.remove(4));
	   System.out.println(value);
	   
	   value.remove(5);
	   //checking vector after removing the element
	    System.out.println("Vector element afyter removing: "+value);
	    
	    //get the element at specified index
	    System.out.println("Element at index 1 is: "+value.indexOf(1));
	}

}
