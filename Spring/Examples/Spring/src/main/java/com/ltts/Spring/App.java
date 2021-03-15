package com.ltts.Spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
    	Student s= (Student) context.getBean("studentbean");
    	System.out.println(s);
    	
    }
}
