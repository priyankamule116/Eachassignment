package com.capgemini.generics;

public class Paired<Key, Value> {
   
	//class if of generic type
	Key key;
	Value value;
	
	//Parametrized Constructor
	public Paired(Key key, Value value) {
		super();
		this.key = key;
		this.value = value;
	}
	//Getter and Setter method
	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public static void main(String[] args) {
		//Creation of first object
		Paired<String, String> pair=new Paired<String, String>("", "");
		pair.setKey("1");
        pair.setValue("Welcome");
        System.out.println(pair.toString());
    	//Second Object
		Paired<String,String> pair1=new Paired<String,String>("","");
		pair1.setKey("2");
		pair1.setValue("We all are software developer");
		System.out.println(pair1.toString());
		
		//Creation of object 3rd time
		Paired<String, String> pair2=new Paired<String, String>("", "");
		pair2.setKey("This is");
		pair2.setValue("JSF Training batch");
		System.out.println(pair2.toString());
	}
	
	@Override
	public String toString() {
		return "Paired [Key=" + key + ", Value=" + value + "]";
	}
	
	

}
