package com.yash.springassignment1;
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
		Employee obj = context.getBean(Employee.class);
		obj.employee("y001","Yash", "Trainee");
		context.close();
    }
}
