package com.app.SpringLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("com/app/SpringLifeCycle/SpringConfig.xml");

    Patients pat=(Patients) appContext.getBean("patient");
		System.out.println(pat);

}
}
