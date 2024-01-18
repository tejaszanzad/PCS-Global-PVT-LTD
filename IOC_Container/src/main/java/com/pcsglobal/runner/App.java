package com.pcsglobal.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pcsglobal.pojo.Employee;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appConfig.xml");
		Employee e1 = (Employee) appContext.getBean("e1");

		System.out.println(e1.getFirstName() + " " + e1.getLastName() + ", " + e1.getAddress().getCity() + " "
				+ e1.getAddress().getState() + " " + e1.getAddress().getCountry());

	}

}
