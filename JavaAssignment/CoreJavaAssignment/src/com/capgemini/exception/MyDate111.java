package com.capgemini.exception;

public class MyDate111 {
    
	int dd, mm, yy;
	public MyDate111()
	{
		dd=mm=yy=0;
	}
	public void MyDate11(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
		
	}
	void display()
	{
		System.out.println("dd:"+dd);
		System.out.println("mm:"+mm);
		System.out.println("yy:"+yy);
	}

	public static void main(String[] args) 
	{
		MyDate111 d1= new MyDate111();
		MyDate111 d2=new MyDate111();
		d1.display();
		d2.display();
		
	}
}
