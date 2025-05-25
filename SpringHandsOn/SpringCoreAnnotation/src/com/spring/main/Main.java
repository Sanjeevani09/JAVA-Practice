package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Student;
import com.spring.resources.SpringConfigFile;

public class Main {
	
	public static void main(String[] args) {
		
		//Via xml
//		String path_loc = "/com/spring/resources/applicationContext.xml";
//		ApplicationContext app = new ClassPathXmlApplicationContext(path_loc);
//		
//		Student stud = (Student) app.getBean("student");
//		stud.display();
		
		//Via java configuration
		ApplicationContext app2 = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student stud2 = (Student) app2.getBean("student");
		stud2.display();
	}

}
