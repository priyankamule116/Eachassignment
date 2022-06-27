package com.capgemini.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Annotation it is doesn't have any variable is called marker
//The annotation is have only one value is called single value annotation.
//The annotation is have more than one value is called multi value annotation.

//MetaAnnotation
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{

	String os() default "display";
	int version() default 1;
}
@SmartPhone(os="Android",version=8)
class NokiaSeries{
	String model;
	int size;
	
	public NokiaSeries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
	
}

public class AnnotationDemo {

	public static void main(String[] args) {
		NokiaSeries obj=new NokiaSeries("Fire", 5);
		
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		System.out.println(s.os());
		

	}

}
