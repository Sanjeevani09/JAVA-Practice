package com.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//POJO Class of project 
//Anno ke sath bhi hume yaa toh xml yaa java file bana na h

@Component
public class Student {
	
	@Value("Sandy")
	private String name;
	@Value("101")
	private int rollno;
	@Value("94.59")
	private double marks;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name : " +name);
		System.out.println("RollNo : "+rollno);
		System.out.println("Marks : " +marks);
	}

}

//Name : null
//RollNo : 0  
//Marks : 0.0  1st op will be null s humne values det mnhi kiye h hum values set karenge  useing "@Value" anno
