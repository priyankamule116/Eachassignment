package com.capgemini.assignment2;

public class SingletonClass_Ques1 {
	// Singleton class
	// A singleton class is a class that can have only one object at a time
	// we can not create the object of a singleton class more than once.
	// However, if we try to create a object of a singletone class after the fisrt
	// time, the new reference variable
	// will also point to the first instance created

	// 1)Make the constructor is private
	private static SingletonClass_Ques1 uniqueInstance;
    
	public String str;
	private SingletonClass_Ques1() {
	}
    
	//To avoid more than one instance we can do method declare as synchronized
	public static synchronized SingletonClass_Ques1 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonClass_Ques1();
		}
		return uniqueInstance;

	}
	public static void main(String[] args) {
		SingletonClass_Ques1 single1=SingletonClass_Ques1.getInstance();
		single1.str="Hi I am the singleton class String";
	    System.out.println("First reference: "+single1.str);
	    SingletonClass_Ques1 single2=SingletonClass_Ques1.getInstance();
	    single2.str="Hii";
	    System.out.println("Second reference: "+single2.str);
	}

}