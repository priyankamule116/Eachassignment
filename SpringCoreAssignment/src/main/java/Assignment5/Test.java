package Assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

      
        Student studentRequired = (Student)context.getBean("studentRequired");
        studentRequired.getStudentDetails();


        
        Student studentResource = (Student)context.getBean("studentResource");
        studentResource.getStudentDetailsUsingResource();


    }
}
