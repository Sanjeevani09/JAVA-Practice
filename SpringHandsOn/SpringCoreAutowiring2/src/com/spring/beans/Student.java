package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String name;
	private int rollno;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Subjects subjects;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	//manual DI
//	public Subjects getSubjects() {
//		return subjects;
//	}
//	public void setSubjects(Subjects subjects) {
//		this.subjects = subjects;
//	}
	public void display() {
		System.out.println("Name : " +name);
		System.out.println("Roll no : " + rollno);
		System.out.println(address);
		System.out.println(subjects);
	}
	
}
