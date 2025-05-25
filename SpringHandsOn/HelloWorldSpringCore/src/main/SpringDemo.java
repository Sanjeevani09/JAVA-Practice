package main;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class SpringDemo {
	
	public static void main(String[] args) {
		//find xml
//		Resource r = new ClassPathResource("resources/context.xml");
		
		//load xml in container
//		BeanFactory fact = new XmlBeanFactory(r);
		
		ApplicationContext app = new ClassPathXmlApplicationContext("resources/context.xml");
		
		//create test class object
//		Object o = fact.getBean("t");
//		Test t = (Test) o;
		
		Test t = (Test)app.getBean("t");
		t.hello();
	}
	
	
}
