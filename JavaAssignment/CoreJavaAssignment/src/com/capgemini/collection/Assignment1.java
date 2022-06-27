package com.capgemini.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
 * ERROE-->cannot invoke comparator(int(OR)long) on the primitive type long
 * SOLUTION-> Change long->Long,int->Integer(Use WRAPPER CLASSES).
 */
class Contact
{
	private long phonenumber;
	private String name;
	private String email;
	
	//Rectify this again with ENUM
	private String gender;
	
	//Parameritized constructor
	public Contact(long phonenumber, String name, String email, String gender) {
		super();
		this.phonenumber = phonenumber;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	//default Contsructor
	public Contact()
	{
		
	}


	//Getters and Setters
	public Long getPhonenumber() {
		return phonenumber;
		//just have the change primitive type is long should be changed to Long(Wrapper class)
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//ToString method which will point from getters and setters
	@Override
	public String toString() {
		return "Contact [phonenumber=" + phonenumber + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ "]";
	}
	
}
class Test implements Comparator<Contact>
{
	public int compare(Contact c1,Contact c2)
	{
		return c2.getPhonenumber().compareTo(c1.getPhonenumber());
	}
}
public class Assignment1 {

	//private static final Function Long = null;
	public static void main(String[] args) {
		TreeMap<Contact,Long> tm=new TreeMap<>(new Test());
		tm.put(new Contact(12345665,"Ganesh","ganesh@gmail.com","male"),(long) 1);
		tm.put(new Contact(87965467,"Chetan","chetan@gmail.com","male"),(long) 2);
		tm.put(new Contact(98765432,"Saurabh","saurabh@gmail.com","male"),(long) 3);
		tm.put(new Contact(90876789,"Anuska","anuska@***gmail.com","female"),(long)4);
		for(Map.Entry<Contact,Long> entry:tm.entrySet())
		{
			System.out.println("Key : "+entry.getKey()+" "+"Value : "+entry.getValue());
		}
	}

}




