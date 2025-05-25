package com.spring.resources;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.beans.Address;
import com.spring.beans.Student;
import com.spring.beans.Subjects;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddressObj() {
		Address addr = new Address();
		
		//setting values
		addr.setHouseNo(205);
		addr.setStreetName("Vijay Chowk");
		addr.setCity("Mumbai");
		addr.setPincode(400101);
		
		return addr;
	}
	
	@Bean
	public Subjects createSubjectsObj() {
		Subjects sub = new Subjects();
		
		//create a list to be passed in the Subject class
		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("Java");
		subjects_list.add("C/C++");
		subjects_list.add("Python");
		subjects_list.add("UI");
		
		sub.setSubjects(subjects_list);
		return sub;
	}
	
	@Bean
	public Student createSudentObj() {
		Student stud = new Student();
		
		//Setting Values
		stud.setName("Sandy");
		stud.setRollno(101);
		//stud.setSubjects(createSubjectsObj());  //manually DI
		return stud;
	}

}
