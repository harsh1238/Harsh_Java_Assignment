package com.yash.springioc.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/***
 * @author harshavardhan.patil
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
	Employee e=context.getBean("emp",Employee.class);
	// data print on console
	System.out.println(e);
  }
}
