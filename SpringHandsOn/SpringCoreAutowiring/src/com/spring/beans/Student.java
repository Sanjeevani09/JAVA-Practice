package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	private int rollno;
	
	@Autowired
	@Qualifier("createAddressObj2")
	private Address address;
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
	
	//No need of setter and getter for the class that is getting injected via Autowiring
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	public void display() {
		System.out.println("Name : " +name);
		System.out.println("Roll no : " + rollno);
		System.out.println(address);
	}
	
}
