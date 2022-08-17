package com.app.ShoppingCart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/app/ShoppingCart/SpringConfig.xml");
		ShoppingCart sc=(ShoppingCart) appContext.getBean("ShoppingCart");
		System.out.println(sc);
	}

}
