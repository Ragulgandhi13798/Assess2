package com.springcoreeg.springconst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcoreeg/springconst/conf1.xml");
         Employeecons s = (Employeecons) context.getBean("em");
         System.out.println(s);
    }
}
