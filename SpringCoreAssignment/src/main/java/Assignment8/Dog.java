package Assignment8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dog implements InitializingBean,DisposableBean  {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(getName()+" is eating.");
    }


    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing the dog bean");
    }

    public void destroy() throws Exception {
        System.out.println("Destroy method is called");
    }

    // Called using init-method and destroy-method
    public void myInit(){
        System.out.println("Dog bean created using init-method");
    }

    public  void  myDest(){
        System.out.println("Object is destroyed using destroy-method");
    }

    // uses of annontation which performs the same operations as above two methods i.e
    // implementing methods or configuring XML file.
    @PostConstruct
    public void postConstruct(){
        System.out.println("using annontation init called");
    }

    @PreDestroy
    public  void  preDestroy(){
        System.out.println("destroy called using preDestroy annotation");
    }
}