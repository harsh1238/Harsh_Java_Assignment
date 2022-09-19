package com.yash.springassignment3;

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
        Shape obj=context.getBean(Shape.class);
        obj.draw();
        context.close();
    }
}
