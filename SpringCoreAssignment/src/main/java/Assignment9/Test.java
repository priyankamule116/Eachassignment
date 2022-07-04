package Assignment9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        context.registerShutdownHook();

        BeanLifeCycleDemo beanLifeCycle=(BeanLifeCycleDemo)context.getBean("LifeCycle");
        beanLifeCycle.display();
    }
}h
