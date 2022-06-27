package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		// Create a object of arrayList
		ArrayList list = new ArrayList<>();
		// add the elements in to the list
		list.add(100);
		list.add(206);
		list.add(30);
		list.add(10);
		list.add(40);
		System.out.println(list);

		//Removing the element
		list.remove(4);
        
		//accessing the element
		list.get(2);
		System.out.println(list.get(2));
        
		//changing the element
		list.set(3, 60);
		System.out.println(list);
        
		System.out.println("===========================");
		//we can retrieve the element with the help of for each loop
		System.out.println("by using for each loop: ");
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("=======================");
		// we can also sort the method
		Collections.sort(list);
		System.out.println(list);
        
		// by using iterator method
		System.out.println("iterator method");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
        
		}
		System.out.println("===========================");
        
		// we can also clear the arrays with the help of remove method and clear method
		list.clear();
		System.out.println(list);
		
		

	}

}
