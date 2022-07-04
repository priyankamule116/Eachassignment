package Assignment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContextAwareExample contextAwareExample = (ApplicationContextAwareExample) context.getBean("contextAware");
        contextAwareExample.display();

        ApplicationContextAwareExample contextAwareExample1 = (ApplicationContextAwareExample) context.getBean("contextAware1");
        contextAwareExample1.display();
    }
}
