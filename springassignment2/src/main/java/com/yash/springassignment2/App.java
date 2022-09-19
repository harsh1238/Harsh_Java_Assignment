package com.yash.springassignment2;

import com.yash.springassignment2.PrintMessage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		PrintMessage obj = context.getBean(PrintMessage.class);
		obj.message();
		context.close();
    }
}
