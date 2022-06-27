package com.capgemini.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target({ElementType.TYPE, ElementType.METHOD ,ElementType.FIELD})
@interface Info {
	int AuthorID() default 123;
	String Author() default "Pranab";
	int Date() default 10 / 11 / 2021;
	int Time() default 9;
	int Version() default 10;
}
@Info
public class CustmoAnnotationQue2 {
	@Info
	String Name;
	
	@Info
	public void method2(String Author) {
		this.Name = Author;
		System.out.println(Author);
	}
	public static void main(String[] args) {
		CustmoAnnotationQue2 ca = new CustmoAnnotationQue2();
	
		ca.method2("Ganesh");
	}
}