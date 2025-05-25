package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.Student;
import com.spring.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student student = (Student) app.getBean(Student.class);  //calling via class
		student.display();
	}

}
