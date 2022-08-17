package com.app.SpringCoreDi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("com/app/SpringCoreDI/SpringConfig.xml");
		Employee employee = (Employee) appContext.getBean("emp");
		System.out.println(employee);
		Hospital hospital = (Hospital) appContext.getBean("hospital");
		System.out.println(hospital);
		CarDealer card=(CarDealer) appContext.getBean("CarDealer");
		System.out.println(card);
		Customer cus=(Customer) appContext.getBean("Customer");
		System.out.println(cus);
	}
}
